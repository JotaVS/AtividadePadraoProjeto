package PadroesComportamentais.State;

public class JukeboxEstadoMoedaInserida extends JukeboxEstado{

    private JukeboxEstadoMoedaInserida() {
    }

    ;
    private static JukeboxEstadoMoedaInserida instance = new JukeboxEstadoMoedaInserida();

    public static JukeboxEstadoMoedaInserida getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Jukebox Possui Moeda";
    }

    public boolean iniciarMusica(Jukebox jukebox) {
        jukebox.setEstado(JukeboxEstadoTocando.getInstance());
        return true;
    }
}
