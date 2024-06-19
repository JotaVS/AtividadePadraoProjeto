package PadroesComportamentais.Iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestIterator {

    @Test
    public void testIteratorQuantidade(){

        ColecaoJogos jogos = new ColecaoJogos();
        jogos.adicionarJogo(new Jogo("Bloodborne", true));
        jogos.adicionarJogo(new Jogo("Red Dead Redemption 2", false));
        jogos.adicionarJogo(new Jogo("God Of War Ragnarok", true));
        jogos.adicionarJogo(new Jogo("Devil May Cry 5", true));

        Iterator<Jogo> iterator = jogos.criarIterator();
        int quantidade = 0;
        while (iterator.hasNext()) {
            Jogo jogo = iterator.next();
            if (jogo.getFinalizado())
                quantidade++;
        }
        assertEquals(3,quantidade);
    }

    @Test
    public void testSetFinalizado(){

        ColecaoJogos jogos = new ColecaoJogos();
        jogos.adicionarJogo(new Jogo("Bloodborne", true));
        jogos.adicionarJogo(new Jogo("Red Dead Redemption 2", false));
        jogos.adicionarJogo(new Jogo("God Of War Ragnarok", true));
        jogos.adicionarJogo(new Jogo("Devil May Cry 5", true));

        Iterator<Jogo> iterator = jogos.criarIterator();
        int quantidade = 0;
        while (iterator.hasNext()) {
            Jogo jogo = iterator.next();
            if (jogo.getNome().equals("Red Dead Redemption 2"))
                jogo.setFinalizado(true);
            if (jogo.getFinalizado())
                quantidade++;
        }
        assertEquals(4,quantidade);
    }
}
