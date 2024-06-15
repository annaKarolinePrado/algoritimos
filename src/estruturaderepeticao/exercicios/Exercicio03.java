package estruturaderepeticao.exercicios;

import estruturaderepeticao.service.Service;

import java.util.Scanner;

public class Exercicio03 {
    // 3. Elabore um algoritmo que receba uma sequência de 10 números inteiros e
    //    determinar a soma somente dos números pares.
    public static void main(String[] args) {

        String MSG_ORIENTACAO = "Digite um NÚMERO INTEIRO para continuar:";
        String MSG_RESULTADO = "A soma dos números pares é:.... %s ....";

        Scanner scanner = new Scanner(System.in);
        Integer soma = 0;
        Integer contador = 0;

        while (contador <10) {
            System.out.println(MSG_ORIENTACAO);
            Integer numero = scanner.nextInt();

            if (numero % 2 == 0){
                soma = soma + numero;
            }
            contador = contador + 1;
        }

        System.out.println(String.format(MSG_RESULTADO, soma));
        scanner.close();
    }
}
