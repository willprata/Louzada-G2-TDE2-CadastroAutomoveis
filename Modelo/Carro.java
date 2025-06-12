package modell;

public class Carro extends Veiculo {
    private int qtdPortas;

    public Carro(String placa, String modelo, int ano, int qtdPortas) {
        super(placa, modelo, ano);
        this.qtdPortas = qtdPortas;
    }

    public void exibirDados() {
        System.out.println("Carro - Modelo: " + getModelo() + " | Placa: " + getPlaca() + " | Ano: " + getAno() + " | Portas: " + qtdPortas);
    }
}
