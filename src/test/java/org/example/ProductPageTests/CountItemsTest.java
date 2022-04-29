package org.example.ProductPageTests;

import org.example.BaseTests;

import org.example.Pages.ProductPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CountItemsTest extends BaseTests {

    @Test
    public void countItemsTest(){
        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_sauce");
        ProductPage productPage = loginPage.clickLoginButton();
        assertEquals(productPage.getNumberOfProducts(),6,"Incorrect number of items");
    }
}
