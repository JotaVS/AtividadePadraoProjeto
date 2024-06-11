package PadroesComportamentais.State;

public class JukeboxEstadoTocando extends JukeboxEstado{
    private JukeboxEstadoTocando() {
    }

    ;
    private static JukeboxEstadoTocando instance = new JukeboxEstadoTocando();

    public static JukeboxEstadoTocando getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Jukebox Tocando";
    }

    public boolean pararMusica(Jukebox jukebox) {
        jukebox.setEstado(JukeboxEstadoParado.getInstance());
        return true;
    }
}
