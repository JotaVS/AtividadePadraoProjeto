package PadroesEstruturais.Bridge;

public abstract class Carro {

    protected Cor cor;

    public Carro(Cor cor) {
        this.cor = cor;
    }

    public abstract int getValor();

}
