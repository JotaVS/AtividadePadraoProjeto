package PadroesEstruturais.Decorator;

public class CabecalhoDecorator extends DocumentoDecorator {
    private String cabecalho;

    public CabecalhoDecorator(IDocumento documentoDecorado, String cabecalho) {
        super(documentoDecorado);
        this.cabecalho = cabecalho;
    }

    @Override
    public String getConteudo() {
        return cabecalho + "\n" + super.getConteudo();
    }
}
