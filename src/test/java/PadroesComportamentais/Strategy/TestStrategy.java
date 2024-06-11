package PadroesComportamentais.Strategy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TestStrategy {


    @Test
    public void metodoCartaoCredito() {
        ProcessadorPagamento processador = new ProcessadorPagamento();
        processador.setPagamentoStrategy(new Credito("1234567890123456", "João", "123", "12/23"));
        String resultado = processador.processarPagamento(100.0);
        assertEquals("Pago 100.0 usando Cartão de Crédito.", resultado);
    }

    @Test
    public void metodoPayPal() {
        ProcessadorPagamento processador = new ProcessadorPagamento();
        processador.setPagamentoStrategy(new PayPal("joao@gmail.com", "123456"));
        String resultado = processador.processarPagamento(200.0);
        assertEquals("Pago 200.0 usando PayPal.", resultado);
    }

    @Test
    public void metodoTransferenciaBancaria() {
        ProcessadorPagamento processador = new ProcessadorPagamento();
        processador.setPagamentoStrategy(new TransferenciaBancaria("123456789", "001"));
        String resultado = processador.processarPagamento(300.0);
        assertEquals("Pago 300.0 por Transferência Bancária.", resultado);
    }

    @Test
    public void metodoInvalido() {
        ProcessadorPagamento processador = new ProcessadorPagamento();
        Exception exception = assertThrows(IllegalStateException.class, () -> {
            processador.processarPagamento(100.0);
        });
        assertEquals("Metodo de pagamento invalido.", exception.getMessage());
    }
}
