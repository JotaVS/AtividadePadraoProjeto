package PadroesEstruturais.Flyweight;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TestFlyweight {

    @Test
    public void testTipoArvore() {
        TipoArvore tipoArvore = new TipoArvore("Carvalho", "Verde", "Aspero");

        assertEquals("Carvalho",tipoArvore.getNome());
        assertEquals("Verde",tipoArvore.getCor());
        assertEquals("Aspero",tipoArvore.getTextura());

    }

    @Test
    public void testArvore() {
        TipoArvore tipoArvore = new TipoArvore("Carvalho", "Verde", "Aspero");
        Arvore arvore = new Arvore(10, 20, tipoArvore);

        assertEquals(10, arvore.getX());
        assertEquals(20, arvore.getY());
        assertSame(tipoArvore, arvore.getTipo());
    }

    @Test
    public void testGetArvore() {
        TipoArvore tipoArvore = new TipoArvore("Carvalho", "Verde", "Aspero");
        Arvore tree = new Arvore(10, 20, tipoArvore);
            assertEquals("Arvore do tipo: TipoArvore{nome='Carvalho', cor='Verde', textura='Aspero'} localizada em (10, 20)", tree.getArvore());
    }

    @Test
    public void testArvoreFactory() {
        TipoArvore tipo1 = ArvoreFactory.getTipoArvore("Carvalho", "Verde", "Aspero");
        TipoArvore tipo2 = ArvoreFactory.getTipoArvore("Carvalho", "Verde", "Aspero");
        TipoArvore tipo3 = ArvoreFactory.getTipoArvore("Pinheiro", "Verde", "Suave");

        assertSame(tipo1, tipo2);
        assertNotSame(tipo1, tipo3);

        assertEquals(2, ArvoreFactory.getQuantidadeTiposArvore());
    }

    @Test
    public void testPlantarArvore() {
        Parque parque = new Parque();
        parque.plantarArvore(10, 20, "Carvalho", "Verde", "Aspero");
        parque.plantarArvore(15, 25, "Carvalho", "Verde", "Aspero");

        assertEquals(2, parque.getQuantidadeArvore());
    }

    @Test
    public void testGetParque() {
        Parque parque = new Parque();
        parque.plantarArvore(10, 20, "Carvalho", "Verde", "Aspero");
        parque.plantarArvore(15, 25, "Pinheiro", "Verde", "Suave");

        List<String> parques = parque.getParque();
        assertEquals(2, parques.size());
        assertEquals("Arvore do tipo: TipoArvore{nome='Carvalho', cor='Verde', textura='Aspero'} localizada em (10, 20)", parques.get(0));
        assertEquals("Arvore do tipo: TipoArvore{nome='Pinheiro', cor='Verde', textura='Suave'} localizada em (15, 25)", parques.get(1));
    }
}
