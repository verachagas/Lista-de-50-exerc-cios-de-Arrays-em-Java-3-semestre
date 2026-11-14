package flamingo.aprendendo.basico.ExercíciosDeArraysJava;
import java.util.Scanner;

public class Ex48MatrizTransposta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[2][3];
        int[][] transposta = new int[3][2];

        System.out.println("Preenchendo Matriz original (2x3):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                transposta[j][i] = matriz[i][j];
            }
        }

        System.out.println("\nMatriz Transposta Resultante (3x2):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(transposta[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}