package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    private WebDriver driver;

    private By cartItemQuantity = By.className("cart_item");


    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getCartQuantity(){
        return driver.findElement(cartItemQuantity).getText();
    }
}
