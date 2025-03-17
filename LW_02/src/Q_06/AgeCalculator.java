package Q_06;

import java.util.Scanner;
import java.time.Year;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int birthYear = input.nextInt();

        int currentYear = Year.now().getValue();
        int age = currentYear - birthYear;

        System.out.println("You were born in " + birthYear + " and will be (are) " + age + " this year.");
        input.close();
    }
}