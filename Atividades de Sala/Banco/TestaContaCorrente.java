package Banco;

public class TestaContaCorrente {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente();

        conta1.setnConta(123456);
        System.out.println("O número da conta é " + conta1.getnConta());

        System.out.println("Saldo Atual " + conta1.getSaldo());

        conta1.depositar(100);

        System.out.println("Saldo Atual " + conta1.getSaldo());

        conta1.sacar(50);

        System.out.println("Saldo Atual " + conta1.getSaldo());

        conta1.sacar(200);

        System.out.println("Saldo Atual " + conta1.getSaldo());

        ContaCorrente conta2 = new ContaCorrente();

        System.out.println("Saldo Atual " + conta2.getSaldo());

    }
}
