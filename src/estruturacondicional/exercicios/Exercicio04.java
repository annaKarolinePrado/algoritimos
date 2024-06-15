package estruturacondicional.exercicios;

import estruturacondicional.service.ExercicioService;

import java.util.Scanner;

public class Exercicio04 {
    //4. Faça um algoritmo que leia dois valores (A e B) e calcule, separadamente, a
    //   soma, subtração, multiplicação e divisão entre A e B.
    public static void main(String[] args) {

        String MSG_NUMERO = "Informe um número:";
        String MSG_NUM_ZERO = "Informe um número diferente de ZERO.";
        String MSG_SOMA = "A SOMA dos números %s e %s é:............. %s";
        String MSG_SUBTRACAO = "A SUBTRAÇÃO dos números %s e %s é:........ %s";
        String MSG_MULTIPLICACA = "A MULTIPLICAÇÃO dos números %s e %s é:.... %s";
        String MSG_DIVISAO = "A DIVISÃO dos números %s e %s é:.......... %s";

        Scanner scanner = new Scanner(System.in);
        ExercicioService exercicioService = new ExercicioService();

        System.out.println(MSG_NUMERO);
        float numero1 = scanner.nextInt();
        System.out.println(MSG_NUMERO);
        float numero2 = scanner.nextInt();

        double soma = exercicioService.calcularOperacoes(numero1,numero2,"soma");
        double subtracao = exercicioService.calcularOperacoes(numero1,numero2,"subtracao");
        double multiplicacao = exercicioService.calcularOperacoes(numero1,numero2,"multiplicacao");
        double divisao = exercicioService.calcularOperacoes(numero1,numero2,"divisao");

        if ((numero1 != 0) & (numero2 != 0) ){
            System.out.println(String.format(MSG_SOMA,numero1, numero2,soma));
            System.out.println(String.format(MSG_SUBTRACAO,numero1, numero2,subtracao));
            System.out.println(String.format(MSG_MULTIPLICACA,numero1, numero2,multiplicacao));
            System.out.println(String.format(MSG_DIVISAO,numero1, numero2,divisao));
        }else {
            System.out.println(MSG_NUM_ZERO);
        }

        scanner.close();
    }
}
