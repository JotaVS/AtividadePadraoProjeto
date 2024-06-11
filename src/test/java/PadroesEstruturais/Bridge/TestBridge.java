package PadroesEstruturais.Bridge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBridge {

    @Test
    public void civicMetalico(){
        Carro civicMetalico = new Civic(new PretoMetalico());
        assertEquals(265000,civicMetalico.getValor());
    }

    @Test
    public void civicFosco(){
        Carro civicFosco = new Civic(new PretoFosco());
        assertEquals(260000, civicFosco.getValor());
    }

    @Test
    public void crvMetalico(){
        Carro crvMetalico = new CRV(new PretoMetalico());
        assertEquals(355000, crvMetalico.getValor());
    }

    @Test
    public void crvFosco(){
        Carro crvMetalico = new CRV(new PretoFosco());
        assertEquals(350000, crvMetalico.getValor());
    }
}
