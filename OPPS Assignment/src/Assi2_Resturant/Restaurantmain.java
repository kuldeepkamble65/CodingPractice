package Assi2_Resturant;

import java.util.Scanner;

public class Restaurantmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Restaurant");
        Restaurant r1 = new Restaurant();
        int choice = 0;
        do {
            System.out.println("1: Add the item in the cart" +
                    "\n2: Display yout cart" +
                    "\n3: remove item form your cart " +
                    "\n4: Get Average rating of restaurant" +
                    "\n0: Exit");

            System.out.println("Enter yout choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Add item in your cart");
                    sc.nextLine();
                   String itmeName =sc.nextLine();

                    System.out.println("Add items price");
                    double price = sc.nextDouble();
                    System.out.println("Add ratings for your item");
                    int rating = sc.nextInt();
                    r1.addItem(itmeName,price,rating);
                    System.out.println("Items added successfully");
                    break;

                case 2:
                    System.out.println("Display cart items");

                    System.out.println(r1.toString());


                    break;
                case 3:
                    System.out.println("Remove items from your cart" +
                            "\n Enter item name which is to be remove");
                    sc.nextLine();
                    String item= sc.nextLine();
                    r1.removeItem(item);
                    System.out.println("Item removed successfully!!!");
                    break;
                case 4:
                    System.out.println("Get Average rating of our Restaurant");
                    System.out.println(r1.calculateAverageRating());
            }

        }while(choice !=0);
    }



}
