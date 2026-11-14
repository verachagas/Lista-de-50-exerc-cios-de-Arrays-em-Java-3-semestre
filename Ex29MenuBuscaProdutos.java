package flamingo.aprendendo.basico.ExercíciosDeArraysJava;

import java.util.Scanner;

public class Ex29MenuBuscaProdutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] produtos = new String[5];

        for (int i = 0; i < produtos.length; i++) {
            System.out.print("Cadastre o produto " + (i + 1) + ": ");
            produtos[i] = scanner.nextLine();
        }

        System.out.println("\n--- MENU ---");
        System.out.println("1. Listar todos os produtos");
        System.out.println("2. Buscar produto pelo nome");
        System.out.println("3. Mostrar quantidade de produtos cadastrados");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        switch (opcao) {
            case 1:
                System.out.println("\nLista de Produtos:");
                for (int i = 0; i < produtos.length; i++) {
                    System.out.println(produtos[i]);
                }
                break;
            case 2:
                System.out.print("Digite o nome do produto para pesquisar: ");
                String busca = scanner.nextLine();
                boolean achou = false;
                for (int i = 0; i < produtos.length; i++) {
                    if (produtos[i].equalsIgnoreCase(busca)) {
                        achou = true;
                        break;
                    }
                }
                System.out.println(achou ? "Produto encontrado!" : "Produto não encontrado.");
                break;
            case 3:
                System.out.println("Quantidade de produtos cadastrados: " + produtos.length);
                break;
            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}