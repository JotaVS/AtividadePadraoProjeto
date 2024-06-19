package PadroesComportamentais.Mediator;

public class ChatRoom {
    public String mostrarMensagem(String message, Usuario usuario, String destino) {
        String output = usuario.getNome() + " disse: " + message + " (enviado para " + destino + ")";
        return output;
    }
}