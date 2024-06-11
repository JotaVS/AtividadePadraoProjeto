package PadroesEstruturais.Decorator;

public class DocumentoSimples implements IDocumento {
    private String conteudo;

    public DocumentoSimples(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }
}
