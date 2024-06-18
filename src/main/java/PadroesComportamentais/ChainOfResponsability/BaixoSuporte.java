package PadroesComportamentais.ChainOfResponsability;

public class BaixoSuporte extends ManipuladorSuporte {
    @Override
    protected boolean podeProcessar(PedidoSuporte pedido) {
        return pedido.getNivel() == 1;
    }

    @Override
    protected String processar(PedidoSuporte request) {
        return "Baixo Suporte: Tratando pedido - " + request.getMensagem();
    }
}