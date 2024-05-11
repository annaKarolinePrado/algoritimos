package estudos;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // criar um metodo que chama outra classe

        String MSG_VALOR = "O valor informado é %s.";

        System.out.println("Digite um valor:");
        int valor = scanner.nextInt();
        System.out.println(String.format(MSG_VALOR,valor));
    }
}
