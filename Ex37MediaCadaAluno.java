package flamingo.aprendendo.basico.ExercíciosDeArraysJava;
import java.util.Scanner;

public class Ex37MediaCadaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] notas = new double[4][3];

        for (int i = 0; i < 4; i++) {
            System.out.println("Notas do Aluno " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print("  Nota " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
            }
        }

        System.out.println();
        for (int i = 0; i < 4; i++) {
            double soma = 0;
            for (int j = 0; j < 3; j++) {
                soma += notas[i][j];
            }
            double media = soma / notas[i].length;
            System.out.printf("Média do Aluno %d: %.2f\n", (i + 1), media);
        }

        scanner.close();
    }
}
