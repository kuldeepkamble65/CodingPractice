package BankApplication;

import java.util.Scanner;

public class LoanCalculate {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Bank :- ");
        System.out.println("Select a loan type:");
        System.out.println("1. Personal Loan");
        System.out.println("2. Car Loan");
        int choice = scanner.nextInt();
        double loanAmount;

        switch (choice) {
            case 1:
                System.out.print("Enter the personal loan amount: $");
                loanAmount = scanner.nextDouble();
                PersonalLoan personalLoan = new PersonalLoan(loanAmount);
                Loan.displayLoanDetails(personalLoan);
                break;
            case 2:
                System.out.print("Enter the car loan amount: $");
                loanAmount = scanner.nextDouble();
                CarLoan carLoan = new CarLoan(loanAmount);
                Loan.displayLoanDetails(carLoan);
                break;
            default:
                System.out.println("Invalid choice");
        }

        }


    }

