package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By message = By.tagName("h3");

    private By passwordHeader = By.cssSelector("div>.login_password");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public ProductPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new ProductPage(driver);
    }

    public String getErrorMessage(){
        return driver.findElement(message).getText();
    }

    public String getPasswordForAllUsersText(){
        return driver.findElement(passwordHeader).getText();
    }
}
