package estudos;
public class Ex06 {
    public static void main(String[] args) {
        String MSG_RESULTADO = "O resultado da divisão do número  %s por  %s é %s";

        Calculadora calculadora = new Calculadora();
        String numero1  = "20";
        String numero2  = "4";
        double resultado = calculadora.dividirStrings(numero1,numero2 );

        System.out.println(String.format(MSG_RESULTADO, numero1, numero2 , resultado));
    }
}
