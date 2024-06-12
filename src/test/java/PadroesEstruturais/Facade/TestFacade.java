package PadroesEstruturais.Facade;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestFacade {


    @Test
    public void testWatchMovie() {
        DvdPlayer dvd = new DvdPlayer();
        Projetor projetor = new Projetor();
        SoundBar soundBar = new SoundBar();
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvd, projetor, soundBar);

        List<String> actions = homeTheater.watchMovie("The Matrix");

        assertEquals(8, actions.size());
        assertEquals("Preparando o filme...", actions.get(0));
        assertEquals("DVD Player Ligado", actions.get(1));
        assertEquals("Reproduzindo o filme: The Matrix", actions.get(2));
        assertEquals("Projetor Ligado", actions.get(3));
        assertEquals("Projetor conectado ao DVD", actions.get(4));
        assertEquals("SoundBar Ligado", actions.get(5));
        assertEquals("Volume da SoundBar em 5", actions.get(6));
        assertEquals("Filme Pronto!", actions.get(7));
    }

    @Test
    public void testEndMovie() {
        DvdPlayer dvd = new DvdPlayer();
        Projetor projetor = new Projetor();
        SoundBar soundBar = new SoundBar();
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvd, projetor, soundBar);

        List<String> actions = homeTheater.endMovie();

        assertEquals(5, actions.size());
        assertEquals("Desligando Home Theater...", actions.get(0));
        assertEquals("DVD Player Desligado", actions.get(1));
        assertEquals("Projetor Desligado", actions.get(2));
        assertEquals("SoundBar Desligado", actions.get(3));
        assertEquals("Home Theater Desligado", actions.get(4));
    }
}
