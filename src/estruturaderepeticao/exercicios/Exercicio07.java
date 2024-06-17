package estruturaderepeticao.exercicios;

import java.util.Scanner;

public class Exercicio07 {
    //7. Faça um algoritmo que calcula a progressão aritmética de um número inteiro
    //   positivo e mostre como saída até dez números posteriores em progressão aritmética.
    public static void main(String[] args) {
        String MSG_ORIENTACAO = "Digite o primeiro número da PA: ";
        String MSG_RESULTADO = "Os dez primeiros números da PA são:";

        Scanner scanner = new Scanner(System.in);

        int contador = 0;

        System.out.println(MSG_ORIENTACAO);
        int numero = scanner.nextInt();

        System.out.println(MSG_RESULTADO);

        while (true) {
            if (contador == 10) {
                break;
            }
            contador = contador + 1;

            System.out.println(".............................." + (numero + contador) + "...");
            scanner.close();
        }
    }
}
