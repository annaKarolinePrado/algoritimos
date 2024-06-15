package estruturaderepeticao.exercicios;

import estruturaderepeticao.service.Service;

import java.util.Scanner;

public class Exercicio01 {
    //1. Faça um algoritmo para ler o nome de um número indeterminado de alunos. Ao
    //   final escreva o total de alunos lidos..
    public static void main(String[] args) {
        String MSG_TOTAL = "Foi informado o total de %s nome(s) de alunos:";
        String MSG_ORIENTACAO = "Digite o nome ou fim para finalizar";

        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        while (true) {
            System.out.println(MSG_ORIENTACAO);
            String nome = scanner.nextLine();

            if (nome.equals("fim")) {
                break;
            }
            contador = contador + 1;
        }
        System.out.println(String.format(MSG_TOTAL, contador));

        scanner.close();
    }
}