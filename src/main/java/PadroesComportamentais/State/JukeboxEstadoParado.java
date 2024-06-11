package PadroesComportamentais.State;

public class JukeboxEstadoParado extends JukeboxEstado{
    private JukeboxEstadoParado() {
    }

    ;
    private static JukeboxEstadoParado instance = new JukeboxEstadoParado();

    public static JukeboxEstadoParado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Jukebox Parada";
    }

    public boolean inserirMoeda(Jukebox jukebox) {
        jukebox.setEstado(JukeboxEstadoMoedaInserida.getInstance());
        return true;
    }

}
