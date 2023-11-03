package estrurura_condicional;

public class Exercicio04 {
    public static void main(String[] args) {
        String MSG_SOMA = "A SOMA dos números %s e %s é %s";
        String MSG_SUBTRACAO = "A SUBTRAÇÃO dos números %s e %s é %s";
        String MSG_MULTIPLICACA = "A MULTIPLICAÇÃO dos números %s e %s é %s";
        String MSG_DIVISAO = "A DIVISÃO dos números %s e %s é %s";

        float a = 2;
        float b = 4;
        System.out.println(String.format(MSG_SOMA,a,b, (a + b)));
        System.out.println(String.format(MSG_SUBTRACAO,a,b, (a - b)));
        System.out.println(String.format(MSG_MULTIPLICACA,a,b, (a * b)));
        System.out.println(String.format(MSG_DIVISAO,a,b, (a / b)));
    }
}
