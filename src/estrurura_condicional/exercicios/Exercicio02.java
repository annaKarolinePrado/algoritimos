package estrurura_condicional.exercicios;

import estrurura_condicional.service.ExercicioService;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        String MSG_NUMERO = "Informe um número:";

        Scanner scanner = new Scanner(System.in);
        ExercicioService exercicioService = new ExercicioService();

        System.out.println(MSG_NUMERO);
        int numero = scanner.nextInt();
        String resultado = exercicioService.verificarParImpar(numero);

        System.out.println(resultado);
    }
}