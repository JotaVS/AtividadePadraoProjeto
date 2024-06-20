package PadroesComportamentais.Visitor;

public class StatusVisitor implements PersonagemVisitor {
    private StringBuilder relatorio = new StringBuilder();

    @Override
    public String visitar(Guerreiro guerreiro) {
        relatorio.append("Guerreiro: ").append(guerreiro.getNome())
                .append(", Poder de Ataque: ").append(guerreiro.getDanoAtaque()).append("\n");
        return relatorio.toString();
    }

    @Override
    public String visitar(Mago mago) {
        relatorio.append("Mago: ").append(mago.getNome())
                .append(", Poder Mágico: ").append(mago.getDanoMagico()).append("\n");
        return relatorio.toString();
    }

    @Override
    public String visitar(Arqueiro arqueiro) {
        relatorio.append("Arqueiro: ").append(arqueiro.getNome())
                .append(", Poder de Ataque à Distância: ").append(arqueiro.getDanoDistancia()).append("\n");
        return relatorio.toString();
    }

    public String getRelatorio() {
        return relatorio.toString();
    }
}