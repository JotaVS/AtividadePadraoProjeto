package PadroesEstruturais.Bridge;

public class Civic extends Carro {

    public Civic(Cor cor) {
        super(cor);
    }

    @Override
    public int getValor() {
        int valorBase = 260000;
        int valorCor = cor.valorAdicional();
        return valorBase + valorCor;
    }
}
