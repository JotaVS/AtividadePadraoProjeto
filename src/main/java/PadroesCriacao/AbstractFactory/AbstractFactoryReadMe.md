# Padrão Abstract Factory - Emissão de Notas Fiscais
## FabricaAbstrata.java
A interface `FabricaAbstrata` define o método `emitirNota`, que é responsável por emitir uma nota fiscal. Esse método retorna uma instância de `NotaFiscal`.

### Método:
-   `NotaFiscal emitirNota()`: Método abstrato que deve ser implementado pelas subclasses para emitir uma nota fiscal.
- 
## FabricaNotaDigital.java
A classe `FabricaNotaDigital` implementa a interface `FabricaAbstrata` e é responsável por emitir notas fiscais digitais. O método `emitirNota` retorna uma instância de `NotaFiscalDigital`.

### Método:
-   `NotaFiscal emitirNota()`: Retorna uma instância de `NotaFiscalDigital`.
- 
## FabricaNotaFisica.java
A classe `FabricaNotaFisica` também implementa a interface `FabricaAbstrata` e é responsável por emitir notas fiscais físicas. O método `emitirNota` retorna uma instância de `NotaFiscalFisica`.

### Método:
-   `NotaFiscal emitirNota()`: Retorna uma instância de `NotaFiscalFisica`.
- 
## NotaFiscal.java
A interface `NotaFiscal` define o método `emitir`, que retorna uma string representando a nota fiscal emitida.

### Método:
-   `String emitir()`: Método abstrato que deve ser implementado pelas subclasses para emitir uma nota fiscal.

## NotaFiscalDigital.java
A classe `NotaFiscalDigital` implementa a interface `NotaFiscal` e representa uma nota fiscal digital. O método `emitir` retorna uma string que indica que uma nota fiscal digital foi emitida.

### Método:
-   `String emitir()`: Retorna a string "Nota Fiscal Digital."
- 
## NotaFiscalFisica.java
A classe `NotaFiscalFisica` implementa a interface `NotaFiscal` e representa uma nota fiscal física. O método `emitir` retorna uma string que indica que uma nota fiscal física foi emitida.

### Método:
-   `String emitir()`: Retorna a string "Nota Fiscal Fisica."
- 
## Pedido.java
A classe `Pedido` possui um atributo `notaFiscal` do tipo `NotaFiscal` e um construtor que recebe uma fábrica abstrata (`FabricaAbstrata`). O método `emitirNotaFiscal` utiliza a instância de `NotaFiscal` para emitir a nota fiscal correspondente.

### Variáveis:
-   `private NotaFiscal notaFiscal`: A nota fiscal associada ao pedido.

### Construtor:
-   `public Pedido(FabricaAbstrata fabrica)`: Recebe uma fábrica abstrata e emite uma nota fiscal usando essa fábrica.

### Métodos:
-   `public String emitirNotaFiscal()`: Emite a nota fiscal correspondente e retorna a string representando a nota emitida.

## TestAbstractFactory
A classe `TestAbstractFactory` contém testes para validar a implementação do padrão Abstract Factory na emissão de notas fiscais. Os testes asseguram que as notas fiscais emitidas são do tipo correto (física ou digital) conforme a fábrica utilizada.

### TesteEmitirNotaFisica()
-   **Objetivo**: Verificar se a emissão de uma nota fiscal física está funcionando corretamente.
-   **Método**: Utiliza a fábrica `FabricaNotaFisica` para criar um pedido e emite a nota fiscal, verificando se o resultado é "Nota Fiscal Fisica.".
-   **Resultado Esperado**: A string "Nota Fiscal Fisica." é retornada ao emitir a nota fiscal.

### TesteEmitirNotaDigital()
-   **Objetivo**: Verificar se a emissão de uma nota fiscal digital está funcionando corretamente.
-   **Método**: Utiliza a fábrica `FabricaNotaDigital` para criar um pedido e emite a nota fiscal, verificando se o resultado é "Nota Fiscal Digital.".
-   **Resultado Esperado**: A string "Nota Fiscal Digital." é retornada ao emitir a nota fiscal.
