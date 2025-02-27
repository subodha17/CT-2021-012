package Q2;

import javax.swing.*;
import java.util.Scanner;

public class FullName {
    public static void main(String[] args) {
        Scanner text;
        text = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = text.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = text.nextLine();

        String fullName = firstName + " " + lastName;

        JFrame frame = new JFrame();
        frame.setTitle(fullName);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }
}
