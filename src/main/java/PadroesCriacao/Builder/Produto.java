package PadroesCriacao.Builder;

public class Produto {

    public String nome;
    public String descricao;
    public double preco;

    public Produto() {
        this.nome = "";
        this.descricao = "";
        this.preco = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
