package estrutura_condicional.exercicios;

import estrutura_condicional.service.ExercicioService;

import java.util.Scanner;

public class Exercicio06 {
    //6. Escreva um algoritmo para determinar o maior entre dois números reais dados
    public static void main(String[] args) {
        String MSG_NUMERO_1 = "Informe o primeiro número real: ";
        String MSG_NUMERO_2 = "Informe o segundo número real: ";
        String MSG_MAIOR_NUMERO = "Entre os números %s e %s, o MAIOR é o número %s.";
        String MSG_NUMEROS_IGUAIS = "Os números digitados são iguais. Favor inserir números diferentes.";

        Scanner scanner = new Scanner(System.in);
        ExercicioService exercicioService = new ExercicioService();

        System.out.println(MSG_NUMERO_1);
        Double num1 = scanner.nextDouble();
        System.out.println(MSG_NUMERO_2);
        Double num2 =  scanner.nextDouble();
        Double maiorNumero = exercicioService.calcularMaiorNumero(num1,num2);

        System.out.println((!num1.equals(num2)) ? String.format(MSG_MAIOR_NUMERO,num1,num2,maiorNumero)
                                                : String.format(MSG_NUMEROS_IGUAIS));

        scanner.close();
    }
}
