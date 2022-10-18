package Execução;

import Estrutura.Atendente;
import Estrutura.Cliente;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Cliente cliente1 = new Cliente();
        Atendente atendente1 = new Atendente;

        System.out.println("=-=-=-=-=-=- Cliente =-=-=-=-=-=-=\n");

        System.out.println("Digite o nome do Cliente: ");
        cliente1.setNome(input.nextLine());

        System.out.println("\nDigite o cpf do Cliente: ");
        cliente1.setCpf(input.nextLine());

        System.out.println("\nDigite a data de nascimento do Cliente: ");
        /*String data = "18/09/2019";
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = formatter.parse(data);*/

        System.out.println("\nDigite a profissão do Cliente: ");
        cliente1.setProfissao(input.nextLine());

        System.out.println("\nDigite o e-mail do Cliente: ");
        cliente1.setEmail(input.nextLine());

        System.out.println("=-=-=-=-=-=- Atendente =-=-=-=-=-=-=");

        System.out.println("Digite o nome do Atendente: ");
        atendente1.setNome(input.nextLine());

        System.out.println("\nDigite o cpf do Atendente: ");
        atendente1.setCpf(input.nextLine());

        System.out.println("\nDigite a data de nascimento do Atendente: ");
        /*String data = "18/09/2019";
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = formatter.parse(data);*/

        System.out.println("\nDigite a profissão do Atendente: ");
        atendente1.setProfissao(input.nextLine());

        System.out.println("\nDigite o e-mail do Atendente: ");
        atendente1.setEmail(input.nextLine());
    }
    }
