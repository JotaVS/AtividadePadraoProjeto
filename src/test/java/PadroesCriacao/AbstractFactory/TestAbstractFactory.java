package PadroesCriacao.AbstractFactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAbstractFactory {

    @Test
    public void TesteEmitirNotaFisica(){
        FabricaAbstrata fabrica = new FabricaNotaFisica();
        Pedido pedido = new Pedido(fabrica);
        assertEquals("Nota Fiscal Fisica.", pedido.emitirNotaFiscal());
    }

    @Test
    public void TesteEmitirNotaDigital(){
        FabricaAbstrata fabrica = new FabricaNotaDigital();
        Pedido pedido = new Pedido(fabrica);
        assertEquals("Nota Fiscal Digital.", pedido.emitirNotaFiscal());
    }
}
