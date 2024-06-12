package PadroesEstruturais.Flyweight;

public class TipoArvore {

    private final String nome;
    private final String cor;
    private final String textura;

    public TipoArvore(String nome, String cor, String textura) {
        this.nome = nome;
        this.cor = cor;
        this.textura = textura;
    }

    // Getters for testing and toString for demonstration
    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public String getTextura() {
        return textura;
    }

    @Override
    public String toString() {
        return "TipoArvore{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", textura='" + textura + '\'' +
                '}';
    }
}
