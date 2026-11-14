package flamingo.aprendendo.basico.ExercíciosDeArraysJava;

import java.util.Scanner;

public class Ex11BuscarNome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        System.out.print("Digite um nome para pesquisar: ");
        String nomePesquisado = scanner.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < nomes.length; i++) {
            if (nomePesquisado.equals(nomes[i])) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O nome foi encontrado!");
        } else {
            System.out.println("O nome NÃO foi encontrado.");
        }

        scanner.close();
    }
}
