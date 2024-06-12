
# Padrão Builder - Produto
## Produto.java
A classe Produto representa um produto com atributos como nome, descrição e preço. Esta classe fornece métodos para acessar e modificar esses atributos.

### Variáveis:
-   private String nome: Representa o nome do produto.
-   private String descricao: Representa a descrição do produto.
-   private double preco: Representa o preço do produto.

### Construtor:
Inicializa um novo produto com valores padrão (nome e descrição vazios, e preço igual a 0).

### Métodos get e set:
-   public String getNome(): Retorna o nome do produto.
-   public void setNome(String nome): Define o nome do produto.
-   public String getDescricao(): Retorna a descrição do produto.
-   public void setDescricao(String descricao): Define a descrição do produto.
-   public double getPreco(): Retorna o preço do produto.
-   public void setPreco(double preco): Define o preço do produto.

## ProdutoBuilder.java
A classe ProdutoBuilder busca aplicar o padrão “Builder” para o projeto. A partir dela, é possível construir uma instância nova da classe Produto de forma mais simples e passo-a-passo.

### Variáveis:
-   private Produto produto: O objeto Produto a ser construído.

### Construtor:
Inicializa um novo objeto da classe Produto.

### Métodos:
-   public Produto build(): Constrói e retorna a instância do Produto configurada. Antes de retornar o produto, valida se os campos obrigatórios estão corretamente preenchidos, retornando uma exceção caso o preço seja 0 ou o nome esteja vazio.
-   public ProdutoBuilder setNome(String nome): Define o nome do produto.
-   public ProdutoBuilder setDescricao(String descricao): Define a descrição do produto.
-   public ProdutoBuilder setPreco(double preco): Define o preço do produto.

## TestBuilder.java

A classe TestBuilder contém testes para validar a implementação do padrão Builder na classe ProdutoBuilder. Os testes asseguram que um produto pode ser criado corretamente com o Builder e que as exceções apropriadas são lançadas quando faltam atributos obrigatórios.

### retornarProdutoSemNome()
-   Objetivo: Verificar se uma exceção é lançada ao tentar construir um produto sem definir o nome.
-   Método: Tenta construir um produto sem definir o nome e espera uma exceção IllegalArgumentException com a mensagem "Nome inválido".
-   Resultado Esperado: Uma exceção IllegalArgumentException é lançada com a mensagem "Nome inválido".

### retornarProdutoSemPreco()
-   Objetivo: Verificar se uma exceção é lançada ao tentar construir um produto sem definir o preço.
-   Método: Tenta construir um produto sem definir o preço e espera uma exceção IllegalArgumentException com a mensagem "Preco inválido".
-   Resultado Esperado: Uma exceção IllegalArgumentException é lançada com a mensagem "Preco inválido".

### retornarProdutoValido()
-   Objetivo: Verificar se um produto válido pode ser construído usando o ProdutoBuilder.
-   Método: Constrói um produto com nome, descrição e preço definidos e verifica se os atributos foram corretamente atribuídos.
-   Resultado Esperado: O produto é criado com os atributos corretos e não é nulo.
