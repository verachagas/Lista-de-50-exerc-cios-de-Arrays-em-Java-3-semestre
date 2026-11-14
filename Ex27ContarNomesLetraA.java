package flamingo.aprendendo.basico.ExercíciosDeArraysJava;
import java.util.Scanner;

public class Ex27ContarNomesLetraA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[6];
        int contador = 0;

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();

            if (!nomes[i].isEmpty() && (nomes[i].charAt(0) == 'A' || nomes[i].charAt(0) == 'a')) {
                contador++;
            }
        }

        System.out.println("Quantidade de nomes que começam com a letra A: " + contador);
        scanner.close();
    }
}