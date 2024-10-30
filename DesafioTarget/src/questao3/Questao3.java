package questao3;

public class Questao3 {

    public static void main(String[] args) {

        int j = 0;
        double sum = 0, highest, lowest, count = 0;

        // 9 dias nao houveram faturamento, portanto, calculo da media: somatorio/21 dias

        // optei por colocar o menor faturamento != 0, sendo assim, podemos analisar de forma mais precisa o menor valor mensal.

        double[] dailyBilling = {
                22174.1664, 24537.6698, 26139.6134, 0.0, 0.0,
                26742.6612, 0.0, 42889.2258, 46251.174, 11191.4722,
                0.0, 0.0, 3847.4823, 373.7838, 2659.7563,
                48924.2448, 18419.2614, 0.0, 0.0, 35240.1826,
                43829.1667, 18235.6852, 4355.0662, 13327.1025, 0.0,
                0.0, 25681.8318, 1718.1221, 13220.495, 8414.61
        };

        highest = dailyBilling[0];
        lowest = dailyBilling[0];

        for (int i = 0; i < dailyBilling.length; i++) {

            if (dailyBilling[i] > highest) {
                highest = dailyBilling[i];
            }

            if (dailyBilling[i] < lowest && dailyBilling[i] != 0) {
                lowest = dailyBilling[i];
            }

            sum = sum + dailyBilling[i];

            if (dailyBilling[i] != 0) {
                j++;
            }

        }

        double mean = sum / j;
        System.out.printf("Mean: R$ %.2f\n", mean);


        for (int k = 0; k < dailyBilling.length; k++) {
            if (dailyBilling[k] > mean) {
                count++;
            }
        }

        System.out.printf("Highest monthly value: R$ %.2f\n", highest);
        System.out.printf("Lowest monthly value: R$ %.2f\n", lowest);
        System.out.printf("Number of days that daily billing was highest than monthly mean: %.0f", count);


    }
}
