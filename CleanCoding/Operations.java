package Coding;

import java.util.Scanner;

public class Operations implements OperationInterfce {

    //method to check if a string is a palindrome
    public boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String reversedStr = sb.toString();

        if (str.equals(reversedStr)) {
            System.out.println("The string is a palindrome.");
            return true;
        } else {
            System.out.println("The string is not a palindrome.");
            return false;
        }
    }

    //
    // Method to check if a year is a leap year
    public boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
            return true;
        } else {
            System.out.println(year + " is not a leap year.");
            return false;
        }
    }

    // Method to check if two strings are anagrams
    public boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] count = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }

        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }


        return true;
    }
}



