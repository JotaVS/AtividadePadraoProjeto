package PadroesEstruturais.Composite;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestComposite {

    @Test
    public void retornarDepartamento(){
        Departamento gerencia = new Departamento("Gerencia");
        assertEquals("Departamento: Gerencia\n",gerencia.mostrarDetalhes());

    }

    @Test
    public void retornarEmpregado(){
        Empregado empregado = new Empregado("Jorge","CEO");
        assertEquals("Empregado: Jorge, Cargo: CEO\n", empregado.mostrarDetalhes());

    }

    @Test
    public void adicionarEmpregado(){
        Departamento gerencia = new Departamento("Gerencia");
        Empregado empregado = new Empregado("Jorge","CEO");
        gerencia.addEmpregado(empregado);
        assertEquals("Departamento: Gerencia\n" +
                "Empregado: Jorge, Cargo: CEO\n",gerencia.mostrarDetalhes());

    }

    @Test
    public void removerEmpregado(){
        Departamento gerencia = new Departamento("Gerencia");
        Empregado empregado = new Empregado("Jorge","CEO");
        gerencia.addEmpregado(empregado);
        gerencia.removeEmpregado(empregado);
        assertEquals("Departamento: Gerencia\n",gerencia.mostrarDetalhes());

    }
}
