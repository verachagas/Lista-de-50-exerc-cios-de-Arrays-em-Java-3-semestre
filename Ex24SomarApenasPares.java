package flamingo.aprendendo.basico.ExercíciosDeArraysJava;
import java.util.Scanner;

public class Ex24SomarApenasPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int somaPares = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            if (numeros[i] % 2 == 0) {
                somaPares += numeros[i];
            }
        }

        System.out.println("A soma apenas dos números pares é: " + somaPares);
        scanner.close();
    }
}