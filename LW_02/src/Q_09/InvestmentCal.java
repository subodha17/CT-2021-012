package Q_09;

import java.util.Scanner;

public class InvestmentCal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double rate = input.nextDouble();

        System.out.print("Enter number of years: ");
        int years = input.nextInt();

        double finalAmount = principal * Math.pow(1 + (rate/100), years);
        double earnings = finalAmount - principal;

        System.out.printf("After %d years, your investment will grow to $%.2f\n", years, finalAmount);
        System.out.printf("Total earnings: $%.2f", earnings);
        input.close();
    }
}
