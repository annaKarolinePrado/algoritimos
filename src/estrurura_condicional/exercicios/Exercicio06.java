package estrurura_condicional.exercicios;

public class Exercicio06 {
    public static void main(String[] args) {
        String MSG_NUM_MAIOR = "Entre os números %s e %s, o MAIOR é o número %s.";

        Float numero01 = 15.5F;
        Float numero02 = 15.5F;

        if (!numero01.equals(numero02)){
            if(numero01 > numero02){
                System.out.println(String.format(MSG_NUM_MAIOR,numero01,numero02,numero01));
            }else {
                System.out.println(String.format(MSG_NUM_MAIOR,numero01,numero02,numero02));
            }
        }else {
            System.out.println("Os números digitados são iguais. Favor inserir números diferentes.");
        }
    }
}
