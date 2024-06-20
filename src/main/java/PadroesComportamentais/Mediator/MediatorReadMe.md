
## Padrão Mediator - Sistema de Chat

Este projeto implementa o padrão de projeto Mediator para facilitar a comunicação entre diferentes tipos de usuários (Clientes e Funcionários) em um sistema de chat, sem que eles precisem referenciar diretamente uns aos outros.

### ChatRoom.java

A classe `ChatRoom` representa uma sala de chat onde as mensagens são exibidas.

#### Métodos

-   `public String mostrarMensagem(String message, Usuario usuario, String destino)`: Formata e retorna uma mensagem indicando quem enviou a mensagem e para onde foi enviada.

### Cliente.java

A classe `Cliente` representa um usuário do tipo cliente que herda da classe `Usuario`.

#### Construtor

-   `public Cliente(String nome, Mediator mediator)`: Inicializa um cliente com um nome e um mediador.

### ConcreteMediator.java

A classe `ConcreteMediator` implementa a interface `Mediator` e coordena a comunicação entre `Funcionario` e `Cliente`.

#### Atributos

-   `private ChatRoom chatFuncionario`: Sala de chat para funcionários.
-   `private ChatRoom chatCliente`: Sala de chat para clientes.

#### Construtor

-   `public ConcreteMediator(ChatRoom chatFuncionario, ChatRoom chatCliente)`: Inicializa o mediador com as salas de chat específicas para funcionários e clientes.

#### Métodos

-   `@Override public String enviarMensagem(String message, Usuario usuario)`: Envia uma mensagem para a sala de chat apropriada com base no tipo de usuário. Retorna a mensagem formatada ou um aviso de tipo de usuário desconhecido.

### Funcionario.java

A classe `Funcionario` representa um usuário do tipo funcionário que herda da classe `Usuario`.

#### Construtor

-   `public Funcionario(String name, Mediator mediator)`: Inicializa um funcionário com um nome e um mediador.

### Mediator.java

A interface `Mediator` define o método necessário para enviar mensagens entre usuários.

#### Métodos

-   `String enviarMensagem(String mensagem, Usuario usuario)`: Envia uma mensagem de um usuário.

### Usuario.java

A classe abstrata `Usuario` representa um usuário genérico do sistema de chat.

#### Atributos

-   `protected String nome`: Nome do usuário.
-   `protected Mediator mediator`: Mediador associado ao usuário.

#### Construtor

-   `public Usuario(String nome, Mediator mediator)`: Inicializa um usuário com um nome e um mediador.

#### Métodos

-   `public String sendMessage(String message)`: Envia uma mensagem através do mediador.
-   `public String getNome()`: Retorna o nome do usuário.

### UsuarioDesconhecido.java

A classe `UsuarioDesconhecido` representa um usuário de tipo desconhecido que herda da classe `Usuario`.

#### Construtor

-   `public UsuarioDesconhecido(String nome, Mediator mediator)`: Inicializa um usuário desconhecido com um nome e um mediador.
