package com.bestbuy.testsuite;

import com.bestbuy.info.StoreSteps;
import com.bestbuy.model.StorePojo;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;

public class StoreDataDrivenTest {
    private String name;
    private String type;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zip;
    private int lat;
    private int lng;
    private String hours;

    private StorePojo.Services services;


    @Steps
    StoreSteps storeSteps;
    @Title("Data driven test for adding multiple store to the application")
    @Test
    public void test001() {
        storeSteps.createStore(name, type, address,address2, city, state, zip, lat, lng, hours,services).statusCode(201);
    }
}
