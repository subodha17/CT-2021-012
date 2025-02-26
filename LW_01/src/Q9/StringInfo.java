package Q9;

import java.util.Scanner;

public class StringInfo {
    public static void main(String[] args) {
        Scanner text;
        text = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = text.nextLine();

        int length = input.length();
        char firstChar = input.charAt(0);
        char lastChar = input.charAt(length - 1);

        System.out.println(length);
        System.out.println(firstChar);
        System.out.println(lastChar);
    }
}
