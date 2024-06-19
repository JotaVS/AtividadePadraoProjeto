package PadroesComportamentais.Iterator;

public class Jogo {

    private final String nome;
    private boolean finalizado;


    public Jogo(String nome, boolean finalizado){
        this.finalizado = finalizado;
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public boolean getFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }
}
