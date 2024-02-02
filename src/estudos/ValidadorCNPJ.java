package estudos;

import java.util.InputMismatchException;

public class ValidadorCNPJ {
    public boolean validarCNPJ(String cnpj) {
        // Remove caracteres não numéricos
        cnpj = cnpj.replaceAll("[^0-9]", "");

        // Verifica se o CNPJ possui 14 dígitos
        if (cnpj.length() != 14) {
            return false;
        }

        try {
            // Calcula o primeiro dígito verificador
            int soma = 0;
            int peso = 2;
            for (int i = 11; i >= 0; i--) {
                int digito = Character.getNumericValue(cnpj.charAt(i));
                soma += digito * peso;
                peso = (peso == 9) ? 2 : peso + 1;
            }
            int resto = soma % 11;
            int digito1 = (resto < 2) ? 0 : 11 - resto;

            // Verifica o primeiro dígito verificador
            if (Character.getNumericValue(cnpj.charAt(12)) != digito1) {
                return false;
            }

            // Calcula o segundo dígito verificador
            soma = 0;
            peso = 2;
            for (int i = 12; i >= 0; i--) {
                int digito = Character.getNumericValue(cnpj.charAt(i));
                soma += digito * peso;
                peso = (peso == 9) ? 2 : peso + 1;
            }
            resto = soma % 11;
            int digito2 = (resto < 2) ? 0 : 11 - resto;

            // Verifica o segundo dígito verificador
            return Character.getNumericValue(cnpj.charAt(13)) == digito2;
        } catch (InputMismatchException e) {
            return false;
        }
    }
}