package pagina_18;
public class Exercicio03 {
    public static void main(String[] args) {
        int numero = 5;
        int numeroConverter;
        if (numero < 0){
            numeroConverter = numero * (-1);
            System.out.printf("O número " + numero + " convertido para POSITIVO é " + numeroConverter);
        }else {
            System.out.printf("O número " + numero + " é um número POSITIVO ");
        }
    }
}
