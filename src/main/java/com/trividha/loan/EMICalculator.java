package com.trividha.loan;

public class EMICalculator {
    public static double calculateEMI(double principal, double rate, int tenure) {
        double monthlyRate = rate / (12 * 100);
        return (principal * monthlyRate * Math.pow(1 + monthlyRate, tenure)) / 
               (Math.pow(1 + monthlyRate, tenure) - 1);
    }
    
    public static void main(String[] args) {
        double emi = calculateEMI(500000, 7.5, 240);
        System.out.printf("EMI: ₹%.2f%n", emi);
    }
}
