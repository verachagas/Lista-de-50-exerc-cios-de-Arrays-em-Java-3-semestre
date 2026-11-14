package flamingo.aprendendo.basico.ExercíciosDeArraysJava;
import java.util.Scanner;

public class Ex09ClassificarNumeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        int positivos = 0;
        int negativos = 0;
        int zeros = 0;

        System.out.println("Digite 10 números (inteiros ou decimais):");


        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            double numero = leitor.nextDouble();


            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                zeros++;
            }
        }


        System.out.println("\n--- Resultado ---");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Zeros: " + zeros);

        leitor.close();
    }
}
