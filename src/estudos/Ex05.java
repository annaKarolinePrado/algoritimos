package estudos;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String MSG_RESULTADO = "O resultado da divisão do número  %s por  %s é %s";

        Calculadora calculadora = new Calculadora();
        System.out.println("Informe o número dividendo:");
        int primeiro = scanner.nextInt();
        System.out.println("Informe o número divisor:");
        int segundo = scanner.nextInt();
        double resultado = calculadora.dividirNumeros(primeiro,segundo);

        System.out.println(String.format(MSG_RESULTADO, primeiro, segundo, resultado));
    }
}
