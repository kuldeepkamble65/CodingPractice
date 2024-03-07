package BankApplication;

import java.util.Scanner;

public class Loan {
    private double loanAmount;
    private double interestRate;

    public Loan(double loanAmount, double interestRate) {
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }
    public double calculatePayableAmount(int loanDuration) {
        double totalInterest = (loanAmount * interestRate * loanDuration) / 100;
        return loanAmount + totalInterest;
    }
        public static void displayLoanDetails(Loan loan) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the loan duration (in years): ");
            int loanDuration = scanner.nextInt();

            double totalPayment = loan.calculatePayableAmount(loanDuration);

            System.out.println("Loan details:");
            System.out.println("Loan Type: " + loan.getClass().getSimpleName());
            System.out.println("Loan Amount: $" + loan.getLoanAmount());
            System.out.println("Interest Rate: " + loan.getInterestRate() + "%");
            System.out.println("Loan Duration: " + loanDuration + " years");
            System.out.println("Total Payment: $" + totalPayment);

            scanner.close();
        }




    }

