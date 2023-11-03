package estrurura_condicional;

public class Exercicio09 {
    public static void main(String[] args) {
        //    9. Elaborar um algoritmo que receba 02 números diferentes e:
        //    - se o 1º número for maior, mostrar a soma dos números.
        //    - se o 2º número for maior, mostrar a multiplicação números.

        String MSG_SOMA          = "A SOMA dos números %s e %s é %s";
        String MSG_MULTIPLICACAO = "A MULTIPLICAÇÃO dos números %s e %s é %s";

        int numero1 = 2;
        int numero2 = 5;

        if ((numero1 > 0) && (numero2 > 0) && (numero1 != numero2)){
            if (numero1 > numero2){
                System.out.println(String.format(MSG_SOMA,numero1,numero2,(numero1 + numero2)));
            }else {
                System.out.println(String.format(MSG_MULTIPLICACAO,numero1,numero2,(numero1 * numero2)));
            }
        }else {
            System.out.println("Informe números DIFERENTES maiores que ZERO");
        }
    }
}
