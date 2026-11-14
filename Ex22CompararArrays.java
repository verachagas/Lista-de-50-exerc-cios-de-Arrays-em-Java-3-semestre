package flamingo.aprendendo.basico.ExercíciosDeArraysJava;
import java.util.Scanner;

public class Ex22CompararArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[5];
        int[] array2 = new int[5];

        System.out.println("Valores do Array 1:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Posição " + i + ": ");
            array1[i] = scanner.nextInt();
        }

        System.out.println("\nValores do Array 2:");
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Posição " + i + ": ");
            array2[i] = scanner.nextInt();
        }

        boolean iguais = true;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                iguais = false;
                break;
            }
        }

        if (iguais) {
            System.out.println("Os arrays são iguais.");
        } else {
            System.out.println("Os arrays são diferentes.");
        }

        scanner.close();
    }
}