package PadroesComportamentais.ChainOfResponsability;

public class AltoSuporte extends ManipuladorSuporte {
    @Override
    protected boolean podeProcessar(PedidoSuporte pedido) {
        return pedido.getNivel() == 3;
    }

    @Override
    protected String processar(PedidoSuporte request) {
        return "Alto Suporte: Tratando pedido - " + request.getMensagem();
    }
}