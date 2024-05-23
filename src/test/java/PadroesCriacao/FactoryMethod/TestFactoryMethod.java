package PadroesCriacao.FactoryMethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestFactoryMethod {
    @Test
    public void testCriarCarro() {
        Veiculo veiculo = VeiculoFactory.criarVeiculo("carro");

        assertEquals("Acelerando o carro...", veiculo.acelerar());
        assertEquals("Freando o carro...", veiculo.frear());
        assertEquals("Dirigindo o carro...", veiculo.dirigir());
    }

    @Test
    public void testCriarMoto() {
        Veiculo veiculo = VeiculoFactory.criarVeiculo("moto");

        assertEquals("Acelerando a moto...", veiculo.acelerar());
        assertEquals("Freando a moto...", veiculo.frear());
        assertEquals("Dirigindo a moto...", veiculo.dirigir());
    }

    @Test
    public void testCriarBicicleta() {
        Veiculo veiculo = VeiculoFactory.criarVeiculo("bicicleta");


        assertEquals("Pedalando a bicicleta...", veiculo.acelerar());
        assertEquals("Freando a bicicleta...", veiculo.frear());
        assertEquals("Andando de bicicleta...", veiculo.dirigir());
    }

    @Test
    void testVeiculoInvalido() {
        try {
            Veiculo veiculo = VeiculoFactory.criarVeiculo("avião");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tipo de veículo inválido!", e.getMessage());
        }
    }

}