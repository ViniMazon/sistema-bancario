package model;

public class CalculadorImposto{

    private static double valorImposto;

    public static void calculaImposto(Tributavel valor){

        valorImposto += valor.getValorImposto();

    }

    public static double getValorImposto() {
        return valorImposto;
    }
}
