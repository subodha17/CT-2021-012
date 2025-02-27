package Q6;

import javax.swing.*;
import java.util.Scanner;

public class CustomFrame {
    public static void main(String[] args) {
        Scanner text;
        text = new Scanner(System.in);

        System.out.print("Enter the width (W) of the frame: ");
        int width = text.nextInt();

        System.out.print("Enter the height (H) of the frame: ");
        int height = text.nextInt();

        text.nextLine();

        System.out.print("Enter the title of the frame: ");
        String title = text.nextLine();

        JFrame frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setVisible(true);
    }
}
