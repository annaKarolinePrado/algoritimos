package provas.fiesc;

public class Exercicio05 {

    public static int misterio(int n) {
        if (n == 0) {
            return 0;
        } else {
            int m = misterio(n - 1);
            return n + m;
        }
    }

    public static int fatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }

    public static int soma(int n) {
        if (n == 1) {// Se n for igual a 1 ele vai parar o lup?
            return 1;
        } else {
            return n + soma(n - 1);
        }
    }

    public static int potencia(int base, int expoente){
        if (expoente == 0){
            return 1;
        }else {
            return base * potencia(base, expoente - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Misterio:.... " + misterio(4));
        System.out.println("Fatorial:.... " + fatorial(3));
        System.out.println("Soma:........ " + soma(4));
        System.out.println("Potencial:... " + potencia(4,2));

    }


}
