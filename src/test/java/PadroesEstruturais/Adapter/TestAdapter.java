package PadroesEstruturais.Adapter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAdapter {
    private TemperaturaAdapter adapter;
    private TemperaturaFahrenheit temperaturaFahrenheit;

    @Before
    public void setUp() {
        temperaturaFahrenheit = new TemperaturaFahrenheit(32.0);
        adapter = new TemperaturaAdapter(temperaturaFahrenheit);
    }

    @Test
    public void testGetTemperatureEmCelsius() {
        assertEquals(0.0, adapter.getTemperatureEmCelsius(), 0.001);
    }

    @Test
    public void testSetTemperatureEmCelsius() {
        adapter.setTemperatureEmCelsius(100.0);
        assertEquals(212.0, temperaturaFahrenheit.getTemperaturaFahrenheit(), 0.001);
    }
}
