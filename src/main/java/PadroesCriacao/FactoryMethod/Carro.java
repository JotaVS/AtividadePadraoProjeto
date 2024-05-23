package PadroesCriacao.FactoryMethod;

public class Carro implements Veiculo {
    @Override
    public String acelerar() {
        return "Acelerando o carro...";
    }

    @Override
    public String frear() {
        return "Freando o carro...";
    }

    @Override
    public String dirigir() {
        return "Dirigindo o carro...";
    }
}
