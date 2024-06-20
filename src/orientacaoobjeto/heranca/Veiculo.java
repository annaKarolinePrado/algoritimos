package orientacaoobjeto.heranca;

public class Veiculo {
    private String marca;

    public Veiculo(String marca) {
        this.marca = marca;
    }

    public void ligar() {
        System.out.println("O veículo está ligado.");
    }

    public void desligar() {
        System.out.println("O veículo está desligado.");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}