package PadroesEstruturais.Decorator;

public class DocumentoDecorator implements IDocumento{
    protected IDocumento documentoDecorado;

    public DocumentoDecorator(IDocumento documentoDecorado) {
        this.documentoDecorado = documentoDecorado;
    }

    @Override
    public String getConteudo() {
        return documentoDecorado.getConteudo();
    }
}
