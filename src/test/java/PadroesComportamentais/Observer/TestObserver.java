package PadroesComportamentais.Observer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestObserver {

    @Test
    void retornarUltimoEvento(){
        Evento evento = new Evento();
        Usuario Usuario = new Usuario();

        evento.adicionarObservador(Usuario);

        evento.anunciarEvento("Flamengo x Vasco");
        assertEquals("Flamengo x Vasco",evento.getUltimoEvento());

    }

    @Test
    void retornarVazio(){
        Evento evento = new Evento();
        Usuario usuario = new Usuario();

        evento.adicionarObservador(usuario);
        evento.removerObservador(usuario);

        assertEquals(0,evento.getQuantidadeObservadores());
    }

}
