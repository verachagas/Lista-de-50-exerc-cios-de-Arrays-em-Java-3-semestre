package flamingo.aprendendo.basico.ExercíciosDeArraysJava;

import java.util.Scanner;

public class Ex20NumeroRepetido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        boolean temRepetido = false;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    temRepetido = true;
                    break;
                }
            }
        }

        if (temRepetido) {
            System.out.println("Existe algum número repetido.");
        } else {
            System.out.println("Não existe nenhum número repetido.");
        }

        scanner.close();
    }
}