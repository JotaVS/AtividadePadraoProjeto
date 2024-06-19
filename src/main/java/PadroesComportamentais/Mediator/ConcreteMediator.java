package PadroesComportamentais.Mediator;

public class ConcreteMediator implements Mediator {
    private ChatRoom chatFuncionario;
    private ChatRoom chatCliente;

    public ConcreteMediator(ChatRoom chatFuncionario, ChatRoom chatCliente) {
        this.chatFuncionario = chatFuncionario;
        this.chatCliente = chatCliente;
    }

    @Override
    public String enviarMensagem(String message, Usuario usuario) {
        String destination;
        if (usuario instanceof Funcionario) {
            destination = "Chat Funcionarios";
            return chatFuncionario.mostrarMensagem(message, usuario, destination);
        } else if (usuario instanceof Cliente) {
            destination = "Chat Clientes";
            return chatCliente.mostrarMensagem(message, usuario, destination);
        } else {
            return "Tipo de Usuario Desconhecido!";
        }
    }
}
