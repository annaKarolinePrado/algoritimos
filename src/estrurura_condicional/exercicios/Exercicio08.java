package estrurura_condicional.exercicios;

import estrurura_condicional.service.ExercicioService;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

       // 8. Faça um algoritmo que cadastre um número positivo e descubra se este número é
       //    unidade, dezena ou centena.
        String MSG_NUMERO = "Informe um número positivo: ";

        Scanner scanner = new Scanner(System.in);
        ExercicioService exercicioService = new ExercicioService();

        System.out.println(MSG_NUMERO);
        Double numero = scanner.nextDouble();
        System.out.println(exercicioService.classificacaoNumero(numero));

        scanner.close();
    }
}
