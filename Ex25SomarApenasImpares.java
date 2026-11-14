package flamingo.aprendendo.basico.ExercíciosDeArraysJava;
import java.util.Scanner;

public class Ex25SomarApenasImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int somaImpares = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            if (numeros[i] % 2 != 0) {
                somaImpares += numeros[i];
            }
        }

        System.out.println("A soma apenas dos números ímpares é: " + somaImpares);
        scanner.close();
    }
}