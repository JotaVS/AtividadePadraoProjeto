package PadroesComportamentais.ChainOfResponsability;

public class MedioSuporte extends ManipuladorSuporte {
    @Override
    protected boolean podeProcessar(PedidoSuporte pedido) {
        return pedido.getNivel() == 2;
    }

    @Override
    protected String processar(PedidoSuporte request) {
        return "Medio Suporte: Tratando pedido - " + request.getMensagem();
    }
}