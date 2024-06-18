package PadroesComportamentais.ChainOfResponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestChainOfResponsability {

    private ManipuladorSuporte suporteBaixo;
    private ManipuladorSuporte suporteMedio;
    private ManipuladorSuporte suporteAlto;

    @BeforeEach
    public void setUp() {
        suporteBaixo = new BaixoSuporte();
        suporteMedio = new MedioSuporte();
        suporteAlto = new AltoSuporte();

        suporteBaixo.setProximoSuporte(suporteMedio);
        suporteMedio.setProximoSuporte(suporteAlto);
    }

    @Test
    public void testePedidoSuporteBaixo() {
        PedidoSuporte pedidoBaixo = new PedidoSuporte("Problema de baixo nível", 1);
        String resultado = suporteBaixo.processarPedido(pedidoBaixo);
        assertEquals("Baixo Suporte: Tratando pedido - Problema de baixo nível", resultado);
    }

    @Test
    public void testePedidoSuporteMedio() {
        PedidoSuporte pedidoMedio = new PedidoSuporte("Problema de nível médio", 2);
        String resultado = suporteBaixo.processarPedido(pedidoMedio);
        assertEquals("Medio Suporte: Tratando pedido - Problema de nível médio", resultado);
    }

    @Test
    public void testePedidoSuporteAlto() {
        PedidoSuporte pedidoAlto = new PedidoSuporte("Problema de alto nível", 3);
        String resultado = suporteBaixo.processarPedido(pedidoAlto);
        assertEquals("Alto Suporte: Tratando pedido - Problema de alto nível", resultado);
    }

    @Test
    public void testePedidoNaoManipulavelNivelInvalido() {
        PedidoSuporte pedidoNaoManipulavel = new PedidoSuporte("Problema desconhecido", 4);
        String resultado = suporteBaixo.processarPedido(pedidoNaoManipulavel);
        assertEquals("Pedido não processado.", resultado);
    }
}
