package flamingo.aprendendo.basico.ExercíciosDeArraysJava;
import java.util.Scanner;
public class Ex04MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[4];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        double media = soma / notas.length;
        System.out.printf("A média final é: %.2f\n", media);
        scanner.close();
    }
}
