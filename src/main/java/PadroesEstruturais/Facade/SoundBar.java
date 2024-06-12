package PadroesEstruturais.Facade;

public class SoundBar {
    public String on() {
            return "SoundBar Ligado";
    }

    public String setVolume(int nivel) {
        return "Volume da SoundBar em " + nivel;
    }

    public String off() {
        return "SoundBar Desligado";
    }
}
