package provas.fiesc.consumocombustivel;

public class Carro extends Veiculo {

    private int cilindradas;

    public Carro(String modelo, int ano, int cilindradas) {
        super(modelo, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularConsumoCombustivel() {
        return cilindradas / 20.0;
    }
}
