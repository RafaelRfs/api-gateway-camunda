package com.app.rfs.camunda.api_gateway.constants;

public final class Assets {
    public static final String APPLICATION_NAME = "Api Gradle Posts";
    public static final String VERSION_ROUTE = "/v1";
    public static final String GENRES_ROUTE = "/genres";
    public static final String SUB_GENRES_ROUTE = "/subgen";
    public static final String COMMENTS_ROUTE = "/comments";
    public static final String CEP_ROUTE = "/cep";
    public static final String POSTS_ROUTE = "/posts";
    public static final String IMAGES_ROUTE = "/images";
    public static final String TIME_ROUTE = "/time";
    public static final String TIME_COMPLETE_ROUTE = VERSION_ROUTE + TIME_ROUTE;
    public static final String SUB_GENRES_COMPLETE_ROUTE = VERSION_ROUTE + SUB_GENRES_ROUTE;
    public static final String GENRES_COMPLETE_ROUTE = VERSION_ROUTE + GENRES_ROUTE;
    public static final String POSTS_COMPLETE_ROUTE = VERSION_ROUTE + POSTS_ROUTE;
    public static final String COMMENTS_COMPLETE_ROUTE = VERSION_ROUTE + COMMENTS_ROUTE;
    public static final String CEP_COMPLETE_ROUTE = VERSION_ROUTE + CEP_ROUTE;
    public static final String IMAGES_COMPLETE_ROUTE = VERSION_ROUTE + IMAGES_ROUTE;
    public static final String THINGS_ROUTE = "/things";
    public static final String THING_COMPLETE_ROUTE = VERSION_ROUTE + THINGS_ROUTE;
    public static final String QUESTIONS_ROUTE = "/questions";
    public static final String QUESTIONS_COMPLETE_ROUTE = VERSION_ROUTE + QUESTIONS_ROUTE;
    public static final String API_LOGIN = "https://serene-sea-70010.herokuapp.com/";
    public static final String API_VERIFY = API_LOGIN+"v1/login/auth";
    public static final String ENV_DATABASE_URL = "DATABASE_URL";
    public static final String ENV_DATABASE_URL_LOCAL = "mysql://root@127.0.0.1:3306/teste";
    public static final String MYSQL_NAME_STRING = "mysql";
    public static final String POSTGRESQL_NAME_STRING = "postgresql";
    public static final String ERROR_MSG_GENRES_NAME = "Digite um nome de genero valido!";
    public static final String ERROR_MSG_SUB_GENRES_NAME = "Digite um nome de sub genero valido!";
    public static final String ERROR_MSG_GENRES_NOT_FOUND = "Genero não encontrado!";
    public static final String ERROR_MSG_SUB_GENRES_NOT_FOUND = "SubGenero não encontrado!";
    public static final String ERROR_MSG_GENRES_NAME_FOUND = "Genero já existente!";
    public static final String ERROR_MSG_SUB_GENRES_NAME_FOUND = "SubGenero já existente!";
    public static final String ERROR_MSG_GENRES_DELETED_FOUND = "Genero não existente !";
    public static final String API_TOKEN = "SECRET_KEY";
    public static final String API_TOKEN_DATA = API_LOGIN + "token/data";
    public  static final String TOKENS_DIRECTORY_PATH = "tokens";
    public static final String CREDENTIALS_FILE_PATH = "/certs/credentials.json";
    public static final String CLIENT_ID = "x-rfs-prod-clientId";
    public static final String CLIENT_SECRET = "x-rfs-prod-clientSecret";
    public static final String TIPO = "tipo";
    public static final String NOME = "nome";
    public static final String ID = "id";
    public static final String SOBRENOME = "sobrenome";
    public static final String DELIMITER_TOKEN = "|==>";
    public static final String ERROR_MSG = " Erro :";

    private Assets(){}


}
