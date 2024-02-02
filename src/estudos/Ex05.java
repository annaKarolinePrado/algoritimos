package estudos;
public class Ex05 {
    public static void main(String[] args) {
        String MSG_RESULTADO = "O resultado da divisão do número  %s por  %s é %s";

        Calculadora calculadora = new Calculadora();
        int primeiro = 2;
        int segundo = 4;
        double resultado = calculadora.dividirNumeros(primeiro,segundo);

        System.out.println(String.format(MSG_RESULTADO, primeiro, segundo, resultado));
    }
}
