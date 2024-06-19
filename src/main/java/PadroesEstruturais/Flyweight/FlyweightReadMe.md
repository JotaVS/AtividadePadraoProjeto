
## Padrão Flyweight - Parque de Árvores

O projeto implementa o padrão de projeto Flyweight para otimizar o uso de memória ao lidar com múltiplos objetos semelhantes, neste caso, tipos diferentes de árvores em um parque.

### Arvore.java

A classe `Arvore` representa uma árvore específica no parque.

#### Atributos:

-   `private final int x`: Posição x da árvore no parque.
-   `private final int y`: Posição y da árvore no parque.
-   `private final TipoArvore tipoArvore`: Tipo específico de árvore.

#### Construtor:

-   `public Arvore(int x, int y, TipoArvore tipoArvore)`: Inicializa uma árvore com uma posição específica (x, y) e um tipo de árvore.

#### Métodos:

-   `public String getArvore()`: Retorna uma representação textual da árvore, incluindo seu tipo e posição.
-   `public int getX()`: Retorna a coordenada x da árvore.
-   `public int getY()`: Retorna a coordenada y da árvore.
-   `public TipoArvore getTipo()`: Retorna o tipo de árvore desta instância.

### ArvoreFactory.java

A classe `ArvoreFactory` implementa um padrão Flyweight para gerenciar tipos únicos de árvores no parque.

#### Atributo:

-   `private static final Map<String, TipoArvore> tiposArvore`: Armazena os tipos de árvore conhecidos, utilizando uma combinação única de nome, cor e textura como chave.

#### Métodos:

-   `public static TipoArvore getTipoArvore(String nome, String cor, String textura)`: Retorna um objeto `TipoArvore` existente ou cria um novo se não existir na fábrica.
-   `public static int getQuantidadeTiposArvore()`: Retorna o número total de tipos de árvores diferentes gerenciados pela fábrica.

### Parque.java

A classe `Parque` mantém uma coleção de todas as árvores plantadas no parque.

#### Atributo:

-   `private final List<Arvore> arvores`: Lista de todas as árvores plantadas no parque.

#### Métodos:

-   `public void plantarArvore(int x, int y, String nome, String cor, String textura)`: Planta uma nova árvore no parque com base nas características especificadas, utilizando a `ArvoreFactory` para obter o tipo de árvore correspondente.
-   `public List<String> getParque()`: Retorna uma lista de representações textuais de todas as árvores no parque.
-   `public int getQuantidadeArvore()`: Retorna o número total de árvores plantadas no parque.

### TipoArvore.java

A classe `TipoArvore` define os atributos específicos que caracterizam um tipo de árvore.

#### Atributos:

-   `private final String nome`: Nome do tipo de árvore.
-   `private final String cor`: Cor predominante da árvore.
-   `private final String textura`: Textura da casca da árvore.

#### Construtor:

-   `public TipoArvore(String nome, String cor, String textura)`: Inicializa um tipo de árvore com nome, cor e textura específicos.

#### Métodos:

-   `public String getNome()`: Retorna o nome do tipo de árvore.
-   `public String getCor()`: Retorna a cor predominante da árvore.
-   `public String getTextura()`: Retorna a textura da casca da árvore.
-   `@Override public String toString()`: Retorna uma representação textual dos atributos do tipo de árvore.

### TestFlyweight.java
Os testes a seguir verificam o funcionamento correto das classes implementadas utilizando o padrão Flyweight para gerenciamento eficiente de árvores em um parque.

#### `testTipoArvore()`

-   **Objetivo:** Verificar a correta inicialização e obtenção dos atributos de um objeto `TipoArvore`.
-   **Método:** Cria uma instância de `TipoArvore` com nome "Carvalho", cor "Verde" e textura "Aspero". Em seguida, compara se os métodos `getNome()`, `getCor()` e `getTextura()` retornam os valores esperados.
-   **Resultado Esperado:** Os valores retornados pelos métodos devem corresponder aos valores passados durante a inicialização.

#### `testArvore()`

-   **Objetivo:** Verificar a correta inicialização e obtenção dos atributos de um objeto `Arvore`.
-   **Método:** Cria uma instância de `TipoArvore` com nome "Carvalho", cor "Verde" e textura "Aspero". Depois, cria uma instância de `Arvore` com posição (10, 20) e o tipo de árvore criado anteriormente. Verifica se os métodos `getX()`, `getY()` e `getTipo()` retornam os valores esperados.
-   **Resultado Esperado:** Os valores retornados pelos métodos devem corresponder aos valores passados durante a inicialização.

#### `testGetArvore()`

-   **Objetivo:** Verificar se o método `getArvore()` da classe `Arvore` retorna a representação correta da árvore.
-   **Método:** Cria uma instância de `TipoArvore` com nome "Carvalho", cor "Verde" e textura "Aspero". Em seguida, cria uma instância de `Arvore` com posição (10, 20) e o tipo de árvore criado anteriormente. Verifica se o método `getArvore()` retorna a string esperada contendo o tipo de árvore e sua localização.
-   **Resultado Esperado:** A string retornada pelo método `getArvore()` deve conter a representação correta da árvore.

#### `testArvoreFactory()`

-   **Objetivo:** Verificar o funcionamento correto da `ArvoreFactory` ao gerenciar tipos de árvores utilizando o padrão Flyweight.
-   **Método:** Utiliza a `ArvoreFactory` para obter tipos de árvores com as características "Carvalho Verde Aspero". Compara se duas chamadas para criar o mesmo tipo de árvore retornam a mesma instância (`assertSame`). Em seguida, obtém um novo tipo de árvore com características diferentes ("Pinheiro Verde Suave") e verifica se este é diferente dos anteriores (`assertNotSame`). Finalmente, verifica se o número total de tipos de árvores na fábrica é igual a 2.
-   **Resultado Esperado:** A fábrica deve reutilizar tipos de árvores existentes sempre que possível e manter um registro correto do número de tipos de árvores diferentes.

#### `testPlantarArvore()`

-   **Objetivo:** Verificar se o método `plantarArvore()` da classe `Parque` adiciona corretamente as árvores à lista interna.
-   **Método:** Cria uma instância de `Parque` e chama o método `plantarArvore()` duas vezes para adicionar árvores com o mesmo tipo ("Carvalho Verde Aspero") em diferentes posições. Em seguida, verifica se o número total de árvores no parque é igual a 2.
-   **Resultado Esperado:** O método `plantarArvore()` deve adicionar corretamente as árvores à lista do parque.

#### `testGetParque()`

-   **Objetivo:** Verificar se o método `getParque()` da classe `Parque` retorna corretamente a lista de representações textuais das árvores no parque.
-   **Método:** Cria uma instância de `Parque` e chama o método `plantarArvore()` duas vezes para adicionar árvores com tipos diferentes ("Carvalho Verde Aspero" e "Pinheiro Verde Suave"). Verifica se o método `getParque()` retorna uma lista contendo as representações textuais corretas das árvores adicionadas.
-   **Resultado Esperado:** O método `getParque()` deve retornar corretamente a lista de representações textuais das árvores no parque.
