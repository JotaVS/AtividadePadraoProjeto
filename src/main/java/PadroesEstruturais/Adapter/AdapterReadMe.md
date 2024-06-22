
# Padrão Adapter - Conversão de Temperatura

## TemperaturaAdapter.java

A classe `TemperaturaAdapter` é uma implementação do padrão Adapter, que busca adaptar a `TemperaturaFahrenheit` para que possa ser convertida e usada com a medida Celsius.

### Variáveis:

-   **private final TemperaturaFahrenheit adaptee**: Instância de `TemperaturaFahrenheit` que será adaptada.

### Construtor:

-   **public TemperaturaAdapter(TemperaturaFahrenheit adaptee)**: Construtor que inicializa a instância `adaptee` com um objeto de `TemperaturaFahrenheit`.

### Métodos:

-   **public double getTemperatureEmCelsius()**: Método que retorna a temperatura em graus Celsius, convertendo o valor de Fahrenheit armazenado na instância `adaptee`.
    -   Fórmula de conversão: `(adaptee.getTemperaturaFahrenheit() - 32) * 5.0 / 9.0`
-   **public void setTemperatureEmCelsius(double temperatureInCelsius)**: Método que define a temperatura em graus Celsius, convertendo o valor para Fahrenheit e armazenando na instância `adaptee`.
    -   Fórmula de conversão: `(temperatureInCelsius * 9.0 / 5.0) + 32`

## TemperaturaFahrenheit.java

A classe `TemperaturaFahrenheit` gerencia a temperatura em graus Fahrenheit.

### Variáveis:

-   **private double temperaturaFahrenheit**: A temperatura armazenada em graus Fahrenheit.

### Construtor:

-   **public TemperaturaFahrenheit(double temperaturaEmFahrenheit)**: Construtor que inicializa a temperatura com o valor fornecido em graus Fahrenheit.

### Métodos:

-   **public double getTemperaturaFahrenheit()**: Método que retorna a temperatura armazenada em graus Fahrenheit.
-   **public void setTemperaturaFahrenheit(double temperaturaFahrenheit)**: Método que define a temperatura armazenada com o valor fornecido em graus Fahrenheit.

## TestAdapter.java

A classe `TestAdapter` busca garantir que as funcionalidades do padrão Adapter para a conversão de temperatura estejam funcionando conforme esperado.

### Variáveis:

-   **private TemperaturaAdapter adapter**: Instância da classe `TemperaturaAdapter` que será testada.
-   **private TemperaturaFahrenheit temperaturaFahrenheit**: Instância da classe `TemperaturaFahrenheit` que será usada pela classe `TemperaturaAdapter`.

### Métodos:

-   **public void setUp()**: Método que inicializa as instâncias de `TemperaturaFahrenheit` e `TemperaturaAdapter` antes de cada teste.
-   **public void testGetTemperatureEmCelsius()**: Método que testa se a conversão de Fahrenheit para Celsius está correta.
    -   **Objetivo**: Verificar se a temperatura em Celsius é calculada corretamente.
    -   **Método**: Chamar `adapter.getTemperatureEmCelsius()` e comparar o resultado com o valor esperado (0.0).
    -   **Resultado Esperado**: A temperatura em Celsius deve ser 0.0 quando a temperatura em Fahrenheit é 32.0.
-   **public void testSetTemperatureEmCelsius()**: Método que testa se a conversão de Celsius para Fahrenheit está correta.
    -   **Objetivo**: Verificar se a temperatura em Fahrenheit é configurada corretamente ao definir a temperatura em Celsius.
    -   **Método**: Chamar `adapter.setTemperatureEmCelsius(100.0)` e verificar o valor de `temperaturaFahrenheit.getTemperaturaFahrenheit()`.
    -   **Resultado Esperado**: A temperatura em Fahrenheit deve ser 212.0 quando a temperatura em Celsius é definida como 100.0.

## Comprovação dos Testes:
![image](https://github.com/JotaVS/AtividadePadraoProjeto/assets/114262723/2f0ea076-da1a-4188-b783-4a527fc9dbc5)
