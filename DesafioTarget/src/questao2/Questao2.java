package questao2;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {

        ArrayList<Integer> sequence = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int a = 0, b = 1, i = 0, result;

        System.out.println("Enter a number: ");

        int number = sc.nextInt();

        sequence.add(a);
        sequence.add(b);

        while (i < number) {

            result = a + b;

            a = b;

            b = result;

            sequence.add(result);

            i++;


        }

        System.out.println("Fibonacci sequence: " + sequence);

        if(sequence.contains(number)){
            System.out.printf("( %d ) belongs to the fibonacci sequence.", number);
        } else {
            System.out.printf("( %d ) does not belongs to the fibonacci sequence.", number);
        }

        sc.close();


    }
}
