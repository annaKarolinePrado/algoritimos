package estrutura_condicional.exercicios;

import estrutura_condicional.service.ExercicioService;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
    /*  10. Elabore um algoritmo que cadastre a idade de uma pessoa, e emita na tela uma mensagem conforme a tabela:
    - Menor 16 anos: Não poderá votar.- De 16 a 17 anos: Voto opcional.- De 18 a 60 anos: Voto obrigatório.- Mais de 60 anos: Voto opcional */

        Scanner scanner = new Scanner(System.in);
        ExercicioService exercicioService = new ExercicioService();

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        exercicioService.verificarDireitoDeVoto(nome, idade);
        scanner.close();
    }
}
