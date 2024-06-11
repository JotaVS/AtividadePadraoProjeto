package PadroesComportamentais.State;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class TestState {

    Jukebox jukeboxParada;
    Jukebox jukeboxTocando;
    Jukebox jukeboxMoedaInserida;



    @BeforeEach
    public void setUp() {
        jukeboxParada = new Jukebox();
        jukeboxParada.setEstado(JukeboxEstadoParado.getInstance());

        jukeboxTocando = new Jukebox();
        jukeboxTocando.setEstado(JukeboxEstadoTocando.getInstance());

        jukeboxMoedaInserida = new Jukebox();
        jukeboxMoedaInserida.setEstado(JukeboxEstadoMoedaInserida.getInstance());

    }


    //JukeboxParada
    @Test
    public void naoPodeIniciarJukeboxParada() {
        assertFalse(jukeboxParada.iniciarMusica());
    }

    @Test
    public void naoPodePararJukeboxParada() {
        assertFalse(jukeboxParada.pararMusica());
    }

    @Test
    public void deveAceitarMoedaJukeboxParada() {
        assertTrue(jukeboxParada.inserirMoeda());
        assertEquals("Jukebox Possui Moeda",jukeboxParada.getEstado().getEstado());
    }


    //JukeboxTocando
    @Test
    public void naoPodeIniciarJukeboxTocando() {
        assertFalse(jukeboxTocando.iniciarMusica());
    }

    @Test
    public void devePararJukeboxTocando() {
        assertTrue(jukeboxTocando.pararMusica());
        assertEquals("Jukebox Parada",jukeboxTocando.getEstado().getEstado());

    }

    @Test
    public void naoPodeAceitarMoedaJukeboxTocando() {
        assertFalse(jukeboxTocando.inserirMoeda());
    }


    //JukeboxMoedaInserida
    @Test
    public void deveIniciarJukeboxMoedaInserida() {
        assertTrue(jukeboxMoedaInserida.iniciarMusica());
        assertEquals("Jukebox Tocando",jukeboxMoedaInserida.getEstado().getEstado());

    }

    @Test
    public void naoPodePararJukeboxMoedaInserida() {
        assertFalse(jukeboxMoedaInserida.pararMusica());
    }

    @Test
    public void naoPodeAceitarMoedaJukeboxMoedaInserida() {
        assertFalse(jukeboxMoedaInserida.inserirMoeda());
    }

}
