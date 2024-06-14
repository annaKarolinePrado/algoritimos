package estrutura_condicional.exercicios;

import estrutura_condicional.service.ExercicioService;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        //    9. Elaborar um algoritmo que receba 02 números diferentes e:
        //    - se o 1º número for maior, mostrar a soma dos números.
        //    - se o 2º número for maior, mostrar a multiplicação números.

        String MSG_NUMERO1 = "Informe o primeiro número: ";
        String MSG_NUMERO2 = "Informe o segundo número: ";

        Scanner scanner = new Scanner(System.in);
        ExercicioService exercicioService = new ExercicioService();

        System.out.println(MSG_NUMERO1);
        int num1 = scanner.nextInt();
        System.out.println(MSG_NUMERO2);
        int num2 = scanner.nextInt();
        exercicioService.processarNumeros(num1,num2);

        scanner.close();
    }
}
