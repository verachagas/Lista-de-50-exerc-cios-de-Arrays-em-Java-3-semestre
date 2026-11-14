package flamingo.aprendendo.basico.ExercíciosDeArraysJava;

import java.util.Scanner;

public class Ex36SomaCadaColuna {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println();
        for (int j = 0; j < 4; j++) {
            int somaColuna = 0;
            for (int i = 0; i < 3; i++) {
                somaColuna += matriz[i][j];
            }
            System.out.println("Soma da coluna " + j + ": " + somaColuna);
        }

        scanner.close();
    }
}