import exception.LimiteMaxException;
import exception.MultiploException;
import exception.SaldoInsuficienteException;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class TesteContas {

    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente(1234, 123456789);
        ContaPoupanca contaPoupanca = new ContaPoupanca(4321, 987654321);
        Conta conta = new ContaCorrente(2143, 921436587);

        contaCorrente.setNomeTitular("Rogério");
        contaPoupanca.setNomeTitular("Diego");

        try{
            contaPoupanca.sacar(100.00);
        } catch (SaldoInsuficienteException | LimiteMaxException | MultiploException e) {
            System.out.println(e.getMessage());
            System.out.println();
        }

        contaPoupanca.depositar(510.00);

        try{
            contaPoupanca.sacar(410.00);
        } catch (SaldoInsuficienteException | LimiteMaxException | MultiploException e) {
            System.out.println(e.getMessage());
            System.out.println();
        }

        try{
            contaPoupanca.sacar(60.00);
        } catch (SaldoInsuficienteException | LimiteMaxException | MultiploException e) {
            System.out.println(e.getMessage());
            System.out.println();
        }

        try{
            contaPoupanca.transferir(contaCorrente, 30.00);
        } catch (SaldoInsuficienteException | LimiteMaxException | MultiploException e) {
            System.out.println(e.getMessage());
            System.out.println();
        }

        try{
            contaPoupanca.sacar( 30.00);
        } catch (SaldoInsuficienteException | LimiteMaxException | MultiploException e) {
            System.out.println(e.getMessage());
            System.out.println();
        }
        

        contaPoupanca.consultar();
        contaCorrente.consultar();
        System.out.println("Quantidade de Contas no Banco: " + Conta.getQuantidadeContas());

    }
}
