package PadroesCriacao.AbstractFactory;

public class Pedido {
    private NotaFiscal notaFiscal;

    public Pedido(FabricaAbstrata fabrica) {
        this.notaFiscal = fabrica.emitirNota();
    }

    public String emitirNotaFiscal() {
        return this.notaFiscal.emitir();
    }
}
