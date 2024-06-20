
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
