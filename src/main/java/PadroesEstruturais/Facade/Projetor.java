package PadroesEstruturais.Facade;

public class Projetor {
    public String on() {
        return "Projetor Ligado";
    }

    public String setInput(String entrada) {
        return "Projetor conectado ao " + entrada;
    }

    public String off() {
        return "Projetor Desligado";
    }
}
