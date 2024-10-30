package questao4.util;

public class Questao4_Calc {

    public double[] calculatingPercentage() {
        double saoPaulo = 67836.43, rioDeJaneiro = 36678.66, minasGerais = 29229.88, espiritoSanto = 27165.48, outros = 19849.53;

        double total = saoPaulo + rioDeJaneiro + minasGerais + espiritoSanto + outros;

        double[] percentage = new double[5];

        percentage[0] = (saoPaulo/total)*100;
        percentage[1]  = (rioDeJaneiro/total)*100;
        percentage[2]  = (minasGerais/total)*100;
        percentage[3]  = (espiritoSanto/total)*100;
        percentage[4]  = (outros/total)*100;

        return percentage;

    }


}
