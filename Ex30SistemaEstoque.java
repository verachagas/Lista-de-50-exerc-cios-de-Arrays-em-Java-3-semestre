package flamingo.aprendendo.basico.ExercíciosDeArraysJava;
import java.util.Scanner;

public class Ex30SistemaEstoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] produtos = new String[5];
        int[] quantidades = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Nome do produto " + (i + 1) + ": ");
            produtos[i] = scanner.nextLine();
            System.out.print("Quantidade em estoque do produto " + (i + 1) + ": ");
            quantidades[i] = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("\nProdutos com estoque abaixo de 5 unidades:");
        for (int i = 0; i < 5; i++) {
            if (quantidades[i] < 5) {
                System.out.println("Produto: " + produtos[i] + " | Estoque: " + quantidades[i]);
            }
        }

        scanner.close();
    }
}