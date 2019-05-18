package com.nazaron.tests;

import com.jayway.restassured.response.Response;
import com.nazaron.api.SimpleRequest;
import org.testng.annotations.Test;

import static com.nazaron.api.BaseApi.STATUS_OK;


public class FirstSuccessTest extends Runner {

    @Test
    public void simpleTest() {
        SimpleRequest simpleRequest = new SimpleRequest();

        String param = "Hello World";

        Response response = simpleRequest.simpleMethod(param);
        softAssert.assertEquals(response.statusCode(), STATUS_OK);

        softAssert.assertTrue(response.body().asString().contains(param));
    }
}
