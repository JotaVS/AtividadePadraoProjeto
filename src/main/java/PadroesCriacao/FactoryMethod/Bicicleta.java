package PadroesCriacao.FactoryMethod;

public class Bicicleta implements Veiculo {
    @Override
    public String acelerar() {
        return "Pedalando a bicicleta...";

    }

    @Override
    public String frear() {
        return "Freando a bicicleta...";

    }

    @Override
    public String dirigir() {
        return "Andando de bicicleta...";
    }
}
