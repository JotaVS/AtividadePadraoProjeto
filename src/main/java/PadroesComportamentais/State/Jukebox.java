package PadroesComportamentais.State;

public class Jukebox {


    private JukeboxEstado estado;

    public Jukebox() {
        this.estado = JukeboxEstadoParado.getInstance();
    }

    public void setEstado(JukeboxEstado estado) {
        this.estado = estado;
    }

    public boolean inserirMoeda() {
        return estado.inserirMoeda(this);
    }

    public boolean iniciarMusica() {
        return estado.iniciarMusica(this);
    }

    public boolean pararMusica() {
        return estado.pararMusica(this);
    }


    public JukeboxEstado getEstado() {
        return estado;
    }
}
