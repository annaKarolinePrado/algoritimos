package estrurura_condicional.exercicios;

public class Exercicio12 {
    public static void main(String[] args) {
        /* 12. Construa um algoritmo que leia 03 números diferentes (N1, N2 e N3) e escreva o
        maior deles. */
        
        String MSG_NUMERO_MAIOR = "O maior entre os números %s, %s e %s é o %s ";
        
        float num1 = 3;
        float num2 = 4;
        float num3 = 1;

        if((num1 != num2) && (num1 != num3) && (num2 != num3)){
            if ((num1 > num2) && (num1 > num3)){
                System.out.println(String.format(MSG_NUMERO_MAIOR, num1, num2, num3, num1));
            } else if ((num2 > num1) && (num2 > num3)) {
                System.out.println(String.format(MSG_NUMERO_MAIOR, num1, num2, num3, num2));
            } else if ((num3 > num1) && (num3 > num2)) {
                System.out.println(String.format(MSG_NUMERO_MAIOR, num1, num2, num3, num3));
            }
        }
    }
}
