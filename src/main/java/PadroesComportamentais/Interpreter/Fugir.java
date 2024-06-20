package PadroesComportamentais.Interpreter;

public class Fugir implements Acao{

    @Override
    public String interpret(Jogador jogador) {
        return jogador.getNome() + " foge da batalha.";
    }
}
