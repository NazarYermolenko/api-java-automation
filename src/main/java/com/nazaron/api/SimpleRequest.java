package com.nazaron.api;

import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.given;

public class SimpleRequest extends BaseApi {

    public Response simpleMethod(String param) {
        return given().get("/" + param);
    }
}
