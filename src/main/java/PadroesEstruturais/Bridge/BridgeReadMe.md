# Padrão Bridge - Carros

Esse projeto busca usar o padrão Bridge para aa implementação de um sistema de carros que utiliza o padrão Bridge para separar a cor e marca dos carro para que depois a cor do carro possa escolhida por meio de uma referência á classe `Cor`, permitindo a fácil implementação de mais cores sem modificar os modelos e vice-versa.

## CRV.java

A classe `CRV` estende a classe `Carro` e implementa a lógica específica para o carro do modelo CRV.

### Construtor:

-   **public CRV(Cor cor)**: Construtor que inicializa a instância `CRV` com a cor fornecida.

### Métodos:

-   **public int getValor()**: Método que retorna o valor do carro CRV, somando o valor base do carro com o valor adicional da cor.
    -   **valorBase**: 350000
    -   **valorCor**: `cor.valorAdicional()`

## Carro.java

A classe abstrata `Carro` define a estrutura básica para os carros e associa uma cor a cada carro.

### Variáveis:

-   **protected Cor cor**: Instância da interface `Cor` que representa a cor do carro.

### Construtor:

-   **public Carro(Cor cor)**: Construtor que inicializa a instância `Carro` com a cor fornecida.

### Métodos:

-   **public abstract int getValor()**: Método abstrato que deve ser implementado pelas subclasses para retornar o valor do carro.

## Civic.java

A classe `Civic` estende a classe `Carro` e implementa a lógica específica para o carro do modelo Civic.

### Construtor:

-   **public Civic(Cor cor)**: Construtor que inicializa a instância `Civic` com a cor fornecida.

### Métodos:

-   **public int getValor()**: Método que retorna o valor do carro Civic, somando o valor base do carro com o valor adicional da cor.
    -   **valorBase**: 260000
    -   **valorCor**: `cor.valorAdicional()`

## Cor.java

A interface `Cor` define um método que deve ser implementado pelas classes que representam cores diferentes.

### Métodos:

-   **int valorAdicional()**: Método que retorna o valor adicional da cor.

## PretoFosco.java

A classe `PretoFosco` implementa a interface `Cor` e representa a cor preta fosca.

### Métodos:

-   **public int valorAdicional()**: Método que retorna o valor adicional para a cor preta fosca.
    -   **Valor Adicional**: 0

## PretoMetalico.java

A classe `PretoMetalico` implementa a interface `Cor` e representa a cor preta metálica.

### Métodos:

-   **public int valorAdicional()**: Método que retorna o valor adicional para a cor preta metálica.
    -   **Valor Adicional**: 5000

## TestBridge.java

A classe `TestBridge` testa a implementação das classes `CRV`, `Civic`, `PretoFosco` e `PretoMetalico` para garantir que as funcionalidades de cálculo de valor dos carros estão funcionando conforme esperado.

### Métodos de Teste:

-   **public void civicMetalico()**: Testa o valor do carro `Civic` com a cor `PretoMetalico`.
    
    -   **Objetivo**: Verificar se o valor do carro Civic é calculado corretamente com a cor preta metálica.
    -   **Método**: Criar uma instância de `Civic` com a cor `PretoMetalico` e chamar o método `getValor()`.
    -   **Resultado Esperado**: O valor do carro deve ser 265000.
-   **public void civicFosco()**: Testa o valor do carro `Civic` com a cor `PretoFosco`.
    
    -   **Objetivo**: Verificar se o valor do carro Civic é calculado corretamente com a cor preta fosca.
    -   **Método**: Criar uma instância de `Civic` com a cor `PretoFosco` e chamar o método `getValor()`.
    -   **Resultado Esperado**: O valor do carro deve ser 260000.
-   **public void crvMetalico()**: Testa o valor do carro `CRV` com a cor `PretoMetalico`.
    
    -   **Objetivo**: Verificar se o valor do carro CRV é calculado corretamente com a cor preta metálica.
    -   **Método**: Criar uma instância de `CRV` com a cor `PretoMetalico` e chamar o método `getValor()`.
    -   **Resultado Esperado**: O valor do carro deve ser 355000.
-   **public void crvFosco()**: Testa o valor do carro `CRV` com a cor `PretoFosco`.
    
    -   **Objetivo**: Verificar se o valor do carro CRV é calculado corretamente com a cor preta fosca.
    -   **Método**: Criar uma instância de `CRV` com a cor `PretoFosco` e chamar o método `getValor()`.
    -   **Resultado Esperado**: O valor do carro deve ser 350000.
