package PadroesCriacao.FactoryMethod;

public class Moto implements Veiculo {
    @Override
    public String acelerar() {
        return "Acelerando a moto...";
    }

    @Override
    public String frear() {
        return "Freando a moto...";
    }

    @Override
    public String dirigir() {
        return "Dirigindo a moto...";
    }
}
