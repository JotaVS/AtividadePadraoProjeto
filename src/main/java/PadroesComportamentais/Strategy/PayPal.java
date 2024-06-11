package PadroesComportamentais.Strategy;

public class PayPal implements PagamentoStrategy{
    private String email;
    private String senha;

    public PayPal(String email, String password) {
        this.email = email;
        this.senha = password;
    }

    @Override
    public String pagar(double valor) {
        return "Pago " + valor + " usando PayPal.";
    }
}
