package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage {

    private WebDriver driver;
    private By menuButton = By.id("react-burger-menu-btn");
    private By logOutButton = By.id("logout_sidebar_link");

    private By cartButton = By.className("shopping_cart_link");
    private By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");

    public ProductPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnMenu(){
        driver.findElement(menuButton).click();
    }

    public LoginPage clickOnLogOut(){
        driver.findElement(logOutButton).click();
        return new LoginPage(driver);
    }

    public int getNumberOfProducts(){
        List<WebElement> elements = driver.findElements(By.className("inventory_item"));
        return elements.size();
    }

    public void clickOnAddToCart(){
        driver.findElement(addToCartButton).click();
    }

    public CartPage clickOnCart(){
        driver.findElement(addToCartButton);
        return new CartPage(driver);
    }


}
