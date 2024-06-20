package orientacaoobjeto.heranca;

public class Carro extends Veiculo {
    private int ano;

    public Carro(String marca, int ano) {
        super(marca); // Chamada ao construtor da superclasse
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}