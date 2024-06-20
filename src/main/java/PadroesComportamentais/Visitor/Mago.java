package PadroesComportamentais.Visitor;

public class Mago implements Personagem {
    private String nome;
    private int danoMagico;

    public Mago(String nome, int danoMagico) {
        this.nome = nome;
        this.danoMagico = danoMagico;
    }

    public String getNome() {
        return nome;
    }

    public int getDanoMagico() {
        return danoMagico;
    }

    @Override
    public String aceitar(PersonagemVisitor visitor) {
        return visitor.visitar(this);
    }
}