package flamingo.aprendendo.basico.ExercíciosDeArraysJava;

import java.util.Scanner;

public class Ex10NotasAcimaMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        double media = soma / notas.length;
        System.out.printf("Média calculada: %.2f\n", media);

        System.out.println("Notas acima da média:");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                System.out.println(notas[i]);
            }
        }

        scanner.close();
    }
}
