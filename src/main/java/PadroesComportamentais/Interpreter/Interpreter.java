package PadroesComportamentais.Interpreter;

public class Interpreter {

    public String interpret(String contexto, Jogador jogador){

        String[] partes = contexto.split(" ");

        if (partes[0].equals("atacar")){
            String alvo = partes[1];
            Acao acao = new Atacar(alvo);
            return acao.interpret(jogador);
        } else if (partes[0].equals("defender")) {
            Acao acao = new Defender();
            return acao.interpret(jogador);
        } else if (partes[0].equals("fugir")) {
            Acao acao = new Fugir();
            return acao.interpret(jogador);

        } else {
            return "Ação não reconhecida.";
        }
    }
}
