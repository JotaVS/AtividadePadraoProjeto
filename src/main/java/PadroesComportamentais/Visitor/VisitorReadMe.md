## Padrão Visitor - Sistema de Personagens

Este projeto usa o padrão de projeto Visitor num sistema de personagens de jogo com o objetivo é permitir operações diversas, como cálculo de dano e geração de relatórios, sobre os personagens sem modificar suas classes.

### Arqueiro.java

A classe `Arqueiro` representa um personagem do tipo Arqueiro no jogo.

#### Atributos

-   `private String nome`: O nome do arqueiro.
-   `private int danoDistancia`: O dano causado pelo arqueiro à distância.

#### Construtor

-   `public Arqueiro(String nome, int danoDistancia)`: Inicializa o arqueiro com o nome e dano à distância fornecidos.
    -   `nome`: O nome do arqueiro.
    -   `danoDistancia`: O dano à distância do arqueiro.

#### Métodos

-   `public String getNome()`: Retorna o nome do arqueiro.
-   `public int getDanoDistancia()`: Retorna o dano à distância do arqueiro.
-   `@Override public String aceitar(PersonagemVisitor visitor)`: Aceita um visitante e chama seu método específico para o arqueiro.

### CalculadorDanoVisitor.java

A classe `CalculadorDanoVisitor` implementa um visitante para calcular o dano total de diferentes tipos de personagens.

#### Atributos

-   `private int danoTotal`: O dano total acumulado de todos os personagens visitados.

#### Métodos

-   `@Override public String visitar(Guerreiro guerreiro)`: Calcula o dano do guerreiro e o adiciona ao dano total.
    -   `guerreiro`: A instância do guerreiro a ser visitada.
-   `@Override public String visitar(Mago mago)`: Calcula o dano do mago e o adiciona ao dano total.
    -   `mago`: A instância do mago a ser visitada.
-   `@Override public String visitar(Arqueiro arqueiro)`: Calcula o dano do arqueiro e o adiciona ao dano total.
    -   `arqueiro`: A instância do arqueiro a ser visitada.
-   `public int getDanoTotal()`: Retorna o dano total acumulado.

### Guerreiro.java

A classe `Guerreiro` representa um personagem do tipo Guerreiro no jogo.

#### Atributos

-   `private String nome`: O nome do guerreiro.
-   `private int danoAtaque`: O dano causado pelo guerreiro em combate corpo a corpo.

#### Construtor

-   `public Guerreiro(String nome, int danoAtaque)`: Inicializa o guerreiro com o nome e dano de ataque fornecidos.
    -   `nome`: O nome do guerreiro.
    -   `danoAtaque`: O dano de ataque do guerreiro.

#### Métodos

-   `public String getNome()`: Retorna o nome do guerreiro.
-   `public int getDanoAtaque()`: Retorna o dano de ataque do guerreiro.
-   `@Override public String aceitar(PersonagemVisitor visitor)`: Aceita um visitante e chama seu método específico para o guerreiro.

### Mago.java

A classe `Mago` representa um personagem do tipo Mago no jogo.

#### Atributos

-   `private String nome`: O nome do mago.
-   `private int danoMagico`: O dano causado pelo mago usando magia.

#### Construtor

-   `public Mago(String nome, int danoMagico)`: Inicializa o mago com o nome e dano mágico fornecidos.
    -   `nome`: O nome do mago.
    -   `danoMagico`: O dano mágico do mago.

#### Métodos

-   `public String getNome()`: Retorna o nome do mago.
-   `public int getDanoMagico()`: Retorna o dano mágico do mago.
-   `@Override public String aceitar(PersonagemVisitor visitor)`: Aceita um visitante e chama seu método específico para o mago.

### Personagem.java

A interface `Personagem` define um método para aceitar visitantes.

#### Métodos

-   `String aceitar(PersonagemVisitor visitor)`: Aceita um visitante.

### PersonagemVisitor.java

A interface `PersonagemVisitor` define métodos de visita para diferentes tipos de personagens.

#### Métodos

-   `String visitar(Guerreiro guerreiro)`: Visita um guerreiro.
-   `String visitar(Mago mago)`: Visita um mago.
-   `String visitar(Arqueiro arqueiro)`: Visita um arqueiro.

### StatusVisitor.java

A classe `StatusVisitor` implementa um visitante para gerar um relatório do status dos personagens.

#### Atributos

-   `private StringBuilder relatorio`: Acumula o relatório dos personagens visitados.

#### Métodos

-   `@Override public String visitar(Guerreiro guerreiro)`: Adiciona informações sobre o guerreiro ao relatório.
    -   `guerreiro`: A instância do guerreiro a ser visitada.
-   `@Override public String visitar(Mago mago)`: Adiciona informações sobre o mago ao relatório.
    -   `mago`: A instância do mago a ser visitada.
-   `@Override public String visitar(Arqueiro arqueiro)`: Adiciona informações sobre o arqueiro ao relatório.
    -   `arqueiro`: A instância do arqueiro a ser visitada.
-   `public String getRelatorio()`: Retorna o relatório acumulado.

### TestVisitor.java

O `TestVisitor.java` contém testes unitários para validar o comportamento do padrão de design Visitor no contexto de personagens de um jogo. Os testes verificam a funcionalidade de cálculo de dano total e geração de relatórios de status para diferentes tipos de personagens (`Guerreiro`, `Mago`, `Arqueiro`) utilizando visitantes (`CalculadorDanoVisitor` e `StatusVisitor`).

#### `public void testDamageCalculatorVisitor()`

-   **Objetivo:** Verificar o cálculo do dano total causado por diferentes personagens utilizando o visitante `CalculadorDanoVisitor`.

-   **Método:**

    -   Criar um array de `Personagem` contendo instâncias de `Guerreiro`, `Mago` e `Arqueiro` com valores específicos de poder de ataque ou mágico.
    -   Criar uma instância de `CalculadorDanoVisitor`.
    -   Fazer cada personagem aceitar o visitante `CalculadorDanoVisitor`, permitindo que o visitante calcule o dano total.
    -   Verificar se o dano total calculado corresponde ao valor esperado.
-   **Resultado Esperado:**

    -   O dano total deve ser 160.

#### `public void testStatusReportVisitor()`

-   **Objetivo:** Verificar a geração de um relatório de status para diferentes personagens utilizando o visitante `StatusVisitor`.

-   **Método:**

    -   Criar um array de `Personagem` contendo instâncias de `Guerreiro`, `Mago` e `Arqueiro` com valores específicos de poder de ataque ou mágico.
    -   Criar uma instância de `StatusVisitor`.
    -   Fazer cada personagem aceitar o visitante `StatusVisitor`, permitindo que o visitante gere um relatório de status.
    -   Verificar se o relatório de status gerado corresponde ao valor esperado.
-   **Resultado Esperado:**

    -   O relatório de status deve ser:

        `Guerreiro: O Guerreiro, Poder de Ataque: 50`

        `Mago: O Mago, Poder Mágico: 70`

        `Arqueiro: O Arqueiro, Poder de Ataque à Distância: 40`