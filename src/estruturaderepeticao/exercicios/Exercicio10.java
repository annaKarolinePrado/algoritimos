package estruturaderepeticao.exercicios;

import java.util.Scanner;

public class Exercicio10 {
    //10. Receber um número inteiro e mostre os 5 primeiros números a seguir.

    public static void main(String[] args) {
        String MSG_ORIENTACAO = "Informe um número: ";
        String MSG_RESULTADO = "Os cinco proximos números são: ";

        Scanner scanner = new Scanner(System.in);

        int contador = 0;

        System.out.println(MSG_ORIENTACAO);
        int numero = scanner.nextInt();

        System.out.println(MSG_RESULTADO);

        while (contador < 5) {
            contador++;

            System.out.println("........................" + (numero + contador) + "...");
        }
        scanner.close();
    }
}
