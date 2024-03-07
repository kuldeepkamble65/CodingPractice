package Service;

import Controller.ShoppingCartOperation;
import Entity.CartItem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShoppingCartMain {
    public static void main(String[] args) {
      //  Map<CartItem, Long> cart = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        ShoppingCartOperation shoppingCartOperation =new ShoppingCartOperation();

        System.out.println("Online Shopping");
        int choice = 0;
        do {
            System.out.println("___________________________**_______________________________");
            System.out.println("1. Add Item to the cart" +
                    "\n2. Remove item from cart" +
                    "\n3. Display all item from cart" +
                    "\n4. Calculate Total cost of Items" +
                    "\n5. Update the quantity of items" +
                    "\n0. Exit");
            System.out.println("___________________________**_______________________________");

            System.out.println("Enter your choice");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Add product name");
                    String productName = sc.next();
                    System.out.println("Add product Price");
                    int productPrice = sc.nextInt();
                    System.out.println("Add quantity");
                    int proQuantity = sc.nextInt();
                    CartItem item = new CartItem(productName, productPrice,proQuantity);
                    shoppingCartOperation.addItem(item);
                    System.out.println("Product Added successfully");
                    break;

                case 2:
                    System.out.println("Enter the ID of the product to remove:");
                    long productIdToRemove = sc.nextLong();
                    shoppingCartOperation.removeItem(productIdToRemove);
                    break;

                case 3:
                    shoppingCartOperation.displayDetails();
                    break;

                case 4:
                    double totalCost = shoppingCartOperation.calculateTotalCost();
                    System.out.println("Total Cost of Items in the Shopping Cart: $" + totalCost);
                    break;

                case 5:
                    System.out.println("Enter the ID of the product to update quantity:");
                    long productIdToUpdate = sc.nextLong();
                    System.out.println("Enter the new quantity:");
                    int newQuantity = sc.nextInt();
                    shoppingCartOperation.updateQuantity(productIdToUpdate, newQuantity);
                    break;

                    default:
                    System.out.println("Invalid choice");

            }
        }while (choice != 0) ;
    }
}
