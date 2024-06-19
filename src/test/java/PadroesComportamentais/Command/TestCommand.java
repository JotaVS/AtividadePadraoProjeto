package PadroesComportamentais.Command;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCommand {
    @Test
    public void testPedidoPizza() {
        ReceptorPedido receptor = new ReceptorPedido();
        Command pedidoPizza = new PedidoPizza(receptor);
        Garcom garcom = new Garcom();
        garcom.setCommand(pedidoPizza);
        String resultado = garcom.anotarPedido();

        assertEquals("A Pizza está sendo feita.", resultado);
    }

    @Test
    public void testPedidoMacarrao() {
        ReceptorPedido receptor = new ReceptorPedido();
        Command pedidoMacarrao = new PedidoMacarrao(receptor);
        Garcom garcom = new Garcom();
        garcom.setCommand(pedidoMacarrao);
        String result = garcom.anotarPedido();

        assertEquals("O Macarrao está sendo feito.", result);
    }

    @Test
    public void testPedidoSalada() {
        ReceptorPedido receptor = new ReceptorPedido();
        Command pedidoSalada = new PedidoSalada(receptor);
        Garcom waiter = new Garcom();
        waiter.setCommand(pedidoSalada);
        String result = waiter.anotarPedido();

        assertEquals("A Salada está sendo feita.", result);
    }
}
