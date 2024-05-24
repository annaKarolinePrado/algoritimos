package estrurura_condicional.exercicios;

import estrurura_condicional.service.ExercicioService;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        /* 11. Uma papelaria faz cópias de documentos (xerox) pelos seguintes valores:
        - De 1 a 10 cópias, R$ 1.00. - De 11 a 50 cópias, R$ 0.75. - Acima de 50 cópias, R$ 0.50
        O usuário informará a quantidade de cópias, então mostre o valor a receber pela papelaria. */

        String MSG_QUANT_COPIAS = "Informe a quantidade de cópias: ";
        String MSG_RESULTADO = "O valor total a ser pago pelas %s é: R$ %.2f%n ";

        Scanner scanner = new Scanner(System.in);
        ExercicioService exercicioService = new ExercicioService();

        System.out.print(MSG_QUANT_COPIAS);
        int quantidadeCopias = scanner.nextInt();

        Double valorTotal = exercicioService.calcularValor(quantidadeCopias);
        System.out.printf(MSG_RESULTADO, quantidadeCopias, valorTotal);

        scanner.close();
    }
}
