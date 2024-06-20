package estruturaderepeticao.exercicios;

import estruturaderepeticao.service.Service;

import java.util.Scanner;

public class Exercicio11 {
    //11. Receber um número inteiro e imprimir os 5 primeiros números pares a seguir.
    public static void main(String[] args) {
        String MSG_ORIENTACAO = "Informe um número: ";
        String MSG_RESULTADO = "Os cinco proximos números pares são: ";

        Scanner scanner = new Scanner(System.in);

        int contador = 0;

        System.out.println(MSG_ORIENTACAO);
        int numero = scanner.nextInt();

        System.out.println(MSG_RESULTADO);

        if (numero % 2 != 0) {
            numero++;
        }

        while (contador < 5) {
            System.out.println("............................." + numero + "...");
            numero += 2;
            contador++;
        }
        scanner.close();
    }
}
