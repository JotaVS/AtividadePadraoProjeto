package PadroesEstruturais.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class ArvoreFactory {

    private static final Map<String, TipoArvore> tiposArvore = new HashMap<>();

    public static TipoArvore getTipoArvore(String nome, String cor, String textura) {
        String key = nome + cor + textura;
        if (!tiposArvore.containsKey(key)) {
            tiposArvore.put(key, new TipoArvore(nome, cor, textura));
        }
        return tiposArvore.get(key);
    }

    public static int getQuantidadeTiposArvore() {
        return tiposArvore.size();
    }
}
