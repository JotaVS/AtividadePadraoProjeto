package PadroesComportamentais.Observer;

import java.util.ArrayList;
import java.util.List;

public class Evento implements Subject {
    private final List<Observer> observadores;
    private String ultimoEvento;

    public Evento() {
        observadores = new ArrayList<>();
    }

    @Override
    public void adicionarObservador(Observer o) {
        observadores.add(o);
    }

    @Override
    public void removerObservador(Observer o) {
        observadores.remove(o);
    }

    @Override
    public void notificarObservadores() {
        for (Observer observador : observadores) {
            observador.atualizar(ultimoEvento);
        }
    }

    public String getUltimoEvento() {
        return this.ultimoEvento;
    }

    public int getQuantidadeObservadores() {
        return this.observadores.size();
    }



    public void anunciarEvento(String evento) {
        this.ultimoEvento = evento;
        notificarObservadores();
    }
}
