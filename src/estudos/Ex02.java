package estudos;

public class Ex02 {
    public static void main(String[] args){

        String MSG_MULTIPLICACAO = "O resultado da multiplicação de %s e %s é %s.";
        ExercicioService exercicioService = new ExercicioService();

        int um = 4;
        int dois = 2;
        int multiplica = exercicioService.setMultiplicar(um,dois);
        System.out.println(String.format(MSG_MULTIPLICACAO,um,dois,multiplica));
    }
}
