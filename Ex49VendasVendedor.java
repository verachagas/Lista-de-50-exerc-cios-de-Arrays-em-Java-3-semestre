package flamingo.aprendendo.basico.ExercíciosDeArraysJava;
import java.util.Scanner;

public class Ex49VendasVendedor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] vendas = new double[3][4];
        double[] totaisVendedores = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Vendas do Vendedor " + (i + 1) + ":");
            double somaLinha = 0;
            for (int j = 0; j < 4; j++) {
                System.out.print("  Venda " + (j + 1) + ": ");
                vendas[i][j] = scanner.nextDouble();
                somaLinha += vendas[i][j];
            }
            totaisVendedores[i] = somaLinha;
        }

        System.out.println();
        int idMelhorVendedor = 0;
        double maiorVenda = totaisVendedores[0];

        for (int i = 0; i < 3; i++) {
            System.out.printf("Total vendido pelo Vendedor %d: R$ %.2f\n", (i + 1), totaisVendedores[i]);
            if (totaisVendedores[i] > maiorVenda) {
                maiorVenda = totaisVendedores[i];
                idMelhorVendedor = i;
            }
        }

        System.out.printf("\nO Vendedor %d vendeu mais, somando um total de R$ %.2f\n", (idMelhorVendedor + 1), maiorVenda);
        scanner.close();
    }
}