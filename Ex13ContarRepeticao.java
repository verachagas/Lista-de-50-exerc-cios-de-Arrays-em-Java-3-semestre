package flamingo.aprendendo.basico.ExercíciosDeArraysJava;

import java.util.Scanner;

public class Ex13ContarRepeticao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.print("Digite um número para pesquisar: ");
        int pesquisado = scanner.nextInt();
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == pesquisado) {
                contador++;
            }
        }

        System.out.println("O número " + pesquisado + " aparece " + contador + " vezes.");
        scanner.close();
    }
}