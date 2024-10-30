package questao1;

public class Questao1 {
    public static void main(String[] args) {

        int index = 13, sum = 0, k = 0;

        do {

            k++;
            sum = sum + k;

        } while (k < index);

        System.out.println("Result: " + sum);


    }
}
