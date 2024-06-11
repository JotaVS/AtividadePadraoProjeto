package PadroesEstruturais.Decorator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDecorator {

    @Test
    public void testDecorator() {
        IDocumento documento = new DocumentoSimples("Conteudo");

        documento = new CabecalhoDecorator(documento, "Cabeçalho");
        documento = new RodapeDecorator(documento, "Rodapé");

        assertEquals("Cabeçalho\nConteudo\nRodapé", documento.getConteudo());
    }
}
