package PadroesComportamentais.Mediator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMediator {

    @Test
    public void testChat() {
        ChatRoom chatFuncionario = new ChatRoom();
        ChatRoom chatCliente = new ChatRoom();
        Mediator mediator = new ConcreteMediator(chatFuncionario, chatCliente);

        Usuario funcinario = new Funcionario("Alice (Funcionario)", mediator);
        Usuario cliente = new Cliente("Bob (Cliente)", mediator);
        Usuario usuarioDesconhecido = new UsuarioDesconhecido("Desconhecido", mediator);


        String mensagemFuncionario = funcinario.sendMessage("Olá, pessoal!");
        String mensagemCliente = cliente.sendMessage("Olá, empresa!");
        String mensagemUsuarioDesconhecido = usuarioDesconhecido.sendMessage("Ola");

        assertEquals("Alice (Funcionario) disse: Olá, pessoal! (enviado para Chat Funcionarios)", mensagemFuncionario);
        assertEquals("Bob (Cliente) disse: Olá, empresa! (enviado para Chat Clientes)", mensagemCliente);
        assertEquals("Tipo de Usuario Desconhecido!", mensagemUsuarioDesconhecido);
    }
}
