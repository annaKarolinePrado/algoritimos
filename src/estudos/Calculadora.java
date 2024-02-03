package estudos;

public class Calculadora {
    // Função para dividir dois números inteiros
    public  double dividirNumeros(int numerador, int denominador) {
        // Verificar se o denominador é diferente de zero para evitar divisão por zero
        if (denominador != 0) {
            return (double) numerador / denominador;
        } else {
            System.out.println("Erro: Divisão por zero não é permitida.");
            return 0; // Poderia retornar outro valor ou lançar uma exceção, dependendo dos requisitos.
        }
    }

    public double dividirStrings(String strNumero1, String strNumero2) {
        try {
            // Convertendo as Strings para Inteiros
            int numero1 = Integer.parseInt(strNumero1);
            int numero2 = Integer.parseInt(strNumero2);

            // Realizando a divisão e convertendo o resultado para double
            double resultado = (double) numero1 / numero2;

            return resultado;
        } catch (NumberFormatException | ArithmeticException e) {
            // Tratando exceções caso a conversão ou a divisão não sejam válidas
            System.err.println("Erro: " + e.getMessage());
            return Double.NaN; // Retorna NaN (Not a Number) em caso de erro
        }
    }
}
