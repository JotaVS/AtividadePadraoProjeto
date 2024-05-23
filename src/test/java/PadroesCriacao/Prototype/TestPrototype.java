package PadroesCriacao.Prototype;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestPrototype {

    @Test
    public void figurasIguais() throws Exception {
        Figura figuraOriginal = new Figura("Círculo", "Vermelho", 10, 20);

        Figura figuraClone = figuraOriginal.clone();

        assertEquals(figuraOriginal.getNome(), figuraClone.getNome());
        assertEquals(figuraOriginal.getCor(), figuraClone.getCor());
        assertEquals(figuraOriginal.getX(), figuraClone.getX());
        assertEquals(figuraOriginal.getY(), figuraClone.getY());
    }

    @Test
    public void figurasDiferente() throws Exception{
        Figura figuraOriginal = new Figura("Círculo", "Vermelho", 10, 20);

        Figura figuraClone = figuraOriginal.clone();

        figuraClone.setNome("Quadrado");
        figuraClone.setCor("Azul");
        assertNotEquals(figuraOriginal.getNome(), figuraClone.getNome());
        assertNotEquals(figuraOriginal.getCor(), figuraClone.getCor());

        figuraClone.setX(5);
        figuraClone.setY(10);
        assertNotEquals(figuraOriginal.getX(), figuraClone.getX());
        assertNotEquals(figuraOriginal.getY(), figuraClone.getY());
    }
}