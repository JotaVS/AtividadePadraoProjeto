package PadroesComportamentais.Command;

public class PedidoPizza implements Command{
    private ReceptorPedido receptor;

    public PedidoPizza(ReceptorPedido receptor) {
        this.receptor = receptor;
    }

    @Override
    public String execute() {
        return receptor.preparePizza();
    }
}
