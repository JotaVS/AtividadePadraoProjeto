package PadroesEstruturais.Bridge;

public class CRV extends Carro {

    public CRV(Cor cor) {
        super(cor);
    }

    @Override
    public int getValor() {
        int valorBase = 350000;
        int valorCor = cor.valorAdicional();
        return valorBase + valorCor;
    }
}
