package model;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numeroAgencia, int numeroConta) {
        super(numeroAgencia, numeroConta);
        super.setTipoConta("Conta Poupança");
    }

    @Override
    public void depositar(double valor) {

        this.saldo += valor;
        System.out.println("--- " + this.getNomeTitular() + " ---\nDepósito de R$ " + valor + " realizado com sucesso! \nSaldo atual: R$ " + DF.format(this.getSaldo()));
        System.out.println();
    }
}


