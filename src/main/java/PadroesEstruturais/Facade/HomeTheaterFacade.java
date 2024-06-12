package PadroesEstruturais.Facade;

import java.util.ArrayList;
import java.util.List;

public class HomeTheaterFacade {

    private final DvdPlayer dvd;
    private final Projetor projetor;
    private final SoundBar soundBar;

    public HomeTheaterFacade(DvdPlayer dvd, Projetor projetor, SoundBar soundBar) {
        this.dvd = dvd;
        this.projetor = projetor;
        this.soundBar = soundBar;
    }

    public List<String> watchMovie(String filme) {
        List<String> actions = new ArrayList<>();
        actions.add("Preparando o filme...");
        actions.add(dvd.on());
        actions.add(dvd.play(filme));
        actions.add(projetor.on());
        actions.add(projetor.setInput("DVD"));
        actions.add(soundBar.on());
        actions.add(soundBar.setVolume(5));
        actions.add("Filme Pronto!");
        return actions;
    }

    public List<String> endMovie() {
        List<String> actions = new ArrayList<>();
        actions.add("Desligando Home Theater...");
        actions.add(dvd.off());
        actions.add(projetor.off());
        actions.add(soundBar.off());
        actions.add("Home Theater Desligado");
        return actions;
    }
}
