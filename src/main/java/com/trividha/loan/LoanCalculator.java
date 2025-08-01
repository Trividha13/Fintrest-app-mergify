package com.trividha.loan;

import java.util.Scanner;

public class LoanCalculator {  // Changed from LoanInterestCalculator
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Loan Interest Calculator");
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter rate of interest (per annum): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter loan term in years: ");
        int time = scanner.nextInt();

        System.out.print("Type of interest (simple/compound): ");
        String type = scanner.next();

        double interest;
        if (type.equalsIgnoreCase("simple")) {
            interest = (principal * rate * time) / 100;
        } else {
            interest = principal * Math.pow((1 + rate / 100), time) - principal;
        }

        System.out.printf("Total interest payable: %.2f\n", interest);
        scanner.close();
    }
}
