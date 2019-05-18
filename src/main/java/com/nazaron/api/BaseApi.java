package com.nazaron.api;

import com.jayway.restassured.RestAssured;

public class BaseApi {

    protected String baseURL = "http://localhost:8080/";

    public static int STATUS_OK = 200;
    public static int STATUS_NOT_FOUND = 400;

    BaseApi(){
        RestAssured.baseURI = baseURL;
    }
}