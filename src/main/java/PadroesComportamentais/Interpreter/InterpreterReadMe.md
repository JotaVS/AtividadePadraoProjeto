
## Padrão Interpreter - Ações de Jogo

Este projeto usa o padrão de projeto Interpreter em um sistema de jogo para interpretar e executar ações de um jogador com base em comandos textuais.

### Acao.java

A interface `Acao` define um método para interpretar ações de um jogador.

#### Métodos

-   `String interpret(Jogador jogador)`: Interpreta a ação e retorna uma descrição da ação realizada pelo jogador.
    -   `jogador`: A instância do jogador que realiza a ação.

### Atacar.java

A classe `Atacar` implementa a interface `Acao` e representa a ação de atacar um alvo.

#### Atributos

-   `private String alvo`: O alvo a ser atacado.

#### Construtor

-   `public Atacar(String alvo)`: Inicializa a ação com o alvo fornecido.
    -   `alvo`: O nome do alvo a ser atacado.

#### Métodos

-   `@Override public String interpret(Jogador jogador)`: Retorna uma descrição da ação de ataque realizada pelo jogador.
    -   `jogador`: A instância do jogador que realiza a ação.

### Defender.java

A classe `Defender` implementa a interface `Acao` e representa a ação de defender.

#### Métodos

-   `@Override public String interpret(Jogador jogador)`: Retorna uma descrição da ação de defesa realizada pelo jogador.
    -   `jogador`: A instância do jogador que realiza a ação.

### Fugir.java

A classe `Fugir` implementa a interface `Acao` e representa a ação de fugir.

#### Métodos

-   `@Override public String interpret(Jogador jogador)`: Retorna uma descrição da ação de fuga realizada pelo jogador.
    -   `jogador`: A instância do jogador que realiza a ação.

### Interpreter.java

A classe `Interpreter` é responsável por interpretar comandos textuais e executar as ações correspondentes.

#### Métodos

-   `public String interpret(String contexto, Jogador jogador)`: Interpreta o contexto textual e executa a ação correspondente, retornando uma descrição da ação realizada.
    -   `contexto`: O comando textual a ser interpretado.
    -   `jogador`: A instância do jogador que realiza a ação.

### Jogador.java

A classe `Jogador` representa um jogador no jogo.

#### Atributos

-   `private String nome`: O nome do jogador.

#### Construtor

-   `public Jogador(String nome)`: Inicializa o jogador com o nome fornecido.
    -   `nome`: O nome do jogador.

#### Métodos

-   `public String getNome()`: Retorna o nome do jogador.

### TestInterpreter.java

O `TestInterpreter.java` contém testes unitários para validar o comportamento do padrão de design Interpreter no contexto de um jogo. Os testes verificam a funcionalidade do método `interpret` da classe `Interpreter` para diferentes comandos dados por um jogador.

#### `public void testeAtaque()`

-   **Objetivo:** Verificar se o comando "atacar" é interpretado corretamente.
    
-   **Método:**
    
    -   Criar uma instância de `Interpreter`.
    -   Criar uma instância de `Jogador` com o nome "player1".
    -   Chamar o método `interpret` com o comando "atacar alvo1" e o jogador.
    -   Verificar se a saída gerada corresponde ao valor esperado.
-   **Resultado Esperado:**
    
    -   A saída deve ser `"player1 ataca alvo1."`.

#### `public void testeDefender()`

-   **Objetivo:** Verificar se o comando "defender" é interpretado corretamente.
    
-   **Método:**
    
    -   Criar uma instância de `Interpreter`.
    -   Criar uma instância de `Jogador` com o nome "player1".
    -   Chamar o método `interpret` com o comando "defender" e o jogador.
    -   Verificar se a saída gerada corresponde ao valor esperado.
-   **Resultado Esperado:**
    
    -   A saída deve ser `"player1 está defendendo."`.

#### `public void testeFugir()`

-   **Objetivo:** Verificar se o comando "fugir" é interpretado corretamente.
    
-   **Método:**
    
    -   Criar uma instância de `Interpreter`.
    -   Criar uma instância de `Jogador` com o nome "player1".
    -   Chamar o método `interpret` com o comando "fugir" e o jogador.
    -   Verificar se a saída gerada corresponde ao valor esperado.
-   **Resultado Esperado:**
    
    -   A saída deve ser `"player1 foge da batalha."`.

#### `public void testeAcaoDesconhecida()`

-   **Objetivo:** Verificar o comportamento do sistema quando um comando não reconhecido é dado.
    
-   **Método:**
    
    -   Criar uma instância de `Interpreter`.
    -   Criar uma instância de `Jogador` com o nome "player1".
    -   Chamar o método `interpret` com o comando "usar item" e o jogador.
    -   Verificar se a saída gerada corresponde ao valor esperado.
-   **Resultado Esperado:**
    
    -   A saída deve ser `"Ação não reconhecida."`.
