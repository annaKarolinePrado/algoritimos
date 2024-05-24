package estrurura_condicional.exercicios;

import estrurura_condicional.service.ExercicioService;

import java.util.Scanner;

public class Exercicio03 {
    //3. Elabore um algoritmo que leia um valor inteiro positivo ou negativo, e caso ele
    //   seja negativo, transforme-o em positivo.
    public static void main(String[] args) {
        String MSG_NUMERO = "Digite um número inteiro:";
        String MSG_NUM_POSITIVO = "O número '%s' é um número positivo";
        String MSG_NUM_TRANSFORMADO = "O número positivo correspondente é: %s";

        Scanner scanner = new Scanner(System.in);
        ExercicioService exercicioService = new ExercicioService();

        System.out.println(MSG_NUMERO);
        int numero = scanner.nextInt();
        int conversao = exercicioService.tornarPositivo(numero);

        if (numero < 0) {
            System.out.println(String.format(MSG_NUM_TRANSFORMADO,conversao));
        } else{
            System.out.println(String.format(MSG_NUM_POSITIVO,numero));
        }

        scanner.close();
    }
}
