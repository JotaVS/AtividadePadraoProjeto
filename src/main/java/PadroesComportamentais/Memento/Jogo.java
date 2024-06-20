package PadroesComportamentais.Memento;

public class Jogo {
    private int nivelAtual;

    public Jogo() {
        nivelAtual = 1;
    }

    public int getNivelAtual() {
        return nivelAtual;
    }

    public void avancarNivel() {
        nivelAtual++;
    }

    public Checkpoint criarCheckpoint() {
        return new Checkpoint(nivelAtual);
    }

    public void restaurarCheckpoint(Checkpoint checkpoint) {
        nivelAtual = checkpoint.getNivelCheckpoint();
    }
}
