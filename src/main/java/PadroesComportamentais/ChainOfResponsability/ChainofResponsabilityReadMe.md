## Padrão Chain of Responsibility - Sistema de Suporte

Este projeto usa o padrão de projeto Chain of Responsibility para processar pedidos de suporte em diferentes níveis (baixo, médio e alto). Cada nível de suporte trata pedidos conforme sua capacidade e, se não puder processar um pedido, o passa adiante na cadeia.

### AltoSuporte.java

A classe `AltoSuporte` é um manipulador concreto que trata pedidos de suporte de nível alto (nível 3).

#### Métodos

-   `@Override protected boolean podeProcessar(PedidoSuporte pedido)`: Verifica se o pedido é de nível 3.
-   `@Override protected String processar(PedidoSuporte request)`: Processa o pedido de suporte de nível alto e retorna uma mensagem indicando que o pedido foi tratado.

### BaixoSuporte.java

A classe `BaixoSuporte` é um manipulador concreto que trata pedidos de suporte de nível baixo (nível 1).

#### Métodos

-   `@Override protected boolean podeProcessar(PedidoSuporte pedido)`: Verifica se o pedido é de nível 1.
-   `@Override protected String processar(PedidoSuporte request)`: Processa o pedido de suporte de nível baixo e retorna uma mensagem indicando que o pedido foi tratado.

### ManipuladorSuporte.java

A classe abstrata `ManipuladorSuporte` define a estrutura básica para um manipulador de suporte na cadeia.

#### Atributos

-   `protected ManipuladorSuporte proximoSuporte`: Referência ao próximo manipulador na cadeia.

#### Métodos

-   `public void setProximoSuporte(ManipuladorSuporte proximoSuporte)`: Define o próximo manipulador na cadeia.
-   `public String processarPedido(PedidoSuporte pedido)`: Tenta processar o pedido e, se não puder, passa para o próximo manipulador na cadeia. Retorna uma mensagem de sucesso ou falha.
-   `protected abstract boolean podeProcessar(PedidoSuporte request)`: Método abstrato para verificar se o manipulador pode processar o pedido.
-   `protected abstract String processar(PedidoSuporte request)`: Método abstrato para processar o pedido.

### MedioSuporte.java

A classe `MedioSuporte` é um manipulador concreto que trata pedidos de suporte de nível médio (nível 2).

#### Métodos

-   `@Override protected boolean podeProcessar(PedidoSuporte pedido)`: Verifica se o pedido é de nível 2.
-   `@Override protected String processar(PedidoSuporte request)`: Processa o pedido de suporte de nível médio e retorna uma mensagem indicando que o pedido foi tratado.

### PedidoSuporte.java

A classe `PedidoSuporte` representa um pedido de suporte.

#### Atributos

-   `private String mensagem`: A mensagem do pedido de suporte.
-   `private int nivel`: O nível do pedido de suporte.

#### Construtor

-   `public PedidoSuporte(String mensagem, int nivel)`: Inicializa o pedido de suporte com uma mensagem e um nível.

#### Métodos

-   `public String getMensagem()`: Retorna a mensagem do pedido de suporte.
-   `public int getNivel()`: Retorna o nível do pedido de suporte.

### TestChainOfResponsability.java

O `TestChainOfResponsability.java` busca verificar o funcionamento do padrão Chain of Responsability nos três níveis de suporte que o projeto apresenta.

#### `public void setUp()`

-   **Objetivo:** Configurar a cadeia de responsabilidade antes de cada teste.

-   **Método:**

    -   Criar instâncias de `BaixoSuporte`, `MedioSuporte`, e `AltoSuporte`.
    -   Configurar a cadeia, onde `BaixoSuporte` aponta para `MedioSuporte` e `MedioSuporte` aponta para `AltoSuporte`.
-   **Resultado Esperado:**

    -   A cadeia de responsabilidade deve estar corretamente configurada com `suporteBaixo` apontando para `suporteMedio` e `suporteMedio` apontando para `suporteAlto`.

#### `public void testePedidoSuporteBaixo()`

-   **Objetivo:** Verificar o processamento de um pedido de suporte de baixo nível.

-   **Método:**

    -   Criar um pedido de suporte com nível 1.
    -   Chamar `processarPedido` no manipulador de baixo suporte (`suporteBaixo`).
    -   Verificar se o resultado indica que o pedido foi tratado pelo baixo suporte.
-   **Resultado Esperado:**

    -   O resultado deve ser `"Baixo Suporte: Tratando pedido - Problema de baixo nível"`.

#### `public void testePedidoSuporteMedio()`

-   **Objetivo:** Verificar o processamento de um pedido de suporte de nível médio.

-   **Método:**

    -   Criar um pedido de suporte com nível 2.
    -   Chamar `processarPedido` no manipulador de baixo suporte (`suporteBaixo`).
    -   Verificar se o resultado indica que o pedido foi tratado pelo médio suporte.
-   **Resultado Esperado:**

    -   O resultado deve ser `"Medio Suporte: Tratando pedido - Problema de nível médio"`.

#### `public void testePedidoSuporteAlto()`

-   **Objetivo:** Verificar o processamento de um pedido de suporte de alto nível.

-   **Método:**

    -   Criar um pedido de suporte com nível 3.
    -   Chamar `processarPedido` no manipulador de baixo suporte (`suporteBaixo`).
    -   Verificar se o resultado indica que o pedido foi tratado pelo alto suporte.
-   **Resultado Esperado:**

    -   O resultado deve ser `"Alto Suporte: Tratando pedido - Problema de alto nível"`.

#### `public void testePedidoNaoManipulavelNivelInvalido()`

-   **Objetivo:** Verificar o tratamento de um pedido de suporte com nível inválido.

-   **Método:**

    -   Criar um pedido de suporte com nível 4.
    -   Chamar `processarPedido` no manipulador de baixo suporte (`suporteBaixo`).
    -   Verificar se o resultado indica que o pedido não foi processado.
-   **Resultado Esperado:**

    -   O resultado deve ser `"Pedido não processado."`.
