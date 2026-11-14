package flamingo.aprendendo.basico.ExercíciosDeArraysJava;
import java.util.Scanner;

public class Ex44BuscarValorMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.print("\nDigite o número que deseja pesquisar: ");
        int numeroPesquisado = scanner.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] == numeroPesquisado) {
                    System.out.println("Número encontrado na Linha " + i + " e Coluna " + j);
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("O número não foi encontrado na matriz.");
        }

        scanner.close();
    }
}