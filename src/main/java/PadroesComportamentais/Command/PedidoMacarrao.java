package PadroesComportamentais.Command;

public class PedidoMacarrao implements Command{
    private ReceptorPedido receptor;

    public PedidoMacarrao(ReceptorPedido receptor) {
        this.receptor = receptor;
    }

    @Override
    public String execute() {
        return receptor.prepareMacarrao();
    }
}
