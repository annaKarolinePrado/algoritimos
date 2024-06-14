package estrutura_condicional.exercicios;

import estrutura_condicional.service.ExercicioService;
import java.util.Scanner;

public class Exercicio05 {
    // 5. Faça um algoritmo que leia o nome e as três notas de uma disciplina de um aluno
    //    e ao final escreva o nome do aluno, sua média e se ele foi aprovado.
    public static void main(String[] args) {
        String MSG_ALUNO = "Informe o nome do aluno: ";
        String MSG_NOTA_1 = "Informe a nota 1: ";
        String MSG_NOTA_2 = "Informe a nota 2: ";
        String MSG_NOTA_3 = "Informe a nota 3: ";
        String MSG_APROVADO = "O aluno %s obteve as notas %s, %s e %s com média %s e foi APROVADO.";
        String MSG_REPROVADO = "O aluno %s obteve as notas %s, %s e %s com média %s e foi REPROVADO.";

        Scanner scanner = new Scanner(System.in);
        ExercicioService exercicioService = new ExercicioService();

        System.out.println(MSG_ALUNO);
        String nome = scanner.nextLine();
        System.out.println(MSG_NOTA_1);
        double nota1 = scanner.nextDouble();
        System.out.println(MSG_NOTA_2);
        double nota2 = scanner.nextDouble();
        System.out.println(MSG_NOTA_3);
        double nota3 = scanner.nextDouble();
        double media = exercicioService.calcularMedia(nota1,nota2,nota3);
        boolean aprovado = exercicioService.verificarAprovacao(media);

        System.out.println((aprovado == true) ? String.format(MSG_APROVADO,nome,nota1,nota2,nota3,media)
                                              : String.format(MSG_REPROVADO,nome,nota1,nota2,nota3,media));

        scanner.close();
    }
}
