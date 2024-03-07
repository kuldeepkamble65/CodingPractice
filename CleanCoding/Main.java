import Coding.Operations;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("**********************************************************");
        System.out.println("1- Check if String is palindrome or not");
        System.out.println("2- Check a Leap Year");
        System.out.println("3- Check if Two String are anagram");
        System.out.println("4- Exit");

        System.out.println("--------------Select a choice for performing mentioned Operation---------------");

        int choice = sc.nextInt(); //the newline character

        sc.nextLine();
        Operations operations =new Operations();
        switch (choice) {
            case 1:
                System.out.println("Enter a string to check if it's a palindrome:");
                String str = sc.nextLine();
                operations.isPalindrome(str);
                break;

            case 2:
                System.out.println("Enter a year to check if it's a leap year:");
                int year = sc.nextInt();
                operations.isLeapYear(year);
                break;

            case 3:
                System.out.println("Enter the first string:");
                String str1 = sc.nextLine();
                System.out.println("Enter the second string:");
                String str2 = sc.nextLine();

                if (operations.areAnagrams(str1, str2)) {
                    System.out.println("The two strings are anagrams.");
                } else {
                    System.out.println("The two strings are not anagrams.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }

    }
}