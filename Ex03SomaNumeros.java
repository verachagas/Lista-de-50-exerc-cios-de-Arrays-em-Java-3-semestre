package flamingo.aprendendo.basico.ExercíciosDeArraysJava;
import java.util.Scanner;
public class Ex03SomaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }

        System.out.println("A soma total deles é: " + soma);
        scanner.close();
    }
}
