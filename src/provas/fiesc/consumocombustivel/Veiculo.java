package provas.fiesc.consumocombustivel;

public abstract class Veiculo {

    private String modelo;
    private int ano;

    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public abstract double calcularConsumoCombustivel();
}
