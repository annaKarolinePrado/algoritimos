package estrutura_condicional.exercicios;

import estrutura_condicional.service.ExercicioService;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        String MSG_NOME = "Informe o nome do nadador: ";
        String MSG_IDADE = "Informe a idade do nadador: ";

        Scanner scanner = new Scanner(System.in);
        ExercicioService exercicioService = new ExercicioService();

        System.out.println(MSG_NOME);
        String nome = scanner.nextLine();
        System.out.println(MSG_IDADE);
        int idade = scanner.nextInt();

        System.out.println(exercicioService.classificarNadador(nome, idade));

        scanner.close();
    }
}
