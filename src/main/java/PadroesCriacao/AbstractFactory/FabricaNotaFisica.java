package PadroesCriacao.AbstractFactory;

public class FabricaNotaFisica implements FabricaAbstrata{
    @Override
    public NotaFiscal emitirNota() {
        return new NotaFiscalFisica();
    }
}
