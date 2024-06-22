
## Padrão Facade - Home Theater

O projeto implementa o padrão de projeto Facade para simplificar a interação com os componentes de um sistema de Home Theater, proporcionando uma interface unificada para operações complexas.

### DvdPlayer.java

A classe `DvdPlayer` representa um player de DVD.

#### Métodos:

-   `public String on()`: Liga o DVD Player.
-   `public String play(String filme)`: Reproduz um filme específico.
-   `public String off()`: Desliga o DVD Player.

### Projetor.java

A classe `Projetor` representa um projetor utilizado no sistema de Home Theater.

#### Métodos:

-   `public String on()`: Liga o projetor.
-   `public String setInput(String entrada)`: Define a entrada do projetor (por exemplo, DVD, HDMI).
-   `public String off()`: Desliga o projetor.

### SoundBar.java

A classe `SoundBar` representa uma barra de som no sistema de Home Theater.

#### Métodos:

-   `public String on()`: Liga a SoundBar.
-   `public String setVolume(int nivel)`: Define o volume da SoundBar.
-   `public String off()`: Desliga a SoundBar.

### HomeTheaterFacade.java

A classe `HomeTheaterFacade` fornece uma interface simplificada para operações no sistema de Home Theater, encapsulando a complexidade dos componentes individuais.

#### Atributos:

-   `private final DvdPlayer dvd`: Instância do DVD Player.
-   `private final Projetor projetor`: Instância do Projetor.
-   `private final SoundBar soundBar`: Instância da SoundBar.

#### Construtor:

-   `public HomeTheaterFacade(DvdPlayer dvd, Projetor projetor, SoundBar soundBar)`: Inicializa a fachada com as instâncias dos componentes necessários.

#### Métodos:

-   `public List<String> watchMovie(String filme)`: Inicia a reprodução de um filme, realizando uma série de ações sequenciais, como ligar o DVD Player, iniciar a reprodução, ligar o projetor, configurar a entrada e ajustar o volume da SoundBar.
-   `public List<String> endMovie()`: Encerra a sessão de filme, desligando todos os componentes e finalizando o sistema de Home Theater.


### TestFacade.java

Os testes a seguir verificam o correto funcionamento da classe `HomeTheaterFacade`, que utiliza o padrão de projeto Facade para simplificar a interação com os dispositivos de um home theater.

#### `testWatchMovie()`

-   **Objetivo:** Verificar se o método `watchMovie()` da classe `HomeTheaterFacade` executa corretamente a sequência de ações para assistir a um filme.
-   **Método:** Instancia objetos de `DvdPlayer`, `Projetor`, `SoundBar` e `HomeTheaterFacade`. Chama o método `watchMovie()` com o filme "The Matrix". Verifica se a lista de ações retorna possui o tamanho esperado e se cada ação ocorre na sequência correta.
-   **Resultado Esperado:** O método `watchMovie()` deve ligar os dispositivos, iniciar a reprodução do filme no DVD, configurar o projetor e a SoundBar, e finalizar informando que o filme está pronto.

#### `testEndMovie()`

-   **Objetivo:** Verificar se o método `endMovie()` da classe `HomeTheaterFacade` executa corretamente a sequência de ações para encerrar a exibição de um filme.
-   **Método:** Instancia objetos de `DvdPlayer`, `Projetor`, `SoundBar` e `HomeTheaterFacade`. Chama o método `endMovie()`. Verifica se a lista de ações retorna possui o tamanho esperado e se cada ação ocorre na sequência correta.
-   **Resultado Esperado:** O método `endMovie()` deve desligar os dispositivos e informar que o home theater foi desligado.

## Comprovação dos Testes:
![image](https://github.com/JotaVS/AtividadePadraoProjeto/assets/114262723/b6b736b7-cc08-4fb9-8581-dac821275a9d)
