package PadroesComportamentais.Strategy;

public class ProcessadorPagamento {

    private PagamentoStrategy pagamentoStrategy;

    public void setPagamentoStrategy(PagamentoStrategy pagamentoStrategy) {
        this.pagamentoStrategy = pagamentoStrategy;
    }

    public String processarPagamento(double valor) {

        if (pagamentoStrategy == null) {
            throw new IllegalStateException("Metodo de pagamento invalido.");
        }
        return pagamentoStrategy.pagar(valor);
    }
}
