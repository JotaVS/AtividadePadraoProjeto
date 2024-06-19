package PadroesComportamentais.Command;

public class PedidoSalada implements Command{
    private ReceptorPedido receptor;

    public PedidoSalada(ReceptorPedido receptor) {
        this.receptor = receptor;
    }

    @Override
    public String execute() {
        return receptor.prepareSalada();
    }
}
