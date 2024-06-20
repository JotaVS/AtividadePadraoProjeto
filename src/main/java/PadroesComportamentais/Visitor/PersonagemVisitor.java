package PadroesComportamentais.Visitor;

public interface PersonagemVisitor {
    String visitar(Guerreiro guerreiro);
    String visitar(Mago mago);
    String visitar(Arqueiro arqueiro);
}