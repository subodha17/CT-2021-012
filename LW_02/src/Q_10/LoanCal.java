package Q_10;

import java.util.Scanner;

public class LoanCal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int MONTHS_IN_YEAR = 12;

        System.out.print("Enter loan amount: $");
        double loanAmount = input.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter loan period (years): ");
        int loanPeriod = input.nextInt();

        double monthlyInterestRate = annualInterestRate/100.0/MONTHS_IN_YEAR;
        int numberOfPayments = loanPeriod * MONTHS_IN_YEAR;

        double monthlyPayment = (loanAmount * monthlyInterestRate) /
                (1 - Math.pow(1/(1 + monthlyInterestRate), numberOfPayments));

        double totalPayment = monthlyPayment * numberOfPayments;

        System.out.printf("Monthly payment: $%.2f\n", monthlyPayment);
        System.out.printf("Total payment: $%.2f\n", totalPayment);
        System.out.printf("Total interest: $%.2f", (totalPayment - loanAmount));
        input.close();
    }
}