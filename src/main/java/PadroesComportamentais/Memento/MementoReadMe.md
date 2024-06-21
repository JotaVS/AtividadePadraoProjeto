## Padrão Memento - Sistema de Checkpoint de Jogo
Este projeto implementa o padrão de projeto Memento para permitir que um jogo salve e restaure seu estado em checkpoints.

### Checkpoint.java

A classe `Checkpoint` representa um estado salvo do jogo em um determinado nível.

#### Atributos

-   `private final int nivelCheckpoint`: O nível salvo no checkpoint.

#### Construtor

-   `public Checkpoint(int nivel)`: Inicializa o checkpoint com o nível fornecido.
    -   `nivel`: O nível do jogo a ser salvo no checkpoint.

#### Métodos

-   `public int getNivelCheckpoint()`: Retorna o nível salvo no checkpoint.

### GerenciadorCheckpoint.java

A classe `GerenciadorCheckpoint` gerencia a criação e restauração de checkpoints para o jogo.

#### Atributos

-   `private Checkpoint checkpoint`: O checkpoint atual salvo.

#### Métodos

-   `public void salvarCheckpoint(Jogo jogo)`: Cria e salva um checkpoint do estado atual do jogo.
    
    -   `jogo`: A instância do jogo para a qual o checkpoint será criado.
-   `public void restaurarCheckpoint(Jogo jogo)`: Restaura o estado do jogo para o checkpoint salvo.
    
    -   `jogo`: A instância do jogo que será restaurada.
    -   Lança `IllegalStateException` se nenhum checkpoint estiver salvo.

### Jogo.java

A classe `Jogo` representa o estado do jogo, incluindo o nível atual e métodos para avançar, criar e restaurar checkpoints.

#### Atributos

-   `private int nivelAtual`: O nível atual do jogo.

#### Construtor

-   `public Jogo()`: Inicializa o jogo no nível 1.

#### Métodos

-   `public int getNivelAtual()`: Retorna o nível atual do jogo.
-   `public void avancarNivel()`: Avança o jogo para o próximo nível.
-   `public Checkpoint criarCheckpoint()`: Cria um checkpoint no nível atual do jogo.
-   `public void restaurarCheckpoint(Checkpoint checkpoint)`: Restaura o jogo para o nível salvo no checkpoint.
    -   `checkpoint`: O checkpoint a partir do qual o jogo será restaurado.
