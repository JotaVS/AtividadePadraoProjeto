package PadroesCriacao.AbstractFactory;

public class FabricaNotaDigital implements FabricaAbstrata{

    @Override
    public NotaFiscal emitirNota() {
        return new NotaFiscalDigital();
    }

}
