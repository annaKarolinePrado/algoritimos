package estrurura_condicional;
public class Exercicio08 {
    public static void main(String[] args) {

       // 8. Faça um algoritmo que cadastre um número positivo e descubra se este número é
       //    unidade, dezena ou centena.

        String MSG_UNIDADE = "O número %s é uma UNIDADE";
        String MSG_DEZENA  = "O número %s é uma DEZENA";
        String MSG_CENTENA = "O número %s é uma CENTENA";

        Float numero = 105F;

        if (numero < 0){
            numero = numero * (-1);
            System.out.println("O número informado foi convertido para positivo");
        }

        if ((numero > 0) && (numero <= 9)){
            System.out.println(String.format(MSG_UNIDADE,numero));
        } else if ((numero >= 10) && (numero <= 99)) {
            System.out.println(String.format(MSG_DEZENA,numero));
        } else if ((numero >= 99) && (numero <= 999)) {
            System.out.println(String.format(MSG_CENTENA,numero));
        }
    }
}
