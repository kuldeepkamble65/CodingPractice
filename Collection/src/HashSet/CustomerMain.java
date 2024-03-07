package HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class CustomerMain {
    public static void main(String[] args) {
        CustomerFeedbackDetails feedbackDetails = new CustomerFeedbackDetails();
        HashSet<Customer> hashSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Customer details");
        int choice = 0;
        do {
            System.out.println("___________________________**_______________________________");
            System.out.println("1. Add customer feedback" +
                    "\n2. Disply all the details" +
                    "\n3. Retrive the detail by using customer rating" +
                    "\n4. Update the feedback if id & name already exists "+
                    "\n0. Exit");
            System.out.println("___________________________**_______________________________");

            System.out.println("Enter your choice");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    feedbackDetails.addCustomer();
                    break;
                case 2:
                    feedbackDetails.displayCustomerDetails();
                    break;
                case 3:
                    feedbackDetails.retrieveCustomersByRating();
                    break;
                case 4:
                    System.out.println("Enter the Id");
                    int id = sc.nextInt();
                    System.out.println("Enter the name");
                    String name = sc.next();
                    //Customer customer = new Customer();

                    for(Customer c : hashSet){
                       // System.out.println("id and name exists update");
                        if(id == c.getCustomer_id() && name.equals(c.getCustName())){
                            System.out.println("Update The address");
                            String address =sc.next();
                            c.setAddress(address);
                            System.out.println("Update the MobNo");
                            String mobno = sc.next();
                            c.setMobNo(mobno);
                            System.out.println("Update the Rating");
                            int rates = sc.nextInt();
                            c.setRating(rates);
                            System.out.println("Update the feedback");
                            String feedback = sc.next();
                            c.getFeedback();
                            System.out.println("Update details successfully");
                        }else{
                            System.out.println("user not found");
                        }
                    }
                    break;


//                case 4:
//                    System.out.println("Enter the customer id");
//                    int id = sc.nextInt();
//                    for(Customer c : hashSet){
//                        if(id == c.getCustomer_id()){
//                            System.out.println("Enter updated name");
//                            String name = sc.next();
//                            String upName = c.setCustName(name);
//                            System.out.println("Updated name is = "+upName);
  //
                //                      }
    //                }
                    case 0:
                     System.out.println("Eixit successfully");
                    break;

                default:
                    System.out.println("Invalid choice");

            }
        }while (choice != 0) ;
    }


}
