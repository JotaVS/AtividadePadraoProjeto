package PadroesComportamentais.Iterator;

import java.util.ArrayList;
import java.util.List;

public class ColecaoJogos implements Colecao {
    private List<Jogo> jogos;

    public ColecaoJogos() {
        this.jogos = new ArrayList<>();
    }

    public void adicionarJogo(Jogo jogo) {
        jogos.add(jogo);
    }

    @Override
    public Iterator<Jogo> criarIterator() {
        return new BibliotecaIterator();
    }

    private class BibliotecaIterator implements Iterator<Jogo> {
        private int indiceAtual = 0;

        @Override
        public boolean hasNext() {
            return indiceAtual < jogos.size();
        }

        @Override
        public Jogo next() {
            return jogos.get(indiceAtual++);
        }
    }
}