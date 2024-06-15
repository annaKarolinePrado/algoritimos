package estruturaderepeticao.exercicios;

import estruturaderepeticao.service.Service;

import java.util.Scanner;

public class Exercicio02 {
    //Escreva um algoritmo que leia N números inteiros e ao final mostre a sua média.
    public static void main(String[] args) {

        String MSG_ORIENTACAO = "Digite um NÚMERO INTEIRO para continuar, ou 0 para finalizar:";
        String MSG_MEDIA = "A média entre os números digitados é: %s";
        String MSG_VALIDACAO_INTEIRO = "Ops, ocorreu um erro, favor revisar os dados informados.";

        Scanner scanner = new Scanner(System.in);
        Service service = new Service();

        Double media = 0.0;
        Integer soma = 0;
        Integer contador = 0;

        try {
            while (true) {
                System.out.println(MSG_ORIENTACAO);
                Integer numero = scanner.nextInt();

                soma = soma + numero;

                if (numero == 0) {
                    break;
                }
                contador = contador + 1;
            }
        } catch (Exception ex) {
            System.out.println(MSG_VALIDACAO_INTEIRO);
        }

        media = (double) soma / contador;

        System.out.println(String.format(MSG_MEDIA, media));

        scanner.close();

    }
}
