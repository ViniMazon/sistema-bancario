package model;

import exception.LimiteMaxException;
import exception.MultiploException;
import exception.SaldoInsuficienteException;

public class ContaCorrente extends Conta implements Tributavel{

    private final static double TAXA_SAQUE = 0.2;

    public ContaCorrente(int numeroAgencia, int numeroConta) {
        super(numeroAgencia, numeroConta);
        super.setTipoConta("Conta Corrente");
    }

    @Override
    public void depositar(double valor) {

        this.saldo += valor;
        System.out.println("--- "+ this.getNomeTitular() + " ---\nDepósito de R$ " + valor + " realizado com sucesso!\nSaldo atual: R$ " + DF.format(this.getSaldo()));
        System.out.println();
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException, LimiteMaxException, MultiploException {
        double valorTaxa =  valor + TAXA_SAQUE;
        super.sacar(valorTaxa);
        System.out.println("--- "+ this.getNomeTitular() + " ---\nImposto: R$ " + DF.format(this.getValorImposto()));
        System.out.println();
        //System.out.println("--- "+ this.getNomeTitular() + " ---\nOperação realizada com sucesso. \nSaldo atual: R$ " + DF.format(this.getSaldo()));
        //System.out.println();
    }

    @Override
    public double getValorImposto() {
        return this.saldo * 0.01;
    }



}

