package PadroesEstruturais.Composite;

import java.util.ArrayList;
import java.util.List;

public class Departamento implements IEmpregado{

    private final String nome;
    private final List<IEmpregado> empregados;

    public Departamento(String nome) {
        this.nome = nome;
        this.empregados = new ArrayList<>();
    }

    public void addEmpregado(IEmpregado empregado) {
        empregados.add(empregado);
    }

    public void removeEmpregado(IEmpregado empregado) {
        empregados.remove(empregado);
    }

    @Override
    public String mostrarDetalhes() {

        StringBuilder detalhes = new StringBuilder();
        detalhes.append("Departamento: ").append(nome).append("\n");
        for (IEmpregado empregado : empregados) {
            detalhes.append(empregado.mostrarDetalhes());
        }
        return detalhes.toString();
    }
}
