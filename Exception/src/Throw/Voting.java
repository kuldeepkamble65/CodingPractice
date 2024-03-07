package Throw;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) throws YoungerAgeException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();
        if(age<18){
            throw  new YoungerAgeException("You are not eligible for voitng");
        }else{
            System.out.println("you can vote Successfully");
        }
    }
}
