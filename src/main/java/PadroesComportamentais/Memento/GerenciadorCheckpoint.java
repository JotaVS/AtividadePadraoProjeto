package PadroesComportamentais.Memento;

public class GerenciadorCheckpoint {
    private Checkpoint checkpoint;

    public void salvarCheckpoint(Jogo jogo) {
        checkpoint = jogo.criarCheckpoint();
    }

    public void restaurarCheckpoint(Jogo jogo) {
        if (checkpoint == null) {
            throw new IllegalStateException("Nenhum checkpoint salvo.");
        }
        jogo.restaurarCheckpoint(checkpoint);
    }
}