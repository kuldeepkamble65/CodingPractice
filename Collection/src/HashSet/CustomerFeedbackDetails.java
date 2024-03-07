package HashSet;

import jdk.jshell.EvalException;

import java.util.HashSet;
import java.util.Scanner;

public class CustomerFeedbackDetails {

    private static final HashSet<Customer> set = new HashSet<Customer>();
    static Scanner sc = new Scanner(System.in);
    public String validateName(String name) {

        if (name.length() < 3) {
            System.out.println("please provide minimum 4 char name");
            validateName(sc.next());
        }
        return name;
    }
    public static void addCustomer() {


        CustomerFeedbackDetails customerFeedbackDetails = new CustomerFeedbackDetails();
        System.out.println("Add customer ID");
        int customer_ID = sc.nextInt();
        System.out.println("Add customer name");
        String customerName = customerFeedbackDetails.validateName(sc.next());
        System.out.println("Add customer address");
        String customerAddress = sc.next();
        System.out.println("Add customer mobile number");
        String customerMobileNo = sc.next();
        System.out.println("Add customer rating");
        int customerRating = sc.nextInt();
        System.out.println("Add customer feedback");
        String customerFeedback = sc.next();

        set.add(new Customer(customer_ID, customerName, customerAddress, customerMobileNo, customerRating, customerFeedback));
        System.out.println("Customer feedback added successfully");
    }
    public static void updateDetsilasIfIdExist(){

    }


    public static void displayCustomerDetails() {
        System.out.println("Details of all the customers");
        for (Customer c : set) {
            System.out.println(c);
        }
    }
    public void updateData(){

    }

    public static void retrieveCustomersByRating() {
        System.out.println("Enter the ratings for which you want customer details");
        int rate = sc.nextInt();
        for (Customer c : set) {
            if (rate == c.getRating()) {
                System.out.println(c);
            }
        }
    }


}
