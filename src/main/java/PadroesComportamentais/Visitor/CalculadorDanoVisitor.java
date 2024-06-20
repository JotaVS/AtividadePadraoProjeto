package PadroesComportamentais.Visitor;

public class CalculadorDanoVisitor implements PersonagemVisitor {
    private int danoTotal = 0;

    @Override
    public String visitar(Guerreiro guerreiro) {
        danoTotal += guerreiro.getDanoAtaque();
        return "Dano calculado para guerreiro: " + guerreiro.getNome();
    }

    @Override
    public String visitar(Mago mago) {
        danoTotal += mago.getDanoMagico();
        return "Dano calculado para mago: " + mago.getNome();
    }

    @Override
    public String visitar(Arqueiro arqueiro) {
        danoTotal += arqueiro.getDanoDistancia();
        return "Dano calculado para arqueiro: " + arqueiro.getNome();
    }

    public int getDanoTotal() {
        return danoTotal;
    }
}