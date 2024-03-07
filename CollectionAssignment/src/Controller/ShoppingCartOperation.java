package Controller;

import Entity.CartItem;
import Service.ShoppingCartMain;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShoppingCartOperation {

    private Map<Long, CartItem> map = new HashMap<>();
    private Map<String, Double> priceMap = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    public void addItem(CartItem item) {
        Long id = IdGeneration.generateProductId(getClass().getSimpleName());
        map.put(id, item);
    }

    public void removeItem(long id) {
        if (map.containsKey(id)) {
            map.remove(id);
            System.out.println("Product with ID " + id + " removed from the cart.");
        } else {
            System.out.println("Product with ID " + id + " not found in the cart.");
        }
    }

    public void displayDetails() {
        System.out.println("Shopping Cart Contents:");
        for (Map.Entry<Long, CartItem> entry : map.entrySet()) {
            Long productId = entry.getKey();
            CartItem item = entry.getValue();
            System.out.println("Product ID: " + productId);
            System.out.println("Name: " + item.getName());
            System.out.println("Price: " + item.getPrice());
            System.out.println("Quantity: " + item.getQuantity());
            System.out.println();
        }
    }

    public double calculateTotalCost() {
        double totalCost = 0.0;
        for (CartItem item : map.values()) {
            totalCost += item.getPrice() * item.getQuantity();
        }
        return totalCost;
    }
    public void updateQuantity(long id, int newQuantity) {
        if (map.containsKey(id)) {
            CartItem item = map.get(id);
            item.setQuantity(newQuantity);
            System.out.println("Quantity updated for product with ID " + id);
        } else {
            System.out.println("Product with ID " + id + " not found in the cart.");
        }
    }
    public void checkQuntity(){

    }
}


