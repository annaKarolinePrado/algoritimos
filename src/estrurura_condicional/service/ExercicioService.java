package estrurura_condicional.service;

public class ExercicioService {
    final private String MSG_MAIOR_IDADE = "Maior de idade";
    final private String MSG_MENOR_IDADE = "Menor de idade";
    final private String MSG_NUM_PAR = "O número %s é um número PAR";
    final private String MSG_NUM_IMPAR = "O número %s é um número ÍMPAR";
    final private String MSG_NUMERO_NEGATIVO = "Informe um número MAIOR que 0!";
    final private String MSG_NUMERO_CONVERTIDO = "O número %s convertido para POSITIVO é %s";

    public String verificarMaioridade(int idade) {
        return (idade >= 18) ? MSG_MAIOR_IDADE : MSG_MENOR_IDADE;
    }

    public String verificarParImpar(int numero) {
        if (numero > 0) {
            return (numero % 2 == 0) ? String.format(MSG_NUM_PAR, numero) : String.format(MSG_NUM_IMPAR, numero);
        }
        return MSG_NUMERO_NEGATIVO;
    }

    public static int tornarPositivo(int numero) {
        return (numero < 0) ? numero * (-1) : numero;
    }

    public double calcularOperacoes(double numero1, double numero2, String operacao) {
        if (operacao.equals("soma")){
            return numero1 + numero2;
        }
        if (operacao.equals("subtracao")){
            return numero1 - numero2;
        }
        if (operacao.equals("multiplicacao")){
            return numero1 * numero2;
        }
        if (operacao.equals("divisao")){
            if (numero2 != 0) {
                return numero1 / numero2;
            }
        }
        return 0;
    }

    public double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    public boolean verificarAprovacao(double media) {
        return media >= 7.0;
    }
}
