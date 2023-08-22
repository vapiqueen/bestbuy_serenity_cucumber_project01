package com.bestbuy.testsuite;

import com.bestbuy.info.ProductSteps;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;

public class ProductDataDrivenTest {
    private String name;
    private String type;
    private int price;
    private int shipping;
    private String upc;
    private String description;
    private String manufacturer;
    private String model;
    private String url;
    private String image;
    @Steps
    ProductSteps productSteps;
    @Title("Data driven test for adding multiple product to the application")
    @Test
    public void createMultipleProducts() {
        productSteps.createProduct(name,type,price,shipping,upc,description,manufacturer,model,url,image).statusCode(201);
    }
}
