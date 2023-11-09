package estrurura_condicional;
public class Exercicio13 {
    public static void main(String[] args) {
        /* 13. Leia 3 números (N1, N2 e N3) e coloque-os em ordem crescente. */
        String MSG_ORDEM = "Ordem  %s  %s  %s";

        float num1 = 3;
        float num2 = 2;
        float num3 = 1;
        float primeiro =0;
        float segundo = 0;
        float terceiro =0;

        if((num1 != num2) && (num1 != num3) && (num2 != num3)){
            if ((num1 > num2) && (num1 > num3)){
                terceiro = num1;
            } else if ((num2 > num1) && (num2 > num3)) {
                terceiro = num2;
            } else if ((num3 > num1) && (num3 > num2)) {
                terceiro = num3;
            }
            if ((num1 < num2) && (num1 < num3)){
                primeiro = num1;
            } else if ((num2 < num1) && (num2 < num3)) {
                primeiro = num2;
            } else if ((num3 < num1) && (num3 < num2)) {
                primeiro = num3;
            }
            if ((num1 > primeiro) && (num1 < terceiro)){
                segundo = num1;
            } else if ((num2 > primeiro) && (num2 < terceiro)) {
                segundo = num2;
            } else if ((num3 > primeiro) && (num3 < terceiro)) {
                segundo = num3;
            }
        }
       System.out.println(String.format(MSG_ORDEM,primeiro,segundo,terceiro));
    }
}
