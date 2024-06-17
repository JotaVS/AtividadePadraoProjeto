# Padrão Composite - Departamentos e Empregados
O projeto busca a implementação de um sistema que usa o padrão Composite para representar departamentos e empregados, onde um departamento pode conter vários empregados e/ou sub-departamentos em forma similar a estrutura de uma árvore.

## Departamento.java

A classe `Departamento` representa um departamento dentro de uma organização, que pode conter múltiplos empregados e sub-departamentos.

### Variáveis:

-   **private final String nome**: Nome do departamento.
-   **private final List<IEmpregado> empregados**: Lista de empregados e sub-departamentos dentro deste departamento.

### Construtor:

-   **public Departamento(String nome)**: Construtor que inicializa a instância `Departamento` com o nome fornecido.

### Métodos:

-   **public void addEmpregado(IEmpregado empregado)**: Método para adicionar um empregado ou sub-departamento ao departamento.
-   **public void removeEmpregado(IEmpregado empregado)**: Método para remover um empregado ou sub-departamento do departamento.
-   **public String mostrarDetalhes()**: Método que retorna uma string com os detalhes do departamento e seus empregados/sub-departamentos.
    -   **detalhes**: StringBuilder que acumula os detalhes do departamento e de seus componentes.

## Empregado.java

A classe `Empregado` representa um empregado individual dentro da organização.

### Variáveis:

-   **private final String nome**: Nome do empregado.
-   **private final String cargo**: Cargo do empregado.

### Construtor:

-   **public Empregado(String nome, String cargo)**: Construtor que inicializa a instância `Empregado` com o nome e cargo fornecidos.

### Métodos:

-   **public String mostrarDetalhes()**: Método que retorna uma string com os detalhes do empregado.
    -   **detalhes**: "Empregado: " + nome + ", Cargo: " + cargo + "\n"

## IEmpregado.java

A interface `IEmpregado` define um método que deve ser implementado pelas classes `Empregado` e `Departamento`.

### Métodos:

-   **String mostrarDetalhes()**: Método que retorna uma string com os detalhes do empregado ou departamento.

## TestComposite.java

A classe `TestComposite` testa a implementação das classes `Departamento` e `Empregado` para garantir que as funcionalidades principais estão funcionando conforme esperado.

### Métodos de Teste:

-   **public void retornarDepartamento()**: Testa a criação de um departamento e a exibição de seus detalhes.
    
    -   **Objetivo**: Verificar se a criação de um departamento e a exibição dos seus detalhes funcionam corretamente.
    -   **Método**: Criar uma instância de `Departamento` com o nome "Gerencia" e chamar o método `mostrarDetalhes()`.
    -   **Resultado Esperado**: A string retornada deve ser "Departamento: Gerencia\n".
-   **public void retornarEmpregado()**: Testa a criação de um empregado e a exibição de seus detalhes.
    
    -   **Objetivo**: Verificar se a criação de um empregado e a exibição dos seus detalhes funcionam corretamente.
    -   **Método**: Criar uma instância de `Empregado` com o nome "Jorge" e o cargo "CEO" e chamar o método `mostrarDetalhes()`.
    -   **Resultado Esperado**: A string retornada deve ser "Empregado: Jorge, Cargo: CEO".
-   **public void adicionarEmpregado()**: Testa a adição de um empregado a um departamento e a exibição de seus detalhes.
    
    -   **Objetivo**: Verificar se a adição de um empregado a um departamento funciona corretamente e se os detalhes são exibidos corretamente.
    -   **Método**: Criar uma instância de `Departamento` com o nome "Gerencia" e uma instância de `Empregado` com o nome "Jorge" e o cargo "CEO". Adicionar o empregado ao departamento e chamar o método `mostrarDetalhes()`.
    -   **Resultado Esperado**: A string retornada deve ser "Departamento: Gerencia \n Empregado: Jorge, Cargo: CEO", sendo cada \n um paragrafo demonstrando a estrutura de árvore do padrão.
-   **public void removerEmpregado()**: Testa a remoção de um empregado de um departamento e a exibição de seus detalhes.
    
    -   **Objetivo**: Verificar se a remoção de um empregado de um departamento funciona corretamente e se os detalhes são exibidos corretamente.
    -   **Método**: Criar uma instância de `Departamento` com o nome "Gerencia" e uma instância de `Empregado` com o nome "Jorge" e o cargo "CEO". Adicionar o empregado ao departamento, removê-lo e chamar o método `mostrarDetalhes()`.
    -   **Resultado Esperado**: A string retornada deve ser "Departamento: Gerencia".
