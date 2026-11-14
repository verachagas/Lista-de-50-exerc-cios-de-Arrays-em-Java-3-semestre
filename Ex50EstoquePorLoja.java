package flamingo.aprendendo.basico.ExercíciosDeArraysJava;
import java.util.Scanner;

public class Ex50EstoquePorLoja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] estoque = new int[3][5];
        int[] totalPorLoja = new int[3];
        int[] totalPorProduto = new int[5];

        for (int i = 0; i < 3; i++) {
            System.out.println("Loja " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("  Quantidade do Produto " + (j + 1) + ": ");
                estoque[i][j] = scanner.nextInt();
                totalPorLoja[i] += estoque[i][j];
                totalPorProduto[j] += estoque[i][j];
            }
        }

        System.out.println("\n--- TOTAL DE PRODUTOS POR LOJA ---");
        int lojaComMaisEstoque = 0;
        int maiorEstoqueLoja = totalPorLoja[0];

        for (int i = 0; i < 3; i++) {
            System.out.println("Loja " + (i + 1) + ": " + totalPorLoja[i] + " produtos.");
            if (totalPorLoja[i] > maiorEstoqueLoja) {
                maiorEstoqueLoja = totalPorLoja[i];
                lojaComMaisEstoque = i;
            }
        }

        System.out.println("\n--- TOTAL GLOBAL POR PRODUTO ---");
        for (int j = 0; j < 5; j++) {
            System.out.println("Produto " + (j + 1) + ": " + totalPorProduto[j] + " unidades somadas.");
        }

        System.out.println("\nA Loja " + (lojaComMaisEstoque + 1) + " tem mais produtos acumulados no estoque (" + maiorEstoqueLoja + ").");
        scanner.close();
    }
}