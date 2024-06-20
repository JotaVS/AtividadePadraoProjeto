package PadroesComportamentais.Interpreter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestInterpreter {

    @Test
    public void testeAtaque(){
        Interpreter interpreter = new Interpreter();
        Jogador jogador = new Jogador("player1");
        assertEquals("player1 ataca alvo1.", interpreter.interpret("atacar alvo1",jogador));


    }
    @Test
    public void testeDefender(){
        Interpreter interpreter = new Interpreter();
        Jogador jogador = new Jogador("player1");
        assertEquals("player1 está defendendo.", interpreter.interpret("defender",jogador));


    }
    @Test
    public void testeFugir(){
        Interpreter interpreter = new Interpreter();
        Jogador jogador = new Jogador("player1");
        assertEquals("player1 foge da batalha.", interpreter.interpret("fugir",jogador));


    }

    @Test
    public void testeAcaoDesconhecida(){
        Interpreter interpreter = new Interpreter();
        Jogador jogador = new Jogador("player1");
        assertEquals("Ação não reconhecida.", interpreter.interpret("usar item",jogador));


    }

}
