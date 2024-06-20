package PadroesComportamentais.Visitor;

public class Arqueiro implements Personagem {
    private String nome;
    private int danoDistancia;

    public Arqueiro(String nome, int danoDistancia) {
        this.nome = nome;
        this.danoDistancia = danoDistancia;
    }

    public String getNome() {
        return nome;
    }

    public int getDanoDistancia() {
        return danoDistancia;
    }

    @Override
    public String aceitar(PersonagemVisitor visitor) {
        return visitor.visitar(this);
    }
}