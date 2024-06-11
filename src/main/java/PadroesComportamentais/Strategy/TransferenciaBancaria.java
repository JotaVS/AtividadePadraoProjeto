package PadroesComportamentais.Strategy;

public class TransferenciaBancaria implements PagamentoStrategy{
    private String numeroConta;
    private String codigoBanco;

    public TransferenciaBancaria(String numeroConta, String codigoBanco) {
        this.numeroConta = numeroConta;
        this.codigoBanco = codigoBanco;
    }

    @Override
    public String pagar(double valor) {
        return "Pago " + valor + " por Transferência Bancária.";
    }
}
