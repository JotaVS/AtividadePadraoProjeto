package PadroesComportamentais.Mediator;

public abstract class Usuario {
    protected String nome;
    protected Mediator mediator;

    public Usuario(String nome, Mediator mediator) {
        this.nome = nome;
        this.mediator = mediator;
    }

    public String sendMessage(String message) {
        return mediator.enviarMensagem(message, this);
    }

    public String getNome() {
        return nome;
    }
}