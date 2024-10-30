package questao5;

import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word;

        
        System.out.printf("Enter a word: ");
        word = sc.nextLine();

        int index = word.length() - 1;
        
        System.out.printf("Result: ");

        while (index >= 0) {

            char result = word.charAt(index);
            System.out.printf("%c", result);

            index--;

        }

        sc.close();


    }
}
