package estruturaderepeticao.exercicios;

public class Exercicio06 {
    //6. Fazer um algoritmo que calcule e escreva o valor de S onde:
    public static void main(String[] args) {
        String MSG_RESULTADO = "O valor de S é:.. %s ..";

        int contador = 0;
        int numero = 1;
        Double divisao = 0.0;

        while (contador <= 50) {

            numero = numero + 2;
            contador = contador + 1;

            divisao = divisao + ((double) numero/contador);
        }
        System.out.println(String.format(MSG_RESULTADO, divisao));

    }
}
