package questao4.application;

import questao4.util.Questao4_Calc;

import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Questao4_Calc calc = new Questao4_Calc();


        double[] percentages = calc.calculatingPercentage();


        String[] estados = {"SP", "RJ", "MG", "ES", "Outros"};


        System.out.println("Percentuais:");
        for (int i = 0; i < percentages.length; i++) {
            System.out.printf("%s: %.2f%%\n", estados[i], percentages[i]);
        }

        sc.close();
    }
}
