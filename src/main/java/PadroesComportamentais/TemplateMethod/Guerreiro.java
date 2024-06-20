package PadroesComportamentais.TemplateMethod;

public class Guerreiro extends Personagem {
    @Override
    protected String atacar() {
        return "Guerreiro atacando com espada!";
    }
}