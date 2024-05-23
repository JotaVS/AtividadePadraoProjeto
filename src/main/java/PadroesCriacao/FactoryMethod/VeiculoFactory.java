package PadroesCriacao.FactoryMethod;

public class VeiculoFactory {
    public static Veiculo criarVeiculo(String tipoVeiculo) {
        if (tipoVeiculo.equalsIgnoreCase("carro")) {
            return new Carro();
        } else if (tipoVeiculo.equalsIgnoreCase("moto")) {
            return new Moto();
        } else if (tipoVeiculo.equalsIgnoreCase("bicicleta")) {
            return new Bicicleta();
        } else {
            throw new IllegalArgumentException("Tipo de veículo inválido!");
        }
    }
}
