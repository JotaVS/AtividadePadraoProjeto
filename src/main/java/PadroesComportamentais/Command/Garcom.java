package PadroesComportamentais.Command;

public class Garcom {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public String anotarPedido() {
        return command.execute();
    }
}
