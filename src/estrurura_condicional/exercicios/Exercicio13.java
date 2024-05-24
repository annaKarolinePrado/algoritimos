package estrurura_condicional.exercicios;

import estrurura_condicional.service.ExercicioService;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        /* 13. Leia 3 números (N1, N2 e N3) e coloque-os em ordem crescente. */

        Scanner scanner = new Scanner(System.in);
        ExercicioService exercicioService = new ExercicioService();

        System.out.print("Digite o primeiro número: ");
        int n1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = scanner.nextInt();
        System.out.print("Digite o terceiro número: ");
        int n3 = scanner.nextInt();

         exercicioService.ordenarTresNumeros(n1,n2,n3);
    }
}
