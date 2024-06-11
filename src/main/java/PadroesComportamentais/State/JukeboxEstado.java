package PadroesComportamentais.State;

public abstract class JukeboxEstado {

    public abstract String getEstado();

    public boolean inserirMoeda(Jukebox jukebox) {
        return false;
    }

    public boolean iniciarMusica(Jukebox jukebox) {
        return false;
    }

    public boolean pararMusica(Jukebox jukebox) {
        return false;
    }


}
