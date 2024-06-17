package estruturaderepeticao.exercicios;

import java.util.Scanner;

public class Exercicio09 {
    //9. Dada a temperatura de 5 municípios, calcule:
    //   a) temperatura média da região b) quantidade de municípios com temperatura inferior a 10ºC
    public static void main(String[] args) {
        String MSG_ORIENTACAO = "Informe a temperatura do município:";
        String MSG_RESULTADO = """ 
                                Temperatura média da região: .. %s ..
                                Quantidade de municípios com temperatura inferior a 10ºC: .. %s ..""";

        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int contagemInferiorDez = 0;
        int soma = 0;
        Double media = 0.0;

        while (contador < 5) {
            System.out.println(MSG_ORIENTACAO);
            int temperaturaRegiao = scanner.nextInt();

            if (temperaturaRegiao < 10){
                contagemInferiorDez = contagemInferiorDez + 1;
            }

            soma = soma + temperaturaRegiao;
            contador++;
        }

        media = (double) (soma / contador);

        System.out.println(String.format(MSG_RESULTADO, media,contagemInferiorDez));
        scanner.close();
    }
}
