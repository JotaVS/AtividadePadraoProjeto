package PadroesCriacao.Builder;

public class ProdutoBuilder {
    private Produto produto;

    public ProdutoBuilder(){ produto = new Produto();}

    public Produto build(){
        if (produto.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (produto.getPreco()== 0) {
            throw new IllegalArgumentException("Preco inválido");

        }
        return produto;
    }

    public ProdutoBuilder setNome(String nome){
        produto.setNome(nome);
        return this;
    }

    public ProdutoBuilder setDescricao(String descricao){
        produto.setDescricao(descricao);
        return this;
    }

    public ProdutoBuilder setPreco(double preco){
        produto.setPreco(preco);
        return this;
    }



}
