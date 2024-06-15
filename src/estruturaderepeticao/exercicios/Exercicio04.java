package estruturaderepeticao.exercicios;

import java.util.Scanner;

public class Exercicio04 {
    //4. Escreva um algoritmo que leia a idade de vários funcionários de uma empresa, e
    //   conte quantos deles estão nos seguintes intervalos: 18..25, 26..50, 51..65. O
    //   algoritmo termina quando o usuário desejar parar de digitar as idades dos funcionários
    public static void main(String[] args) {
        String MSG_ORIENTACAO = "Informe a IDADE do funcionário:";
        String MSG_RESULTADO = """
                                A seguir o número de funcionários agrupados por idade:
                                Intervalo de 18..25: ... %s ...
                                Intervalo de 26..50: ... %s ...
                                Intervalo de 51..65: ... %s ...
                                Acima de 65: ... %s ...""";

        Scanner scanner = new Scanner(System.in);

        int intervalo1 = 0;
        int intervalo2 = 0;
        int intervalo3 = 0;
        int intervalo4 = 0;

        while (true) {
            System.out.println(MSG_ORIENTACAO);
            int idade = scanner.nextInt();

            if (idade == 0) {
                break;
            }

            if (idade < 18){
                return;
            }

            if (idade <= 25) {
                intervalo1 = intervalo1 + 1;
            } else if (idade <= 50) {
                intervalo2 = intervalo2 + 1;
            } else if (idade <= 65) {
                intervalo3 = intervalo3 + 1;
            } else{
                intervalo4 = intervalo4 + 1;
            }
        }

        System.out.println(String.format(MSG_RESULTADO,intervalo1,intervalo2,intervalo3,intervalo4));
        scanner.close();
    }
}
