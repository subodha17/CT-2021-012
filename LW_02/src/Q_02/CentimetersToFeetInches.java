package Q_02;

import java.util.Scanner;

public class CentimetersToFeetInches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length in centimeters: ");
        double cm = input.nextDouble();

        double inches = cm / 2.54;
        int feet = (int)(inches / 12);
        double remainingInches = inches % 12;

        System.out.printf("%.2f cm is %d feet and %.2f inches", cm, feet, remainingInches);
        input.close();
    }
}