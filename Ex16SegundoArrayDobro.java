package flamingo.aprendendo.basico.ExercíciosDeArraysJava;
import java.util.Scanner;

public class Ex16SegundoArrayDobro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int[] dobros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            dobros[i] = numeros[i] * 2;
        }

        System.out.println("\nValores do segundo array (dobros):");
        for (int i = 0; i < dobros.length; i++) {
            System.out.println(dobros[i]);
        }

        scanner.close();
    }
}