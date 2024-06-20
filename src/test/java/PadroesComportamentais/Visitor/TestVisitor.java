package PadroesComportamentais.Visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestVisitor {


    @Test
    public void testDamageCalculatorVisitor() {
        Personagem[] personagems = {
                new Guerreiro("O Guerreiro", 50),
                new Mago("O Mago", 70),
                new Arqueiro("O Arqueiro", 40)
        };

        CalculadorDanoVisitor calculadorDeDano = new CalculadorDanoVisitor();

        personagems[0].aceitar(calculadorDeDano);
        personagems[1].aceitar(calculadorDeDano);
        personagems[2].aceitar(calculadorDeDano);

        assertEquals(160, calculadorDeDano.getDanoTotal());
    }

    @Test
    public void testStatusReportVisitor() {
        Personagem[] personagems = {
                new Guerreiro("O Guerreiro", 50),
                new Mago("O Mago", 70),
                new Arqueiro("O Arqueiro", 40)
        };

        StatusVisitor geradorDeRelatorio = new StatusVisitor();

        personagems[0].aceitar(geradorDeRelatorio);
        personagems[1].aceitar(geradorDeRelatorio);
        personagems[2].aceitar(geradorDeRelatorio);

        assertEquals("Guerreiro: O Guerreiro, Poder de Ataque: 50\n" +
                "Mago: O Mago, Poder Mágico: 70\n" +
                "Arqueiro: O Arqueiro, Poder de Ataque à Distância: 40\n", geradorDeRelatorio.getRelatorio());
    }
}
