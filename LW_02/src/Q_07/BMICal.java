package Q_07;

import java.util.Scanner;

public class BMICal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in kilograms: ");
        int weight = input.nextInt();

        System.out.print("Enter height in centimeters: ");
        int height = input.nextInt();

        double bmi = weight / Math.pow(height / 100.0, 2);

        System.out.printf("Your BMI is %.2f", bmi);
        if (bmi >= 20 && bmi <= 25) {
            System.out.println(" (Normal)");
        } else {
            System.out.println();
        }
        input.close();
    }
}
