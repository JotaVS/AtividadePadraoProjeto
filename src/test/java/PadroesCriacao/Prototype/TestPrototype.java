package PadroesCriacao.Prototype;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestPrototype {
    Figura figuraOriginal;
    Figura figuraClone;
    @Before
    public void criarPrototipo() throws Exception{
        figuraOriginal = new Figura("Círculo", "Vermelho", 10, 20);
        figuraClone = figuraOriginal.clone();
    }

    @Test
    public void nomesIguais() throws Exception {
        assertEquals(figuraOriginal.getNome(), figuraClone.getNome());
    }
    @Test
    public void coresIguais() throws Exception {
        assertEquals(figuraOriginal.getCor(), figuraClone.getCor());
    }

    @Test
    public void coordenadasXIguais() throws Exception {
        assertEquals(figuraOriginal.getX(), figuraClone.getX());
    }

    @Test
    public void coordenadasYIguais() throws Exception {
        assertEquals(figuraOriginal.getY(), figuraClone.getY());
    }
    @Test
    public void nomesDiferentes() throws Exception {
        figuraClone.setNome("Quadrado");
        assertNotEquals(figuraOriginal.getNome(), figuraClone.getNome());
    }

    @Test
    public void coresDiferentes() throws Exception {
        figuraClone.setCor("Azul");
        assertNotEquals(figuraOriginal.getCor(), figuraClone.getCor());
    }

    @Test
    public void coordenadasXDiferentes() throws Exception {
        figuraClone.setX(5);
        assertNotEquals(figuraOriginal.getX(), figuraClone.getX());
    }

    @Test
    public void coordenadasYDiferentes() throws Exception {
        figuraClone.setY(10);
        assertNotEquals(figuraOriginal.getY(), figuraClone.getY());
    }
}