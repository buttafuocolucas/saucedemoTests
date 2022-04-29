package org.example.ProductPageTests;

import org.example.BaseTests;
import org.example.Pages.CartPage;
import org.example.Pages.ProductPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddToCartTest extends BaseTests {

    @Test
    public void addToCartTest(){
        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_sauce");
        ProductPage productPage = loginPage.clickLoginButton();
        productPage.clickOnAddToCart();
        try {
            productPage.wait(); //Happens the same as in LogOut Test
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        CartPage cartPage = productPage.clickOnCart();
        assertEquals(cartPage.getCartQuantity(),"1","Product was not added to cart");

    }
}
