package PadroesComportamentais.Strategy;

public class Credito implements PagamentoStrategy{

    private String numeroCartao;
    private String nomeCartao;
    private String cvv;
    private String dataValidade;

    public Credito(String numeroCartao, String nomeCartao, String cvv, String dataValidade) {
        this.numeroCartao = numeroCartao;
        this.nomeCartao = nomeCartao;
        this.cvv = cvv;
        this.dataValidade = dataValidade;
    }

    @Override
    public String pagar(double valor) {
        return "Pago " + valor + " usando Cartão de Crédito.";
    }

}
