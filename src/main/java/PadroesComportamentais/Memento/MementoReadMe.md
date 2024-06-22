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


### TestMemento.java

O `TestMemento.java` contém testes para validar o comportamento do padrão Memento sendo usado em um jogo que permite salvar e restaurar checkpoints. Os testes verificam a funcionalidade de avançar níveis, salvar checkpoints, restaurar checkpoints e lidar com a ausência de checkpoints salvos.

#### `public void testarCheckpoint()`

-   **Objetivo:** Verificar a funcionalidade de salvar e restaurar checkpoints no jogo.

-   **Método:**

    -   Criar uma instância do jogo (`Jogo`).
    -   Criar uma instância do gerenciador de checkpoints (`GerenciadorCheckpoint`).
    -   Avançar o jogo para o próximo nível.
    -   Salvar o estado atual do jogo no gerenciador de checkpoints.
    -   Avançar o jogo por mais dois níveis.
    -   Verificar se o nível atual do jogo é 4.
    -   Restaurar o checkpoint salvo.
    -   Verificar se o nível atual do jogo foi restaurado para 2.
-   **Resultado Esperado:**

    -   Antes de restaurar o checkpoint, o nível atual deve ser 4.
    -   Após restaurar o checkpoint, o nível atual deve ser 2.

#### `public void testeCheckpointVazio()`

-   **Objetivo:** Verificar o comportamento do sistema quando se tenta restaurar um checkpoint sem nenhum checkpoint salvo.

-   **Método:**

    -   Criar uma instância do jogo (`Jogo`).
    -   Criar uma instância do gerenciador de checkpoints (`GerenciadorCheckpoint`).
    -   Tentar restaurar um checkpoint sem nenhum checkpoint salvo e capturar a exceção `IllegalStateException`.
    -   Verificar se a mensagem da exceção corresponde ao valor esperado.
-   **Resultado Esperado:**

    -   Deve ser lançada uma exceção `IllegalStateException` com a mensagem `"Nenhum checkpoint salvo."`.

## Comprovação dos Testes:
![image](https://github.com/JotaVS/AtividadePadraoProjeto/assets/114262723/80460596-f5b0-4646-98b9-b64979a1744a)
