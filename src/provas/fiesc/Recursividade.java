package provas.fiesc;

import java.util.Scanner;

public class Recursividade {

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
        if (n == 1) {
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

    public static void repetirMensagem(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a mensagem: ");
        String mensagem = scanner.nextLine();

        if (mensagem.equals("fim")){
            return;
        }else {
            System.out.println("Digitou: " + mensagem);
            repetirMensagem();
        }
    }

    public static void main(String[] args) {
        repetirMensagem();
    }


}
