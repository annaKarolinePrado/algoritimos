package estruturacondicional.exercicios;

import estruturacondicional.service.ExercicioService;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        /* 12. Construa um algoritmo que leia 03 números diferentes (N1, N2 e N3) e escreva o
        maior deles. */
        
        String MSG_NUMERO_MAIOR = "O maior entre os números %s, %s e %s é o %s ";

        Scanner scanner = new Scanner(System.in);
        ExercicioService exercicioService = new ExercicioService();

        // Solicita ao usuário que insira três números
        System.out.print("Digite o primeiro número: ");
        int n1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = scanner.nextInt();
        System.out.print("Digite o terceiro número: ");
        int n3 = scanner.nextInt();

        System.out.println(String.format(MSG_NUMERO_MAIOR, n1, n2, n3, exercicioService.encontrarMaior(n1,n2,n3)));

        scanner.close();
    }
}
