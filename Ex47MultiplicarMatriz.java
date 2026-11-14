package flamingo.aprendendo.basico.ExercíciosDeArraysJava;
import java.util.Scanner;

public class Ex47MultiplicarMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.print("\nDigite o número multiplicador: ");
        int multiplicador = scanner.nextInt();

        System.out.println("\nMatriz Resultante da Multiplicação:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((matriz[i][j] * multiplicador) + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}