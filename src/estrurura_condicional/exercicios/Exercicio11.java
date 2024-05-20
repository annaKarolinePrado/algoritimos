package estrurura_condicional.exercicios;

public class Exercicio11 {
    public static void main(String[] args) {
        /* 11. Uma papelaria faz cópias de documentos (xerox) pelos seguintes valores:
        - De 1 a 10 cópias, R$ 1.00
        - De 11 a 50 cópias, R$ 0.75
        - Acima de 50 cópias, R$ 0.50
        O usuário informará a quantidade de cópias, então mostre o valor a receber pela
        papelaria.
        * */
        String MSG_VALOAR = "O valor á pagar por %s cópias é R$ %s";

        int quantidade_copias = 100;

        if (quantidade_copias > 0){
            if ((quantidade_copias >= 1) && (quantidade_copias <= 10)){
                float valor = (float) (quantidade_copias * 0.10);
                System.out.println(String.format(MSG_VALOAR, quantidade_copias, valor));
            } else if ((quantidade_copias >= 11) && (quantidade_copias < 50)) {
                float valor = (float) (quantidade_copias * 0.08);
                System.out.println(String.format(MSG_VALOAR, quantidade_copias, valor));
            } else if (quantidade_copias >= 50) {
                float valor = (float) (quantidade_copias * 0.05);
                System.out.println(String.format(MSG_VALOAR, quantidade_copias, valor));
            }
        }else {
            System.out.println("Informe uma quantidade valida maior zero.");
        }

    }
}
