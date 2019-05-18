package com.nazaron.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

public class Runner {

    protected SoftAssert softAssert;

    @BeforeClass
    public void setUp() {
        softAssert = new SoftAssert();
    }

    @AfterClass
    public void tearDown() {
        softAssert.assertAll();
    }
}
