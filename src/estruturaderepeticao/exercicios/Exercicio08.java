package estruturaderepeticao.exercicios;

import java.util.Scanner;

public class Exercicio08 {
    //8. Construa um programa que receba o valor (em reais) que 10 clientes pagaram por sua compra. O programa deverá informar:
    //a) o valor da compra média efetuada
    //b) quantidade de clientes que efetuaram compras superiores a 100,00

    public static void main(String[] args) {
        String MSG_ORIENTACAO = "Informe o valor pago pela compra: ";
        String MSG_RESULTADO = """
                                Informações de vendas do dia:
                                Valor de compra média efetuada: .. %s ..
                                Quantidade de clientes que efetuaram compras superiores a 100,00: .. %s ..""";

        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        Double media = 0.0;
        int qtdComprasAcimaCem = 0;
        Double valorTotal = 0.0;

        while (contador <= 9) {
            System.out.println(MSG_ORIENTACAO);
            Double valor = scanner.nextDouble();

            if (valor > 100){
                qtdComprasAcimaCem = qtdComprasAcimaCem + 1;
            }

            valorTotal = valorTotal + valor;
            contador = contador + 1;
        }

        media = valorTotal / contador;

        System.out.println(String.format(MSG_RESULTADO, media, qtdComprasAcimaCem));
        scanner.close();
    }
}
