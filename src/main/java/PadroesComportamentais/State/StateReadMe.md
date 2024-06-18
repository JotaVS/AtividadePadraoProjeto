# Padrão State - Jukebox

O projeto implementa o padrão de projeto State para modelar o comportamento dinâmico de uma Jukebox, permitindo transições entre estados como Parado, Tocando e Moeda Inserida.

## Jukebox.java

A classe `Jukebox` representa a máquina de Jukebox que pode estar em diferentes estados e executa ações com base nesses estados.

### Atributos:

-   `private JukeboxEstado estado`: Estado atual da Jukebox.

### Construtor:

-   `public Jukebox()`: Inicializa a Jukebox no estado Parado por padrão.

### Métodos:

-   `public void setEstado(JukeboxEstado estado)`: Define o estado da Jukebox.
-   `public boolean inserirMoeda()`: Executa a ação de inserir moeda, delegando ao estado atual.
-   `public boolean iniciarMusica()`: Executa a ação de iniciar música, delegando ao estado atual.
-   `public boolean pararMusica()`: Executa a ação de parar música, delegando ao estado atual.
-   `public JukeboxEstado getEstado()`: Retorna o estado atual da Jukebox.

## JukeboxEstado.java

A classe abstrata `JukeboxEstado` define o contrato para todos os estados possíveis da Jukebox.

### Métodos:

-   `public abstract String getEstado()`: Retorna o nome do estado.
-   `public boolean inserirMoeda(Jukebox jukebox)`: Método padrão para inserir moeda.
-   `public boolean iniciarMusica(Jukebox jukebox)`: Método padrão para iniciar música.
-   `public boolean pararMusica(Jukebox jukebox)`: Método padrão para parar música.

## JukeboxEstadoParado.java

A classe `JukeboxEstadoParado` implementa o estado em que a Jukebox está parada.

### Métodos:

-   `public static JukeboxEstadoParado getInstance()`: Retorna a instância única do estado Parado.
-   `public String getEstado()`: Retorna "Jukebox Parada".
-   `public boolean inserirMoeda(Jukebox jukebox)`: Transição para o estado Moeda Inserida ao inserir moeda.

## JukeboxEstadoTocando.java

A classe `JukeboxEstadoTocando` implementa o estado em que a Jukebox está tocando música.

### Métodos:

-   `public static JukeboxEstadoTocando getInstance()`: Retorna a instância única do estado Tocando.
-   `public String getEstado()`: Retorna "Jukebox Tocando".
-   `public boolean pararMusica(Jukebox jukebox)`: Transição para o estado Parado ao parar a música.

## JukeboxEstadoMoedaInserida.java

A classe `JukeboxEstadoMoedaInserida` implementa o estado em que há moeda inserida na Jukebox.

### Métodos:

-   `public static JukeboxEstadoMoedaInserida getInstance()`: Retorna a instância única do estado Moeda Inserida.
-   `public String getEstado()`: Retorna "Jukebox Possui Moeda".
-   `public boolean iniciarMusica(Jukebox jukebox)`: Transição para o estado Tocando ao iniciar a música.

## TestState.java
O arquivo `TestState.java` contém testes unitários para verificar o comportamento da Jukebox em diferentes estados utilizando o padrão State: `JukeboxParada`, `JukeboxTocando` e `JukeboxMoedaInserida`.

#### `public void setUp()`

Antes de cada teste, as instâncias de Jukebox são configuradas com diferentes estados iniciais:
-   `jukeboxParada`: Instância da Jukebox configurada com o estado inicial `JukeboxEstadoParado`.
-   `jukeboxTocando`: Instância da Jukebox configurada com o estado inicial `JukeboxEstadoTocando`.
-   `jukeboxMoedaInserida`: Instância da Jukebox configurada com o estado inicial `JukeboxEstadoMoedaInserida`.

### Testes do Estado `JukeboxParada`

#### `public void naoPodeIniciarJukeboxParada()`

-   **Objetivo:** Verificar que a Jukebox não pode iniciar a música quando está no estado `JukeboxParada`.
    
-   **Método:**
    
    -   Chamar `iniciarMusica()` na instância de `jukeboxParada`.
    -   Verificar se o método retorna `false`.
-   **Resultado Esperado:**
    
    -   O método `iniciarMusica()` deve retornar `false`, indicando que a música não pode ser iniciada quando a Jukebox está parada.

#### `public void naoPodePararJukeboxParada()`

-   **Objetivo:** Verificar que a Jukebox não pode parar a música quando está no estado `JukeboxParada`.
    
-   **Método:**
    
    -   Chamar `pararMusica()` na instância de `jukeboxParada`.
    -   Verificar se o método retorna `false`.
-   **Resultado Esperado:**
    
    -   O método `pararMusica()` deve retornar `false`, indicando que a música não pode ser parada quando a Jukebox está parada.

#### `public void deveAceitarMoedaJukeboxParada()`

-   **Objetivo:** Verificar que a Jukebox aceita inserção de moeda quando está no estado `JukeboxParada`.
    
-   **Método:**
    
    -   Chamar `inserirMoeda()` na instância de `jukeboxParada`.
    -   Verificar se o método retorna `true`.
    -   Verificar se o estado da Jukebox após a inserção de moeda é `"Jukebox Possui Moeda"`.
-   **Resultado Esperado:**
    
    -   O método `inserirMoeda()` deve retornar `true`, indicando que a moeda foi inserida com sucesso.
    -   O estado da Jukebox após a inserção de moeda deve ser `"Jukebox Possui Moeda"`.

### Testes do Estado `JukeboxTocando`

#### `public void naoPodeIniciarJukeboxTocando()`

-   **Objetivo:** Verificar que a Jukebox não pode iniciar a música quando está no estado `JukeboxTocando`.
    
-   **Método:**
    
    -   Chamar `iniciarMusica()` na instância de `jukeboxTocando`.
    -   Verificar se o método retorna `false`.
-   **Resultado Esperado:**
    
    -   O método `iniciarMusica()` deve retornar `false`, indicando que a música não pode ser iniciada quando a Jukebox já está tocando.

#### `public void devePararJukeboxTocando()`

-   **Objetivo:** Verificar que a Jukebox pode parar a música quando está no estado `JukeboxTocando`.
    
-   **Método:**
    
    -   Chamar `pararMusica()` na instância de `jukeboxTocando`.
    -   Verificar se o método retorna `true`.
    -   Verificar se o estado da Jukebox após parar a música é `"Jukebox Parada"`.
-   **Resultado Esperado:**
    
    -   O método `pararMusica()` deve retornar `true`, indicando que a música foi parada com sucesso.
    -   O estado da Jukebox após parar a música deve ser `"Jukebox Parada"`.

#### `public void naoPodeAceitarMoedaJukeboxTocando()`

-   **Objetivo:** Verificar que a Jukebox não pode aceitar inserção de moeda quando está no estado `JukeboxTocando`.
    
-   **Método:**
    
    -   Chamar `inserirMoeda()` na instância de `jukeboxTocando`.
    -   Verificar se o método retorna `false`.
-   **Resultado Esperado:**
    
    -   O método `inserirMoeda()` deve retornar `false`, indicando que não é possível inserir moeda enquanto a Jukebox está tocando música.

### Testes do Estado `JukeboxMoedaInserida`

#### `public void deveIniciarJukeboxMoedaInserida()`

-   **Objetivo:** Verificar que a Jukebox pode iniciar a música quando está no estado `JukeboxMoedaInserida`.
    
-   **Método:**
    
    -   Chamar `iniciarMusica()` na instância de `jukeboxMoedaInserida`.
    -   Verificar se o método retorna `true`.
    -   Verificar se o estado da Jukebox após iniciar a música é `"Jukebox Tocando"`.
-   **Resultado Esperado:**
    
    -   O método `iniciarMusica()` deve retornar `true`, indicando que a música foi iniciada com sucesso.
    -   O estado da Jukebox após iniciar a música deve ser `"Jukebox Tocando"`.

#### `public void naoPodePararJukeboxMoedaInserida()`

-   **Objetivo:** Verificar que a Jukebox não pode parar a música imediatamente após inserção de moeda.
    
-   **Método:**
    
    -   Chamar `pararMusica()` na instância de `jukeboxMoedaInserida`.
    -   Verificar se o método retorna `false`.
-   **Resultado Esperado:**
    
    -   O método `pararMusica()` deve retornar `false`, indicando que não é possível parar a música imediatamente após inserir moeda.

#### `public void naoPodeAceitarMoedaJukeboxMoedaInserida()`

-   **Objetivo:** Verificar que a Jukebox não pode aceitar inserção de moeda adicional quando já possui moeda inserida.
    
-   **Método:**
    
    -   Chamar `inserirMoeda()` na instância de `jukeboxMoedaInserida`.
    -   Verificar se o método retorna `false`.
-   **Resultado Esperado:**
    
    -   O método `inserirMoeda()` deve retornar `false`, indicando que não é possível inserir outra moeda enquanto já há uma moeda inserida na Jukebox.
