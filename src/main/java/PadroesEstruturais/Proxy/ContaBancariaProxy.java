package PadroesEstruturais.Proxy;

public class ContaBancariaProxy implements IContaBancaria {
    private ContaBancaria contaBancaria;
    private String senhaCorreta;

    public ContaBancariaProxy(double saldoInicial, String senhaCorreta) {
        this.contaBancaria = new ContaBancaria(saldoInicial);
        this.senhaCorreta = senhaCorreta;
    }

    @Override
    public String depositar(double quantidade, String senha) {
        if (senhaCorreta.equals(senha)) {
            return contaBancaria.depositar(quantidade, senha);
        } else {
            return "Acesso negado. Senha Incorreta.";
        }
    }

    @Override
    public String retirar(double quantidade, String senha) {
        if (senhaCorreta.equals(senha)) {
            return contaBancaria.retirar(quantidade, senha);
        } else {
            return "Acesso negado. Senha Incorreta.";
        }
    }

    @Override
    public double getSaldo() {
        return contaBancaria.getSaldo();
    }
}
