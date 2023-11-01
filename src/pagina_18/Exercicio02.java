package pagina_18;
public class Exercicio02 {
    public static void main(String[] args) {
        int numero = -5;
        if (numero > 0){
            if (numero % 2 == 0){
                System.out.println("O Número " + numero + " é um número PAR!");
            }else{
                System.out.println("O Número " + numero + " é um número IMPAR!");
            }
        }else{
            System.out.println("Digite um número MAIOR que 0!");
        }
    }
}
