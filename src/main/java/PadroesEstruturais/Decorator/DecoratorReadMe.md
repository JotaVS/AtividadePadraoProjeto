
# Padrão Decorator - Documentos

## Introdução
Este projeto implementa o padrão Decorator para adicionar funcionalidades a objetos de forma dinâmica, permitindo adicionar cabeçalhos e rodapés a documentos sem alterar a estrutura das classes de documento originais.

## Classes e Interface

### IDocumento.java

A interface `IDocumento` define o método que deve ser implementado pelas classes de documentos e seus decoradores.

#### Método:

-   **String getConteudo()**: Retorna o conteúdo do documento.

### DocumentoSimples.java

A classe `DocumentoSimples` representa um documento básico que implementa a interface `IDocumento`.

#### Variáveis:

-   **private String conteudo**: Conteúdo do documento.

#### Construtor:

-   **public DocumentoSimples(String conteudo)**: Inicializa uma instância de `DocumentoSimples` com o conteúdo fornecido.

#### Método:

-   **public String getConteudo()**: Retorna o conteúdo do documento.

### DocumentoDecorator.java

A classe `DocumentoDecorator` é um decorador abstrato que implementa a interface `IDocumento` e mantém uma referência a um documento que será decorado.

#### Variáveis:

-   **protected IDocumento documentoDecorado**: Referência ao documento que será decorado.

#### Construtor:

-   **public DocumentoDecorator(IDocumento documentoDecorado)**: Inicializa uma instância de `DocumentoDecorator` com o documento a ser decorado.

#### Método:

-   **public String getConteudo()**: Retorna o conteúdo do documento decorado.

### CabecalhoDecorator.java

A classe `CabecalhoDecorator` é um decorador concreto que adiciona um cabeçalho ao documento.

#### Variáveis:

-   **private String cabecalho**: Cabeçalho a ser adicionado ao documento.

#### Construtor:

-   **public CabecalhoDecorator(IDocumento documentoDecorado, String cabecalho)**: Inicializa uma instância de `CabecalhoDecorator` com o documento a ser decorado e o cabeçalho.

#### Método:

-   **public String getConteudo()**: Retorna o conteúdo do documento com o cabeçalho adicionado no início.

### RodapeDecorator.java

A classe `RodapeDecorator` é um decorador concreto que adiciona um rodapé ao documento.

#### Variáveis:

-   **private String rodape**: Rodapé a ser adicionado ao documento.

#### Construtor:

-   **public RodapeDecorator(IDocumento documentoDecorado, String rodape)**: Inicializa uma instância de `RodapeDecorator` com o documento a ser decorado e o rodapé.

#### Método:

-   **public String getConteudo()**: Retorna o conteúdo do documento com o rodapé adicionado no final.

### TestDecorator.java

A classe `TestDecorator` testa a funcionalidade das classes de documento e seus decoradores para garantir que as funcionalidades principais estão funcionando conforme esperado.

#### Métodos de Teste:

#### public void testDecorator()
-   **Objetivo**: Verificar se a adição de um cabeçalho e um rodapé a um documento funciona corretamente.
-   **Método**:
    -   Criar uma instância de `DocumentoSimples` com o conteúdo "Conteudo".
    -   Usar o `CabecalhoDecorator` para adicionar o cabeçalho "Cabeçalho" ao documento.
    -   Usar o `RodapeDecorator` para adicionar o rodapé "Rodapé" ao documento.
    -   Verificar se o conteúdo retornado é "Cabeçalho\nConteudo\nRodapé", sendo cada \n um paragrafo.
-   **Resultado Esperado**: A string retornada deve ser "Cabeçalho\nConteudo\nRodapé".

## Comprovação dos Testes:
![image](https://github.com/JotaVS/AtividadePadraoProjeto/assets/114262723/6d488c88-4a09-4868-ac14-464dab03b4fb)
