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
