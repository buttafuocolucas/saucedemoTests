package org.example.LoginTests;

import org.example.BaseTests;
import org.example.Pages.ProductPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginWithWrongCredentials extends BaseTests {

    @Test
    public void wrongCredential(){
        loginPage.setUsername("sdfsdf");
        loginPage.setPassword("sdfsds");
        ProductPage productPage = loginPage.clickLoginButton();
        assertEquals(loginPage.getErrorMessage(),"Epic sadface: Username and password do not match any user in this service","Incorrect message");
    }
}
