# Padrão Observer - Evento e Observadores
Este projeto implementa o padrão Observer para permitir que objetos sejam notificados quando o estado de outro objeto muda.

## Classes e Interfaces

### Subject.java

A interface `Subject` define os métodos que devem ser implementados por qualquer classe que deseja atuar como sujeito no padrão Observer.

#### Métodos:

-   **void adicionarObservador(Observer o)**: Adiciona um observador à lista de observadores.
-   **void removerObservador(Observer o)**: Remove um observador da lista de observadores.
-   **void notificarObservadores()**: Notifica todos os observadores sobre uma mudança de estado.

### Observer.java

A interface `Observer` define o método que deve ser implementado por qualquer classe que deseja atuar como observador no padrão Observer.

#### Método:

-   **void atualizar(String evento)**: Método chamado pelo sujeito para notificar o observador sobre um evento.

### Evento.java

A classe `Evento` implementa a interface `Subject` e gerencia a lista de observadores. Ela notifica os observadores sobre novos eventos.

#### Variáveis:

-   **private final List<Observer> observadores**: Lista de observadores.
-   **private String ultimoEvento**: Último evento anunciado.

#### Construtor:

-   **public Evento()**: Inicializa a lista de observadores.

#### Métodos:

-   **public void adicionarObservador(Observer o)**: Adiciona um observador à lista.
-   **public void removerObservador(Observer o)**: Remove um observador da lista.
-   **public void notificarObservadores()**: Notifica todos os observadores sobre o último evento.
-   **public String getUltimoEvento()**: Retorna o último evento anunciado.
-   **public int getQuantidadeObservadores()**: Retorna a quantidade de observadores registrados.
-   **public void anunciarEvento(String evento)**: Define o último evento e notifica todos os observadores.

### Usuario.java

A classe `Usuario` implementa a interface `Observer` e define a ação a ser tomada quando um evento é recebido.

#### Variáveis:

-   **private String evento**: Evento recebido pelo observador.

#### Métodos:

-   **public void atualizar(String evento)**: Atualiza o evento e chama o método `exibir`.
-   **public void exibir()**: Exibe o evento no console.

### TestObserver.java

A classe `TestObserver` testa a funcionalidade das classes `Evento` e `Usuario` para garantir que as funcionalidades principais estão funcionando conforme esperado.

#### Métodos de Teste:

#### public void retornarUltimoEvento()

-   **Objetivo**: Verificar se o último evento anunciado é corretamente retornado.
-   **Método**:
    -   Criar uma instância de `Evento`.
    -   Criar uma instância de `Usuario` e adicioná-lo como observador do evento.
    -   Anunciar um evento "Flamengo x Vasco".
    -   Verificar se o último evento retornado é "Flamengo x Vasco".
-   **Resultado Esperado**: O método `getUltimoEvento` deve retornar "Flamengo x Vasco".

#### public void retornarVazio()

-   **Objetivo**: Verificar se a lista de observadores está vazia após remover um observador.
-   **Método**:
    -   Criar uma instância de `Evento`.
    -   Criar uma instância de `Usuario` e adicioná-lo como observador do evento.
    -   Remover o observador.
    -   Verificar se a quantidade de observadores é 0.
-   **Resultado Esperado**: O método `getQuantidadeObservadores` deve retornar 0.
