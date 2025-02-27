package Q11;

import java.util.Scanner;

public class NameFormatter {
    public static void main(String[] args) {
        Scanner text;
        text = new Scanner(System.in);

        System.out.print("Enter your full name (first middle last): ");
        String fullName = text.nextLine();


        String[] parts = fullName.split(" ");


        if (parts.length != 3) {
            System.out.println("Please enter your name in the format: first middle last.");
        } else {
            String first = parts[0];
            String middle = parts[1];
            String last = parts[2];


            String formattedName = last + ", " + first + " " + middle.charAt(0) + ".";
            System.out.println(formattedName);
        }
    }
}
