package collectionsproblemstest.mapinterfacetest.shoppingcarttest;

import collectionsproblem.mapinterfaceproblems.shoppingcart.ShoppingCart;
import org.junit.Assert;
import org.junit.Test;

public class ShoppingTest {
    @Test
    public void Tester(){
        ShoppingCart cart = new ShoppingCart();

        // Adding products with prices
        cart.addProduct("Laptop", 1000.0);
        cart.addProduct("Mouse", 25.0);
        cart.addProduct("Keyboard", 50.0);
        cart.addProduct("Monitor", 200.0);

        // Adding items to cart
        cart.addToCart("Laptop");
        cart.addToCart("Mouse");
        cart.addToCart("Keyboard");
        cart.addToCart("Monitor");

        // Display results
        cart.displayCart();
        cart.displaySortedCart();
        Assert.assertEquals("Mouse",cart.firstValue());
    }
}
