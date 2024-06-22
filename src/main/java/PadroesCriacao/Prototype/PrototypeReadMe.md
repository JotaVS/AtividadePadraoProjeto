
# Padrão Prototype - Figuras
## Figura.java
Na classe Figura, o objetivo é fazer um padrão Prototype para a criação de protótipos de figuras geométricas, isso permite com que sejam criados objetos pré-montados que, caso seja necessário uma instância de mesma configuração, seja possível apenas clonar o protótipo original.

### Variáveis:
- private String nome: Representa o nome da figura.
- private String cor: Representa a cor da figura.
- private int x: Representa a coordenada x da figura.
- private int y: Representa a coordenada y da figura.

### Construtor:
Inicializa um novo protótipo. Para criar um novo protótipo, o construtor pede, na ordem, o nome da figura em formato de string, a cor da figura em formato de string, e as coordenadas x e y, ambas em formato de int.

### Métodos get e set:
- public String getNome(): Retorna o nome da figura.
- public void setNome(String nome): Define o nome da figura.
- public String getCor(): Retorna a cor da figura.
- public void setCor(String cor): Define a cor da figura.
- public int getX(): Retorna a coordenada x da figura.
- public void setX(int x): Define a coordenada x da figura.
- public int getY(): Retorna a coordenada y da figura.
- public void setY(int y): Define a coordenada y da figura.

### Método Clone:
O método “clone ()” é o que permite com que o protótipo seja clonado caso seja necessário a criação de uma instância nova com a mesma configuração do objeto protótipo.
O método retorna as configurações do protótipo, permitindo que sejam clonados na nova instância, além disso, ele irá lançar uma exceção “CloneNotSupportedException” caso a clonagem resulte em erro.

## TestPrototype
  A classe TestPrototype verifica a implementação do padrão Prototype na classe Figura. Este teste garante que a clonagem de objetos funcione corretamente e que as alterações no clone não afetem o objeto original.

### criarProtótipo(): 
Configura um protótipo de Figura com valores iniciais e cria um clone desse protótipo antes de cada teste.

### nomesIguais():
-   Objetivo: Verificar se o clone tem o mesmo nome que o objeto original.
-   Método: Compara os nomes das figuras original e clone usando assertEquals.
-   Resultado Esperado: Os nomes das figuras original e clone devem ser iguais.
- 
### coresIguais()
-   Objetivo: Verificar se o clone tem a mesma cor que o objeto original.
-   Método: Compara as cores das figuras original e clone usando assertEquals.
-   Resultado Esperado: As cores das figuras original e clone devem ser iguais.

### coordenadasXIguais()
-   Objetivo: Verificar se o clone tem a mesma coordenada X que o objeto original.
-   Método: Compara as coordenadas X das figuras original e clone usando assertEquals.
-   Resultado Esperado: As coordenadas X das figuras original e clone devem ser iguais.

### coordenadasYIguais()
-   Objetivo: Verificar se o clone tem a mesma coordenada Y que o objeto original.
-   Método: Compara as coordenadas Y das figuras original e clone usando assertEquals.
-   Resultado Esperado: As coordenadas Y das figuras original e clone devem ser iguais.

### nomesDiferentes()
-   Objetivo: Verificar se a modificação do nome no clone não afeta o objeto original.
-   Método: Altera o nome do clone e compara com o nome do original usando assertNotEquals.
-   Resultado Esperado: Os nomes das figuras original e clone devem ser diferentes após a modificação.

### coresDiferentes()
-   Objetivo: Verificar se a modificação da cor no clone não afeta o objeto original.
-   Método: Altera a cor do clone e compara com a cor do original usando assertNotEquals.
-   Resultado Esperado: As cores das figuras original e clone devem ser diferentes após a modificação.

### coordenadasXDiferentes()
-   Objetivo: Verificar se a modificação da coordenada X no clone não afeta o objeto original.
-   Método: Altera a coordenada X do clone e compara com a coordenada X do original usando assertNotEquals.
-   Resultado Esperado: As coordenadas X das figuras original e clone devem ser diferentes após a modificação.

### coordenadasYDiferentes()
-   Objetivo: Verificar se a modificação da coordenada Y no clone não afeta o objeto original.
-   Método: Altera a coordenada Y do clone e compara com a coordenada Y do original usando assertNotEquals.
-   Resultado Esperado: As coordenadas Y das figuras original e clone devem ser diferentes após a modificação.

## Comprovação dos Testes
![image](https://github.com/JotaVS/AtividadePadraoProjeto/assets/114262723/1a44be90-0937-476b-8da5-7e4ddee2c394)

