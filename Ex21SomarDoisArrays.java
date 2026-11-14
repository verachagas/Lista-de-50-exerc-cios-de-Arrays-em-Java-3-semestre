package flamingo.aprendendo.basico.ExercíciosDeArraysJava;
import java.util.Scanner;

public class Ex21SomarDoisArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int[] soma = new int[5];

        System.out.println("Valores do Primeiro Array:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Array 1 - Índice " + i + ": ");
            array1[i] = scanner.nextInt();
        }

        System.out.println("\nValores do Segundo Array:");
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Array 2 - Índice " + i + ": ");
            array2[i] = scanner.nextInt();
            soma[i] = array1[i] + array2[i];
        }

        System.out.println("\nTerceiro Array (Resultado da Soma):");
        for (int i = 0; i < soma.length; i++) {
            System.out.println("Índice " + i + ": " + soma[i]);
        }

        scanner.close();
    }
}