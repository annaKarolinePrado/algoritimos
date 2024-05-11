package estudos;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String MSG_MULTIPLICACAO = "O resultado da multiplicação de %s e %s é %s.";
        ExercicioService exercicioService = new ExercicioService();

        System.out.println("Digite o primeiro número:");
        int um = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int dois = scanner.nextInt();

        int multiplica = exercicioService.setMultiplicar(um,dois);
        System.out.println(String.format(MSG_MULTIPLICACAO,um,dois,multiplica));
    }
}
