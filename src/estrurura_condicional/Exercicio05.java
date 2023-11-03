package estrurura_condicional;

public class Exercicio05 {
    public static void main(String[] args) {
        String MSG_APROVADO = "O aluno %s obteve as notas %s, %s e %s com média %s foi APROVADO.";
        String MSG_REPROVADO = "O aluno %s obteve as notas %s, %s e %s com média %s foi REPROVADO.";

        String nome = "Ambrósio";
        float nota01 = 10;
        float nota02 = 1;
        float nota03 = 1;
        float media = (nota01 + nota02 + nota03) / 3;

        if (media >= 7){
            System.out.println(String.format(MSG_APROVADO,nome,nota01,nota02,nota03,media));
        }else {
            System.out.println(String.format(MSG_REPROVADO,nome,nota01,nota02,nota03,media));
        }
    }
}
