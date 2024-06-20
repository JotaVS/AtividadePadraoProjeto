package PadroesComportamentais.Interpreter;

public class Atacar implements Acao{
    private String alvo;

    public Atacar(String alvo) {
        this.alvo = alvo;
    }

    @Override
    public String interpret(Jogador jogador) {
        return jogador.getNome() + " ataca " + alvo + ".";
    }
}
