package PadroesEstruturais.Decorator;

public class RodapeDecorator extends DocumentoDecorator {
    private String rodape;

    public RodapeDecorator(IDocumento documentoDecorado, String rodape) {
        super(documentoDecorado);
        this.rodape = rodape;
    }

    @Override
    public String getConteudo() {
        return super.getConteudo() + "\n" + rodape;
    }
}
