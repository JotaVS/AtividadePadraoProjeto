package PadroesComportamentais.Memento;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMemento {

    @Test
    public void testarCheckpoint() {
        Jogo jogo = new Jogo();
        GerenciadorCheckpoint gerenciador = new GerenciadorCheckpoint();

        jogo.avancarNivel();

        gerenciador.salvarCheckpoint(jogo);

        jogo.avancarNivel();
        jogo.avancarNivel();

        assertEquals(4, jogo.getNivelAtual());

        gerenciador.restaurarCheckpoint(jogo);

        assertEquals(2, jogo.getNivelAtual());

    }

    @Test
    public void testeCheckpointVazio(){
        Jogo jogo = new Jogo();
        GerenciadorCheckpoint gerenciador = new GerenciadorCheckpoint();
        IllegalStateException excecao = null;
        try {
            gerenciador.restaurarCheckpoint(jogo);
        } catch (IllegalStateException e) {
            excecao = e;
        }
        assertEquals("Nenhum checkpoint salvo.", excecao.getMessage());
    }
}
