FROM openjdk:11.0.7-jre-slim-buster

WORKDIR app/

RUN mvn install

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar", "/app.jar"]