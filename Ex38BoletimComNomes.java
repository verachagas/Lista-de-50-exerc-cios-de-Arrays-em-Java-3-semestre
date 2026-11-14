package flamingo.aprendendo.basico.ExercíciosDeArraysJava;
import java.util.Scanner;

public class Ex38BoletimComNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[4];
        double[][] notas = new double[4][3];

        for (int i = 0; i < 4; i++) {
            System.out.print("Nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();

            for (int j = 0; j < 3; j++) {
                System.out.print("  Digite a nota " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
            }
            scanner.nextLine();
        }

        System.out.println("\n================ BOLETIM FINAl ================");
        for (int i = 0; i < 4; i++) {
            double soma = 0;
            System.out.print("Nome: " + nomes[i] + " | Notas: ");
            for (int j = 0; j < 3; j++) {
                System.out.print(notas[i][j] + "  ");
                soma += notas[i][j];
            }

            double media = soma / 3;
            String situacao = (media >= 7.0) ? "APROVADO" : "REPROVADO";
            System.out.printf("| Média: %.2f | Situação: %s\n", media, situacao);
        }

        scanner.close();
    }
}
