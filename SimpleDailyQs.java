import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class SimpleDailyQs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String answer;
        int TotalCorrectQ = 0;
        System.out.println("1-Comment tu t'appelles? | Comment vous vous appelez? | Comment vous-appelez?");
        answer = in.nextLine();

        if (answer.contains("Je m'appelle")) {
            System.out.println("Correct !");
            TotalCorrectQ++;
        } else {
            System.out.println("Wrong :(");
        }
        System.out.println("2-Tu as quel âge? | Vous avez quel âge?");
        answer = in.nextLine();
        if (answer.matches("J'ai .* ans")) {
            System.out.println("Correct !");
            TotalCorrectQ++;
        } else {
            System.out.println("Wrong :(");
        }
        System.out.println("3-Quand êtes vous né? | Vous êtes né Quand?");
        answer = in.nextLine();
        if (answer.contains("Je suis ne le")) {
            System.out.println("Correct !");
            TotalCorrectQ++;
        } else {
            System.out.println("Wrong :(");
        }
        System.out.println("4-Quelle est votre nationalité?");
        answer = in.nextLine();
        if (answer.contains("Je suis")) {
            System.out.println("Correct !");
            TotalCorrectQ++;
        } else {
            System.out.println("Wrong :(");
        }
        System.out.println("5-Vous venez d'où? | D'où venez-vous?");
        answer = in.nextLine();
        if (answer.contains("Je viens de")) {
            System.out.println("Correct !");
            TotalCorrectQ++;
        } else {
            System.out.println("Wrong :(");
        }
        System.out.println("6-Quelle est votre profession? | Qu'est-ce que vous faites dans la vie?");
        answer = in.nextLine();
        if (answer.contains("Je suis")) {
            System.out.println("Correct !");
            TotalCorrectQ++;
        } else {
            System.out.println("Wrong :(");
        }
        System.out.println("7-Vous habitez ou? | Ou habitez-vous?");
        answer = in.nextLine();
        if (answer.contains("J'habite a")) {
            System.out.println("Correct !");
            TotalCorrectQ++;
        } else {
            System.out.println("Wrong :(");
        }
        System.out.println("Your Mark is : "+ TotalCorrectQ +"/7 :)");
    }
}
