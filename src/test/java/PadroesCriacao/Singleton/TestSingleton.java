package PadroesCriacao.Singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class TestSingleton {
    @Test
    public void deveObterInstanciaUnicaDoPlayer() {
        PlayerMusica player1 = PlayerMusica.getInstance();
        PlayerMusica player2 = PlayerMusica.getInstance();

        assertSame(player1, player2);
    }

    @Test
    public void deveTocarMusicaAtual() {
        PlayerMusica player = PlayerMusica.getInstance();

        player.setMusicaAtual("Highway to Hell");

        assertEquals("Highway to Hell", player.getMusicaAtual());
    }
}
