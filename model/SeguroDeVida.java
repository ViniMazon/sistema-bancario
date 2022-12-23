package model;

public class SeguroDeVida implements Tributavel{

    private static final double IMPOSTO_SEGURO = 42.00;

    @Override
    public double getValorImposto() {
        return IMPOSTO_SEGURO;
    }
}
