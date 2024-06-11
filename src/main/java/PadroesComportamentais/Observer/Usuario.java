package PadroesComportamentais.Observer;

public class Usuario implements Observer{

    private String evento;

    @Override
    public void atualizar(String evento) {
        this.evento = evento;
        exibir();
    }

    public void exibir() {
        System.out.println(evento);
    }
}
