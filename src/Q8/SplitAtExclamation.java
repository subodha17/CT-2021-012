package Q8;

import java.util.Scanner;

public class SplitAtExclamation {
    public static void main(String[] args) {
        Scanner text;
        text = new Scanner(System.in);

        System.out.println("Enter a string with a single exclamation mark:");
        String input = text.nextLine();


        int index = input.indexOf("!");

        if (index != -1) {

            String before = input.substring(0, index).trim();
            String after = input.substring(index + 1).trim();


            System.out.println(before);
            System.out.println(after);
        } else {
            System.out.println("The input does not contain an exclamation mark.");
        }
    }
}
