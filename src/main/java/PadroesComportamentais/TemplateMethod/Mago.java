package PadroesComportamentais.TemplateMethod;

public class Mago extends Personagem {
    @Override
    protected String atacar() {
        return "Mago lançando uma bola de fogo!";
    }
}