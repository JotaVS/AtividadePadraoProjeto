package PadroesCriacao.Singleton;

public class PlayerMusica {

    private static PlayerMusica instance;
    private String musicaAtual;

    private PlayerMusica() { }

    public static PlayerMusica getInstance() {
        if (instance == null) {
            instance = new PlayerMusica();
        }
        return instance;
    }

    public void setMusicaAtual(String musica) {
        this.musicaAtual = musica;
    }

    public String getMusicaAtual() {
        return musicaAtual;
    }
}