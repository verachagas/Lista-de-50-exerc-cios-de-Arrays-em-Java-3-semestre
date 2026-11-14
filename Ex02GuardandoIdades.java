package flamingo.aprendendo.basico.ExercíciosDeArraysJava;
import java.util.Scanner;
public class Ex02GuardandoIdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] idades = new int[6];

        for (int i = 0; i < idades.length; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();
        }

        System.out.println("\nIdades digitadas:");
        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }

        scanner.close();
    }
}
