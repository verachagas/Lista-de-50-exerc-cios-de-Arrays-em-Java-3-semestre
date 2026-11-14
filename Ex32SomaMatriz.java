package flamingo.aprendendo.basico.ExercíciosDeArraysJava;

import java.util.Scanner;

public class Ex32SomaMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int soma = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                soma += matriz[i][j];
            }
        }

        System.out.println("\nA soma de todos os elementos é: " + soma);
        scanner.close();
    }
}