## Padrão Template Method - Sistema de Ataque de Personagens
Este projeto implementa o padrão de projeto Template Method para definir o esqueleto de um algoritmo de ataque de personagens, permitindo que subclasses definam etapas específicas do ataque sem alterar a estrutura geral.

### Personagem.java

A classe abstrata `Personagem` define o método template `realizarAtaque` e fornece implementações padrão para algumas etapas do ataque.

#### Métodos

-   `public final String realizarAtaque()`: Define o esqueleto do algoritmo de ataque, chamando métodos que são ou podem ser sobrescritos por subclasses.
    
    -   `StringBuilder resultado = new StringBuilder()`: Cria um `StringBuilder` para compilar os resultados das etapas do ataque.
    -   `resultado.append(prepararAtaque()).append("\n")`: Adiciona o resultado do método `prepararAtaque`.
    -   `resultado.append(atacar()).append("\n")`: Adiciona o resultado do método abstrato `atacar`.
    -   `resultado.append(finalizarAtaque()).append("\n")`: Adiciona o resultado do método `finalizarAtaque`.
    -   `return resultado.toString()`: Retorna a string compilada com os resultados das etapas do ataque.
-   `protected String prepararAtaque()`: Fornece uma implementação padrão para a preparação do ataque.
    
    -   Retorna: "Preparando para atacar..."
-   `protected String finalizarAtaque()`: Fornece uma implementação padrão para a finalização do ataque.
    
    -   Retorna: "Ataque finalizado."
-   `protected abstract String atacar()`: Método abstrato que deve ser implementado pelas subclasses para definir o ataque específico do personagem.
    

### Mago.java

A classe `Mago` é uma subclasse de `Personagem` que implementa o método `atacar` para definir o ataque específico de um mago.

#### Métodos

-   `@Override protected String atacar()`: Define o ataque específico do mago.
    -   Retorna: "Mago lançando uma bola de fogo!"

### Guerreiro.java

A classe `Guerreiro` é uma subclasse de `Personagem` que implementa o método `atacar` para definir o ataque específico de um guerreiro.

#### Métodos

-   `@Override protected String atacar()`: Define o ataque específico do guerreiro.
    -   Retorna: "Guerreiro atacando com espada!"
