package org.example.LoginTests;

import org.example.BaseTests;
import org.example.Pages.LoginPage;
import org.example.Pages.ProductPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTests {


    @Test
    public void testSuccesfullyLogin(){
        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_sauce");
        ProductPage productPage = loginPage.clickLoginButton();
    }


}
