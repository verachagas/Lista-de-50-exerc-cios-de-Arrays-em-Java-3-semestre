package flamingo.aprendendo.basico.ExercíciosDeArraysJava;
import java.util.Scanner;

public class Ex28RelatorioAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];
        double[] notas = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            scanner.nextLine(); // Limpa o buffer
        }

        System.out.println("\n=== RELATÓRIO DE ALUNOS ===");
        for (int i = 0; i < 5; i++) {
            String situacao = (notas[i] >= 7.0) ? "APROVADO" : "REPROVADO";
            System.out.printf("Nome: %s | Nota: %.2f | Situação: %s\n", nomes[i], notas[i], situacao);
        }

        scanner.close();
    }
}