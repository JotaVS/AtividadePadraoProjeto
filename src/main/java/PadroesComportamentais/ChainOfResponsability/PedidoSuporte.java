package PadroesComportamentais.ChainOfResponsability;

public class PedidoSuporte {
    private String mensagem;
    private int nivel;

    public PedidoSuporte(String mensagem, int nivel) {
        this.mensagem = mensagem;
        this.nivel = nivel;
    }

    public String getMensagem() {
        return mensagem;
    }

    public int getNivel() {
        return nivel;
    }
}
