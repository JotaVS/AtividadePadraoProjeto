package PadroesComportamentais.TemplateMethod;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTemplateMethod {
    @Test
    public void testGuerreiroRealizarAtaque() {
        Personagem guerreiro = new Guerreiro();
        String resultado = guerreiro.realizarAtaque();

        String saida = "Preparando para atacar...\n" +
                "Guerreiro atacando com espada!\n" +
                "Ataque finalizado.\n";
        assertEquals(saida, resultado);
    }

    @Test
    public void testMagoRealizarAtaque() {
        Personagem mago = new Mago();
        String resultado = mago.realizarAtaque();

        String saida = "Preparando para atacar...\n" +
                "Mago lançando uma bola de fogo!\n" +
                "Ataque finalizado.\n";
        assertEquals(saida, resultado);
    }
}
