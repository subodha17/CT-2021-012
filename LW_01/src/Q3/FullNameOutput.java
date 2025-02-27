package Q3;

import java.util.Scanner;

public class FullNameOutput {
    public static void main(String[] args) {
        Scanner text;
        text = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = text.nextLine();
        System.out.print("Enter your middle name: ");
        String middleName = text.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = text.nextLine();
        char middleInitial = middleName.charAt(0);
        String fullName = firstName + " " + middleInitial + ". " + lastName;
        System.out.println(fullName);
    }
}
