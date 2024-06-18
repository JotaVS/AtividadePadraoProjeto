package PadroesComportamentais.ChainOfResponsability;

public abstract class ManipuladorSuporte {
    protected ManipuladorSuporte proximoSuporte;

    public void setProximoSuporte(ManipuladorSuporte proximoSuporte) {
        this.proximoSuporte = proximoSuporte;
    }

    public String processarPedido(PedidoSuporte pedido) {
        if (podeProcessar(pedido)) {
            return processar(pedido);
        } else if (proximoSuporte != null) {
            return proximoSuporte.processarPedido(pedido);
        }
        return "Pedido não processado.";
    }

    protected abstract boolean podeProcessar(PedidoSuporte request);
    protected abstract String processar(PedidoSuporte request);
}