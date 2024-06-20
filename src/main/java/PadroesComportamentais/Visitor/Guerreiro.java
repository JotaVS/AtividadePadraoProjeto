package PadroesComportamentais.Visitor;

public class Guerreiro implements Personagem {
    private String nome;
    private int danoAtaque;

    public Guerreiro(String nome, int danoAtaque) {
        this.nome = nome;
        this.danoAtaque = danoAtaque;
    }

    public String getNome() {
        return nome;
    }

    public int getDanoAtaque() {
        return danoAtaque;
    }

    @Override
    public String aceitar(PersonagemVisitor visitor) {
        return visitor.visitar(this);
    }
}