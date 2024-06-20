package PadroesComportamentais.TemplateMethod;

public abstract class Personagem {
    public final String realizarAtaque() {
        StringBuilder resultado = new StringBuilder();
        resultado.append(prepararAtaque()).append("\n");
        resultado.append(atacar()).append("\n");
        resultado.append(finalizarAtaque()).append("\n");
        return resultado.toString();
    }

    protected String prepararAtaque() {
        return "Preparando para atacar...";
    }

    protected String finalizarAtaque() {
        return "Ataque finalizado.";
    }

    protected abstract String atacar();
}
