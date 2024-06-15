package estruturacondicional.exercicios;

import estruturacondicional.service.ExercicioService;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        String MSG_IDADE = "Informe uma idade:";

        Scanner scanner = new Scanner(System.in);
        ExercicioService exercicioService = new ExercicioService();

        System.out.println(MSG_IDADE);
        int idade = scanner.nextInt();
        String resultado = exercicioService.verificarMaioridade(idade);

        System.out.println(resultado);

        scanner.close();
    }
}