package estrurura_condicional.exercicios;

public class Exercicio07 {
    public static void main(String[] args) {
        String MSG_INFANTIL = "%s com %s anos se enquadra na categoria INFANTIL.";
        String MSG_ADULTO   = "%s com %s anos se enquadra na categoria ADULTO.";
        String MSG_JUVENIL  = "%s com %s anos se enquadra na categoria JUVENIL.";

        String nome = "Rebecca";
        int idade = 100;

        if ((idade >= 6) && (idade <= 10)){
            System.out.println(String.format(MSG_INFANTIL,nome,idade));
        } else if ((idade <= 17)) {
            System.out.println(String.format(MSG_JUVENIL,nome,idade));
        } else if (idade >= 18) {
            System.out.println(String.format(MSG_ADULTO,nome,idade));
        } else {
            System.out.println("Idade não classificada.");
        }
    }
}
