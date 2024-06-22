package provas.fiesc.consumocombustivel;

public class Teste {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Fusca", 1980, 1300);
        Moto moto1 = new Moto("CG 125", 2005, 125);

        // Chamada dos métodos
        System.out.println("Consumo de combustível do carro: " + carro1.calcularConsumoCombustivel() + " km/l");
        System.out.println("Consumo de combustível da moto: " + moto1.calcularConsumoCombustivel() + " km/l");

    }
}
