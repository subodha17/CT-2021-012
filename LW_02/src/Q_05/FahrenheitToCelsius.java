package Q_05;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double celsius = (5.0/9.0) * (fahrenheit - 32);

        System.out.printf("%.2f°F is equal to %.2f°C", fahrenheit, celsius);
        input.close();
    }
}