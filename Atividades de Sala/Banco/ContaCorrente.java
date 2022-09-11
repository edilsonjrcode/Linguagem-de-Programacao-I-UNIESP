package Banco;

public class ContaCorrente {

    private int nConta;
    private double saldo;

    public int getnConta() {
        return nConta;
    }

    public void setnConta(int nConta) {
        this.nConta = nConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valorDeposito) {
        saldo += valorDeposito;
    }

    public void sacar(double valorSaque) {
        if (saldo >= valorSaque) {
            saldo -= valorSaque;
        } else {
            System.out.println("Não há saldo suficiente na conta");
        }
    }

}
