package Q10;

import java.util.Scanner;

public class MiddleChar {
    public static void main(String[] args) {
        Scanner text;
        text = new Scanner(System.in);

        System.out.print("Enter an odd-length word: ");
        String word = text.nextLine();

        if (word.length() % 2 == 1) {
            int middleIndex = word.length() / 2;
            char middleChar = word.charAt(middleIndex);
            System.out.println(middleChar);
        } else {
            System.out.println("The word is not of odd length.");
        }
    }
}
