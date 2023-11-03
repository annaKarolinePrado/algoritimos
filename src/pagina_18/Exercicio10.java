package pagina_18;

public class Exercicio10 {
    public static void main(String[] args) {
    /*  10. Elabore um algoritmo que cadastre a idade de uma pessoa, e emita na tela uma
        mensagem conforme a tabela:
            - Menor 16 anos: Não poderá votar.
            - De 16 a 17 anos: Voto opcional.
            - De 18 a 60 anos: Voto obrigatório.
            - Mais de 60 anos: Voto opcional
     */
        String MSG_NAO_VOTAR        = "Eleitor %s com %s anos, não poderá votar";
        String MSG_VOTO_OPCIONAL    = "Eleitor %s com %s anos, pode optar por votar ou não votar";
        String MSG_VOTO_OBRIGATORIO = "Eleitor %s com %s anos, é obrigado a votar";

        String nome_eleitor = "Ambrósi da Pixar de Disney";
        int idade_eleitor = 61;

        if (idade_eleitor > 0){
            if (idade_eleitor <= 15){
                System.out.println(String.format(MSG_NAO_VOTAR, nome_eleitor, idade_eleitor));
            } else if ((idade_eleitor >= 16) && (idade_eleitor <= 17)) {
                System.out.println(String.format(MSG_VOTO_OPCIONAL, nome_eleitor, idade_eleitor));
            } else if ((idade_eleitor>= 18) && (idade_eleitor <= 60)) {
                System.out.println(String.format(MSG_VOTO_OBRIGATORIO, nome_eleitor, idade_eleitor));
            } else if (idade_eleitor > 60) {
                System.out.println(String.format(MSG_VOTO_OPCIONAL, nome_eleitor, idade_eleitor));
            }
        }else {
            System.out.println("Informe uma idade valida maior zero.");
        }
    }
}
