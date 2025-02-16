package collectionsproblem.mapinterfaceproblems.shoppingcart;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ShoppingCart {
    private Map<String, Double> productPrices = new HashMap<>();
    private Map<String, Double> cart = new LinkedHashMap<>();
private TreeMap<Double, String> sortedCart;
    // Method to add a product with price
    public void addProduct(String product, double price) {
        productPrices.put(product, price);
    }

    // Method to add a product to the cart
    public void addToCart(String product) {
        if (productPrices.containsKey(product)) {
            cart.put(product, productPrices.get(product)); // Maintain order of addition
        } else {
            System.out.println("Product not found!");
        }
    }

    // Method to display cart in insertion order (LinkedHashMap)
    public void displayCart() {
        System.out.println("Shopping Cart (Insertion Order):");
        for (Map.Entry<String, Double> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " -> $" + entry.getValue());
        }
    }

    // Method to display cart sorted by price (TreeMap)
    public void displaySortedCart() {
        sortedCart = new TreeMap<>();
        for (Map.Entry<String, Double> entry : cart.entrySet()) {
            sortedCart.put(entry.getValue(), entry.getKey()); // Sort by price
        }

        System.out.println("\nShopping Cart (Sorted by Price):");
        for (Map.Entry<Double, String> entry : sortedCart.entrySet()) {
            System.out.println(entry.getValue() + " -> $" + entry.getKey());
        }
    }
    public String firstValue() {
        return sortedCart.get(sortedCart.firstKey());
    }

}
