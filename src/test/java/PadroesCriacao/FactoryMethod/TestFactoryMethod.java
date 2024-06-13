package PadroesCriacao.FactoryMethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestFactoryMethod {

    @Test
    public void testCriacaoCarro() {
        Veiculo veiculo = VeiculoFactory.criarVeiculo("carro");
        assertNotNull(veiculo);
    }

    @Test
    public void testCarroAcelerar() {
        Veiculo veiculo = VeiculoFactory.criarVeiculo("carro");
        assertEquals("Acelerando o carro...", veiculo.acelerar());
    }

    @Test
    public void testCarroFrear() {
        Veiculo veiculo = VeiculoFactory.criarVeiculo("carro");
        assertEquals("Freando o carro...", veiculo.frear());
    }

    @Test
    public void testCarroDirigir() {
        Veiculo veiculo = VeiculoFactory.criarVeiculo("carro");
        assertEquals("Dirigindo o carro...", veiculo.dirigir());
    }

    @Test
    public void testCriacaoMoto() {
        Veiculo veiculo = VeiculoFactory.criarVeiculo("moto");
        assertNotNull(veiculo);
    }

    @Test
    public void testMotoAcelerar() {
        Veiculo veiculo = VeiculoFactory.criarVeiculo("moto");
        assertEquals("Acelerando a moto...", veiculo.acelerar());
    }

    @Test
    public void testMotoFrear() {
        Veiculo veiculo = VeiculoFactory.criarVeiculo("moto");
        assertEquals("Freando a moto...", veiculo.frear());
    }

    @Test
    public void testMotoDirigir() {
        Veiculo veiculo = VeiculoFactory.criarVeiculo("moto");
        assertEquals("Dirigindo a moto...", veiculo.dirigir());
    }

    @Test
    public void testCriacaoBicicleta() {
        Veiculo veiculo = VeiculoFactory.criarVeiculo("bicicleta");
        assertNotNull(veiculo);
    }

    @Test
    public void testBicicletaAcelerar() {
        Veiculo veiculo = VeiculoFactory.criarVeiculo("bicicleta");
        assertEquals("Pedalando a bicicleta...", veiculo.acelerar());
    }

    @Test
    public void testBicicletaFrear() {
        Veiculo veiculo = VeiculoFactory.criarVeiculo("bicicleta");
        assertEquals("Freando a bicicleta...", veiculo.frear());
    }

    @Test
    public void testBicicletaDirigir() {
        Veiculo veiculo = VeiculoFactory.criarVeiculo("bicicleta");
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