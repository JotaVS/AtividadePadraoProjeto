
## Padrão Iterator - Coleção de Jogos

Este projeto implementa o padrão de projeto Iterator para permitir a navegação através de uma coleção de objetos (neste caso, jogos).

### Colecao.java

A interface `Colecao` define um método para criar um iterator.

#### Métodos

-   `Iterator<Jogo> criarIterator()`: Cria e retorna um iterator para a coleção.

### ColecaoJogos.java

A classe `ColecaoJogos` implementa a interface `Colecao` e mantém uma coleção de objetos `Jogo`.

#### Atributos

-   `private List<Jogo> jogos`: Lista que armazena os jogos.

#### Construtor

-   `public ColecaoJogos()`: Inicializa a coleção de jogos com uma lista vazia.

#### Métodos

-   `public void adicionarJogo(Jogo jogo)`: Adiciona um jogo à coleção.
-   `@Override public Iterator<Jogo> criarIterator()`: Cria e retorna um iterator para a coleção de jogos.

### Classe Interna `BibliotecaIterator`

A classe `BibliotecaIterator` é uma classe interna de `ColecaoJogos` que implementa a interface `Iterator` para iterar através da coleção de jogos.

#### Atributos

-   `private int indiceAtual`: Índice atual do iterator na lista de jogos.

#### Métodos

-   `@Override public boolean hasNext()`: Retorna `true` se houver mais elementos na coleção a serem iterados, `false` caso contrário.
-   `@Override public Jogo next()`: Retorna o próximo elemento na coleção.

### Iterator.java

A interface `Iterator` define os métodos necessários para iterar através de uma coleção de objetos.

#### Métodos

-   `boolean hasNext()`: Verifica se há mais elementos na coleção.
-   `T next()`: Retorna o próximo elemento na coleção.

### Jogo.java

A classe `Jogo` representa um jogo com nome e status de finalização.

#### Atributos

-   `private final String nome`: Nome do jogo.
-   `private boolean finalizado`: Indica se o jogo foi finalizado.

#### Construtor

-   `public Jogo(String nome, boolean finalizado)`: Inicializa um jogo com nome e status de finalização.

#### Métodos

-   `public String getNome()`: Retorna o nome do jogo.
-   `public boolean getFinalizado()`: Retorna o status de finalização do jogo.
-   `public void setFinalizado(boolean finalizado)`: Define o status de finalização do jogo.


### TestIterator.java

O `TestIterator.java` contém testes unitários para verificar o funcionamento do padrão de design Iterator no projeto de coleção de jogos.

#### `public void testIteratorQuantidade()`

-   **Objetivo:** Verificar a contagem de jogos que foram finalizados na coleção.

-   **Método:**

    -   Criar uma instância de `ColecaoJogos`.
    -   Adicionar quatro jogos à coleção, com diferentes valores para o atributo `finalizado`.
    -   Criar um iterador para a coleção de jogos.
    -   Iterar sobre a coleção usando o iterador, contando o número de jogos que foram finalizados (`finalizado` é `true`).
    -   Verificar se a contagem corresponde ao valor esperado.
-   **Resultado Esperado:**

    -   A contagem de jogos finalizados deve ser 3.

#### `public void testSetFinalizado()`

-   **Objetivo:** Verificar se é possível modificar o atributo `finalizado` de um jogo durante a iteração e contar corretamente os jogos finalizados após a modificação.

-   **Método:**

    -   Criar uma instância de `ColecaoJogos`.
    -   Adicionar quatro jogos à coleção, com diferentes valores para o atributo `finalizado`.
    -   Criar um iterador para a coleção de jogos.
    -   Iterar sobre a coleção usando o iterador, modificando o atributo `finalizado` do jogo "Red Dead Redemption 2" para `true`.
    -   Contar o número de jogos que foram finalizados após a modificação.
    -   Verificar se a contagem corresponde ao valor esperado.
-   **Resultado Esperado:**

    -   A contagem de jogos finalizados deve ser 4.

## Comprovação dos Testes:
![image](https://github.com/JotaVS/AtividadePadraoProjeto/assets/114262723/dee5a0e4-393d-4ddc-98a8-c846ec9999da)

