package PadroesEstruturais.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Parque {

    private final List<Arvore> arvores = new ArrayList<>();

    public void plantarArvore(int x, int y, String nome, String cor, String textura) {
        TipoArvore tipoArvore = ArvoreFactory.getTipoArvore(nome, cor, textura);
        Arvore arvore = new Arvore(x, y, tipoArvore);
        arvores.add(arvore);
    }

    public List<String> getParque() {
        List<String> parque = new ArrayList<>();
        for (Arvore arvore : arvores) {
            parque.add(arvore.getArvore());
        }
        return parque;
    }

    public int getQuantidadeArvore() {
        return arvores.size();
    }
}
