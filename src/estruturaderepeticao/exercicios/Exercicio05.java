package estruturaderepeticao.exercicios;

import java.util.Scanner;

public class Exercicio05 {

    //5. Construa um algoritmo que calcula a média aritmética de vários valores inteiros
    //positivos digitados pelo usuário. O Algoritmo termina quando o usuário digitar um
    //valor negativo.
    public static void main(String[] args) {
        String MSG_ORIENTACAO = "Informe um valor: ";
        String MSG_RESULTADO = "A MÉDIA dos números é:.... %s ....";

        Scanner scanner = new Scanner(System.in);

        int saida = 0;
        int soma = 0;
        int quant = 0;

        while (true) {
            System.out.println(MSG_ORIENTACAO);
            Integer numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }

            soma = soma + numero;
            quant = quant + 1;
        }

        System.out.println(String.format(MSG_RESULTADO, ((double)soma/quant)));
        scanner.close();
    }
}
