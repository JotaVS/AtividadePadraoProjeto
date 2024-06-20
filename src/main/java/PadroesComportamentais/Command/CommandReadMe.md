## Padrão Command - Sistema de Pedidos em Restaurante

Este projeto usa o padrão de projeto Command para tratar os pedidos o como um objeto, permitindo que você trate essas solicitações de maneira flexível e reutilizáveis.

### Command.java

A interface `Command` define um método para executar um comando.

#### Métodos

-   `String execute()`: Executa a ação encapsulada pelo comando.

### Garcom.java

A classe `Garcom` é o invocador que mantém uma referência a um comando e executa o comando quando solicitado.

#### Atributos

-   `private Command command`: Referência ao comando a ser executado.

#### Métodos

-   `public void setCommand(Command command)`: Define o comando a ser executado pelo garçom.
-   `public String anotarPedido()`: Executa o comando definido e retorna a mensagem de execução.

### PedidoMacarrao.java

A classe `PedidoMacarrao` implementa a interface `Command` e encapsula a solicitação de preparo de macarrão.

#### Atributos

-   `private ReceptorPedido receptor`: Referência ao receptor que irá processar o pedido.

#### Construtor

-   `public PedidoMacarrao(ReceptorPedido receptor)`: Inicializa o pedido com o receptor apropriado.

#### Métodos

-   `@Override public String execute()`: Executa a ação de preparar macarrão através do receptor.

### PedidoPizza.java

A classe `PedidoPizza` implementa a interface `Command` e encapsula a solicitação de preparo de pizza.

#### Atributos

-   `private ReceptorPedido receptor`: Referência ao receptor que irá processar o pedido.

#### Construtor

-   `public PedidoPizza(ReceptorPedido receptor)`: Inicializa o pedido com o receptor apropriado.

#### Métodos

-   `@Override public String execute()`: Executa a ação de preparar pizza através do receptor.

### PedidoSalada.java

A classe `PedidoSalada` implementa a interface `Command` e encapsula a solicitação de preparo de salada.

#### Atributos

-   `private ReceptorPedido receptor`: Referência ao receptor que irá processar o pedido.

#### Construtor

-   `public PedidoSalada(ReceptorPedido receptor)`: Inicializa o pedido com o receptor apropriado.

#### Métodos

-   `@Override public String execute()`: Executa a ação de preparar salada através do receptor.

### ReceptorPedido.java

A classe `ReceptorPedido` é responsável por processar os pedidos reais, fornecendo métodos para preparar cada tipo de prato.

#### Métodos

-   `public String preparePizza()`: Prepara uma pizza e retorna uma mensagem.
-   `public String prepareMacarrao()`: Prepara um macarrão e retorna uma mensagem.
-   `public String prepareSalada()`: Prepara uma salada e retorna uma mensagem.
