package flamingo.aprendendo.basico.ExercíciosDeArraysJava;

import java.util.Scanner;

public class Ex12BuscarNumeroPosicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.print("Digite outro número para pesquisar: ");
        int pesquisado = scanner.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == pesquisado) {
                System.out.println("O número existe no array e está na posição (índice): " + i);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("O número não existe no array.");
        }

        scanner.close();
    }
}