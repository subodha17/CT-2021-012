package Q_03;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = (1.8 * celsius) + 32;

        System.out.printf("%.2f°C is equal to %.2f°F", celsius, fahrenheit);
        input.close();
    }
}
