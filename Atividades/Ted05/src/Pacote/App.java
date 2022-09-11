package Pacote;
public class App {
    public static void main(String[] args) {
        System.out.println("LINGUAGEM DE PROGRAMAÇÃO I / PROF: MESSIAS BATISTA\n");
        System.out.println("Atividade 05 / Aluno: Edilson Júnior\n");

        int i = 1;

        while (i <= 20) {
            System.out.print(i);
            if (i % 5 == 0) {
                System.out.println();
            } else {
                System.out.print('\t');
            }
            i++;
        }
    }
}
