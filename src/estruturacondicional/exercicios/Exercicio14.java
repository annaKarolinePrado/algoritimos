package estruturacondicional.exercicios;

import estruturacondicional.service.ExercicioService;

import java.util.Scanner;

public class Exercicio14 {
//14. Dados 2 números inteiros, imprima “Z” se ao menos um deles for igual a zero,
//“M” se tiverem o mesmo sinal, “O” se tiverem sinais opostos.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ExercicioService exercicioService = new ExercicioService();

        System.out.print("Digite o primeiro número: ");
        int n1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = scanner.nextInt();

        exercicioService.validarNumero(n1,n2);
    }

}
