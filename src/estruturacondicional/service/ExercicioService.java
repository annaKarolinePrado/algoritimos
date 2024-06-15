package estruturacondicional.service;

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
        if (operacao.equals("soma")) {
            return numero1 + numero2;
        }
        if (operacao.equals("subtracao")) {
            return numero1 - numero2;
        }
        if (operacao.equals("multiplicacao")) {
            return numero1 * numero2;
        }
        if (operacao.equals("divisao")) {
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

    public double calcularMaiorNumero(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public String classificarNadador(String nome, int idade) {
        if (idade >= 6 && idade <= 10) {
            return nome + " está na categoria Infantil.";
        } else if (idade >= 11 && idade <= 17) {
            return nome + " está na categoria Juvenil.";
        } else if (idade >= 18) {
            return nome + " está na categoria Adulto.";
        } else {
            return nome + " não se enquadra em nenhuma categoria.";
        }
    }

    public String classificacaoNumero(Double numero) {
        if (numero < 1) {
            return "Número inválido";
        } else if (numero >= 1 && numero <= 9) {
            return "O Número informado é uma Unidade";
        } else if (numero >= 10 && numero <= 99) {
            return "O Número informado é uma Dezena";
        } else if (numero >= 100 && numero <= 999) {
            return "O Número informado é uma Centena";
        } else {
            return "Fora do escopo definido";
        }
    }

    public void processarNumeros(int num1, int num2) {
        if (num1 > num2) {
            int soma = num1 + num2;
            System.out.println("A soma dos números é: " + soma);
        } else if (num2 > num1) {
            int multiplicacao = num1 * num2;
            System.out.println("A multiplicação dos números é: " + multiplicacao);
        } else {
            System.out.println("Os números não devem ser iguais.");
        }
    }

    public void verificarDireitoDeVoto(String nome, int idade) {
        if (idade < 16) {
            System.out.println(nome + ", não poderá votar.");
        } else if (idade >= 16 && idade <= 17) {
            System.out.println(nome + ", voto opcional.");
        } else if (idade >= 18 && idade <= 60) {
            System.out.println(nome + ", voto obrigatório.");
        } else {
            System.out.println(nome + ", voto opcional.");
        }
    }

    public Double calcularValor(int quantidadeCopias) {
        Double valorTotal = 0.0;

        if (quantidadeCopias > 0) {
            if (quantidadeCopias < 11) {
                valorTotal = quantidadeCopias * 0.10;
            } else if (quantidadeCopias <= 50) {
                valorTotal = quantidadeCopias * 0.08;
            } else {
                valorTotal = quantidadeCopias * 0.05;
            }
        } else {
            System.out.println("Informe uma quantidade valida maior zero.");
        }
        return valorTotal;
    }

    public static int encontrarMaior(int n1, int n2, int n3) {
        int maior;

        if (n1 > n2 && n1 > n3) {
            maior = n1;
        } else if (n2 > n1 && n2 > n3) {
            maior = n2;
        } else {
            maior = n3;
        }

        return maior;
    }

    public static void ordenarTresNumeros(int n1, int n2, int n3) {
        int maior = n1;
        int meio = n2;
        int menor = n3;

        if ((n1 > n2) && (n1 > n3)) {
            maior = n1;
            if (n2 > n3) {
                meio = n2;
                menor = n3;
            } else {
                meio = n3;
                menor = n2;
            }
        }
        if ((n2 > n3) && (n2 > n1)) {
            maior = n2;
            if (n1 > n3) {
                meio = n1;
                menor = n3;
            } else {
                meio = n3;
                menor = n1;
            }
        }
        if ((n3 > n1) && (n3 > n2)) {
            maior = n3;
            if (n1 > n2) {
                meio = n1;
                menor = n2;
            } else {
                meio = n2;
                menor = n1;
            }
        }
        System.out.println("Ordem crescente: " + menor + "," + meio + "," + maior + ".");
    }

    public static void validarNumero(int n1, int n2) {

        if ((n1 == 0) || (n2 == 0)) {
            System.out.println("Z");
        } else if ((n1 > 0 && n2 > 0) || (n1 < 0 && n2 < 0)) {
            System.out.println("M");
        } else{
            System.out.println("O");
        }
    }
}