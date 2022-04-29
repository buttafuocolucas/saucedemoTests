package org.example.LoginTests;

import org.example.BaseTests;
import org.example.Pages.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class LogoutTest extends BaseTests {

    @Test
    public void logOut() throws InterruptedException {
        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_sauce");
        ProductPage productPage = loginPage.clickLoginButton();
        productPage.clickOnMenu();
        productPage.clickOnLogOut(); //The error is because the next action is not possible, the click happens before the item is clickable.
        assertEquals(loginPage.getPasswordForAllUsersText(),"Password for all users:", "Incorrect message"); //Assert just to know if the test passes or not.
    }
}
