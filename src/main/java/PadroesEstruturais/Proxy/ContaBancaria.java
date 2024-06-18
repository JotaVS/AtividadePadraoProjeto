package PadroesEstruturais.Proxy;

public class ContaBancaria implements IContaBancaria {

    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    @Override
    public String depositar(double quantidade, String senha) {
        saldo += quantidade;
        return "Depositou: " + quantidade;
    }

    @Override
    public String retirar(double quantidade, String senha) {
        if (quantidade <= saldo) {
            saldo -= quantidade;
            return "Retirou: " + quantidade;
        } else {
            return "Saldo Insuficiente.";
        }
    }

    @Override
    public double getSaldo() {
        return saldo;
    }
}
