package Assign11;

import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seleclt a choice for performing mentioned Operation");
        System.out.println("1- Check if String is palindrome or not");
        System.out.println("2- Check a Leap Year");
        System.out.println("3- Check if Two String are anagram");
        System.out.println("Exit");

        int choice = sc.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Enter a string to check if it's a palindrome:");
                String str = scanner.nextLine();
                if (isPalindrome(str)) {
                    System.out.println("The string is a palindrome.");
                } else {
                    System.out.println("The string is not a palindrome.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }

        public static boolean isPalindrome(String str) {
            StringBuilder sb = new StringBuilder(str);
            sb.reverse();
            return str.equals(sb.toString());
        }

    }
}