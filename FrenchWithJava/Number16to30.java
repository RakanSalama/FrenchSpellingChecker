package FrenchWithJava;

import java.util.Scanner;

public class Number16to30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = { 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30 };
        String[] letters = { "seize", "dix-sept", "dix-huit", "dix-neuf", "vingt", "vingt-et-un", "vingt-deux",
                "vingt-trois", "vingt-quatre", "vingt-cinq", "vingt-six", "vingt-sept", "vingt-huit", "vingt-neuf",
                "trente" };
        String Spelling;
        System.out.println("== Numbers 16 To 30 ==");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("How do we type [" + numbers[i] + "] in frnech? ");
            Spelling = in.next();
            while (true) {
                if (Spelling.equalsIgnoreCase(letters[i])) {
                    System.out.println("That's correct  :)");
                    break;
                } else {
                    System.out.println("That's wrong! Try again");
                    Spelling = in.next();
                }
            }
            System.out.println();
        }
        System.out.println("Well done ^^");
    }
}
