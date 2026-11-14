package flamingo.aprendendo.basico.ExercíciosDeArraysJava;
import java.util.Scanner;

public class Ex35SomaCadaLinha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println();
        for (int i = 0; i < 3; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 4; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.println("Soma da linha " + i + ": " + somaLinha);
        }

        scanner.close();
    }
}
