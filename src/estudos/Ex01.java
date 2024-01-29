package estudos;

public class Ex01 {
    public static void main(String[] args){
        // criar um metodo que chama outra classe

        String MSG_VALOR = "O valor informado é %s.";
        ExercicioService exercicioService = new ExercicioService();
        int valor = exercicioService.getValor();
        System.out.println(String.format(MSG_VALOR,valor));
    }
}
