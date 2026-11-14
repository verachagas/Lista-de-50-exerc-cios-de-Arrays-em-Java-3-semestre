package flamingo.aprendendo.basico.ExercíciosDeArraysJava;
import java.util.Scanner;

public class Ex17AprovadosReprovados {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        double[] notas = new double[8];
        int aprovados = 0;
        int reprovados = 0;

        System.out.println("=== Controle de Notas da Turma ===");


        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do " + (i + 1) + "º aluno: ");
            notas[i] = leitor.nextDouble();
        }


        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 7.0) {
                aprovados++;
            } else {
                reprovados++;
            }
        }


        System.out.println("\n=== Resultado Final ===");
        System.out.println("Total de aprovados: " + aprovados);
        System.out.println("Total de reprovados: " + reprovados);

        leitor.close();
    }
}
