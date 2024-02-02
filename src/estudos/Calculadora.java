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
}
