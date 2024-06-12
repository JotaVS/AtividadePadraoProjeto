package PadroesEstruturais.Facade;

public class DvdPlayer {
    public String on() {
        return "DVD Player Ligado";
    }

    public String play(String filme) {
        return "Reproduzindo o filme: " + filme;
    }

    public String off() {
        return "DVD Player Desligado";
    }
}
