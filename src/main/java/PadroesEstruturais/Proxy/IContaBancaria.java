package PadroesEstruturais.Proxy;

public interface IContaBancaria {
    String depositar(double quantidade, String senha);
    String retirar(double quantidade, String password);
    double getSaldo();
}
