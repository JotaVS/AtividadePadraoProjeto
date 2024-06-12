package PadroesEstruturais.Flyweight;

public class Arvore {
    private final int x;
    private final int y;
    private final TipoArvore tipoArvore;

    public Arvore(int x, int y, TipoArvore tipoArvore) {
        this.x = x;
        this.y = y;
        this.tipoArvore = tipoArvore;
    }

    public String getArvore() {
        return "Arvore do tipo: " + tipoArvore + " localizada em (" + x + ", " + y + ")";
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public TipoArvore getTipo() {
        return tipoArvore;
    }

}
