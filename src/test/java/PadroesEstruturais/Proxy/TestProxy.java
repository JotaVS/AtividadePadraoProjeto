package PadroesEstruturais.Proxy;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestProxy {


    @Test
    public void testeDepositarSenhaCorreta() {
        IContaBancaria contaBancaria = new ContaBancariaProxy(1000.0, "123");
        String resultado = contaBancaria.depositar(200.0, "123");
        assertEquals("Depositou: 200.0", resultado);
        assertEquals(1200.0, contaBancaria.getSaldo(), 0.001);
    }

    @Test
    public void testeDepositarSenhaIncorreta() {
        IContaBancaria contaBancaria = new ContaBancariaProxy(1000.0, "123");
        String resultado = contaBancaria.depositar(200.0, "456");
        assertEquals("Acesso negado. Senha Incorreta.", resultado);
        assertEquals(1000.0, contaBancaria.getSaldo(),0.001);
    }

    @Test
    public void testeRetirarSenhaCorreta() {
        IContaBancaria contaBancaria = new ContaBancariaProxy(1000.0, "123");
        String resultado = contaBancaria.retirar(200.0, "123");
        assertEquals("Retirou: 200.0", resultado);
        assertEquals(800.0, contaBancaria.getSaldo(),0.001);
    }

    @Test
    public void testeRetirarSenhaIncorreta() {
        IContaBancaria contaBancaria = new ContaBancariaProxy(1000.0, "123");
        String resultado = contaBancaria.retirar(200.0, "456");
        assertEquals("Acesso negado. Senha Incorreta.", resultado);
        assertEquals(1000.0, contaBancaria.getSaldo(),0.001);
    }

    @Test
    public void testeRetirarSaldoInsuficiente(){
        IContaBancaria contaBancaria = new ContaBancariaProxy(1000.0, "123");
        String resultado = contaBancaria.retirar(1200.0, "123");
        assertEquals("Saldo Insuficiente.", resultado);
        assertEquals(1000.0, contaBancaria.getSaldo(),0.001);
    }

    @Test
    public void testGetSaldo() {
        IContaBancaria contaBancaria = new ContaBancariaProxy(1000.0, "123");
        assertEquals(1000.0, contaBancaria.getSaldo(),0.001);
    }
}