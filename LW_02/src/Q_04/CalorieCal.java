package Q_04;

import java.util.Scanner;

public class CalorieCal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight in pounds: ");
        double weight = input.nextDouble();

        double calories = weight * 19;

        System.out.printf("You need %.2f calories per day", calories);
        input.close();
    }
}
