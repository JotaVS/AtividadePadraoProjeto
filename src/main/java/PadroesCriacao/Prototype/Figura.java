package PadroesCriacao.Prototype;

public class Figura implements Cloneable {

    private String nome;
    private String cor;
    private int x, y;

    public Figura(String nome, String cor, int x, int y) {
        this.nome = nome;
        this.cor = cor;
        this.x = x;
        this.y = y;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public Figura clone() throws CloneNotSupportedException {
        return (Figura) super.clone();
    }
}