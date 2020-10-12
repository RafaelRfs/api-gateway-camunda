# Build Stage
FROM maven:3.6.0-jdk-11-slim AS build
WORKDIR app/
COPY src /app/src
COPY pom.xml /app
RUN mvn -f /app/pom.xml clean package

 # Deploy Stage
 #Environment Variables Docker image
ARG PORT=8080
ENV API_CLIENT_URL=http://127.0.0.1
ENV API_LOGIN_URL_CREATE=http://127.0.0.1/something
ENV API_CLIENT_ID=user1
ENV API_CLIENT_SECRET=abc123
ENV HEADER_CLIENT_ID=header1
ENV HEADER_CLIENT_SECRET=header123

FROM openjdk:11-jre-slim
COPY --from=build /app/target/api-gateway.jar /usr/local/lib/camunda.jar
EXPOSE ${PORT}
ENTRYPOINT ["java","-jar","/usr/local/lib/camunda.jar"]
