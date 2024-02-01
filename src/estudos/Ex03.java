package estudos;

public class Ex03 {
    public static void main(String[] args){

        String MSG_VALIDO = "O CPF %s é válido.";
        String MSG_INVALIDO = "O CPF %s é inválido.";

        ValidadorCPF validadorCPF = new ValidadorCPF();
        String cpf = "107.010.936-30";
        boolean comparaCPF = validadorCPF.validarCPF(cpf);

        if (comparaCPF) {
            System.out.println(String.format(MSG_VALIDO, cpf));
        } else {
            System.out.println(String.format(MSG_INVALIDO, cpf));
        }
    }
}
