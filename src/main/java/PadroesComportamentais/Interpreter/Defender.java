package PadroesComportamentais.Interpreter;

public class Defender implements Acao{

    @Override
    public String interpret(Jogador jogador) {
        return jogador.getNome() + " está defendendo.";
    }
}
