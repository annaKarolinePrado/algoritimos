package estudos;

public class Ex04 {
    public static void main(String[] args){

        String MSG_VALIDO = "O CNPJ %s é válido.";
        String MSG_INVALIDO = "O CNPJ %s é inválido.";

        ValidadorCNPJ validadorCNPJ = new ValidadorCNPJ();
        String cnpj = "55.311.670/0001-10";
        boolean comparaCNPJ = validadorCNPJ.validarCNPJ(cnpj);

        if (comparaCNPJ) {
            System.out.println(String.format(MSG_VALIDO, cnpj));
        } else {
            System.out.println(String.format(MSG_INVALIDO, cnpj));
        }
    }
}
