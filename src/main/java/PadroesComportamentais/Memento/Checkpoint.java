package PadroesComportamentais.Memento;

public class Checkpoint {
    private final int nivelCheckpoint;

    public Checkpoint(int nivel) {
        this.nivelCheckpoint = nivel;
    }

    public int getNivelCheckpoint() {
        return nivelCheckpoint;
    }
}