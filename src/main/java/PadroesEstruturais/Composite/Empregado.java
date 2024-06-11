package PadroesEstruturais.Composite;

public class Empregado implements IEmpregado{
    private final String nome;
    private final String cargo;

    public Empregado(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    @Override
    public String mostrarDetalhes() {
        return "Empregado: " + nome + ", Cargo: " + cargo + "\n";

    }
}
