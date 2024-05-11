package estudos;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String MSG_VALIDO = "O CNPJ %s é válido.";
        String MSG_INVALIDO = "O CNPJ %s é inválido.";

        ValidadorCNPJ validadorCNPJ = new ValidadorCNPJ();
        System.out.println("Informe um número de CNPJ:");
        String cnpj =scanner.nextLine();
        boolean comparaCNPJ = validadorCNPJ.validarCNPJ(cnpj);

        if (comparaCNPJ) {
            System.out.println(String.format(MSG_VALIDO, cnpj));
        } else {
            System.out.println(String.format(MSG_INVALIDO, cnpj));
        }
    }
}
