package estudos;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String MSG_VALIDO = "O CPF %s é válido.";
        String MSG_INVALIDO = "O CPF %s é inválido.";

        ValidadorCPF validadorCPF = new ValidadorCPF();

        System.out.println("Digite um nuúmero de CPF:");
        String cpf = scanner.nextLine();
        boolean comparaCPF = validadorCPF.validarCPF(cpf);

        if (comparaCPF) {
            System.out.println(String.format(MSG_VALIDO, cpf));
        } else {
            System.out.println(String.format(MSG_INVALIDO, cpf));
        }
    }
}
