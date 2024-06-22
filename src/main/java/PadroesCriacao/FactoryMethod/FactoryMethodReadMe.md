
# Padrão Factory Method - Criação de Veículos
## VeiculoFactory.java
A classe `VeiculoFactory` é uma fábrica de veículos que cria instâncias de diferentes tipos de veículos com base em um tipo especificado utilizando o padrão de projeto Factory.

### Método:
-   `public static Veiculo criarVeiculo(String tipoVeiculo)`: Cria um veículo com base no tipo fornecido como argumento. Aceita uma string que especifica o tipo de veículo a ser criado e retorna uma instância do veículo correspondente. Os valores aceitos são: “carro”, “moto” e “bicicleta”. Retorna uma exceção caso use algum valor não reconhecível como argumento.

## Veiculo.java
A interface `Veiculo` é responsável por definir os métodos padrões que todos os veículos devem ter.

### Métodos:
-   `String acelerar()`: Descreve a ação de acelerar, retornando uma string.
-   `String frear()`: Descreve a ação de frear, retornando uma string.
-   `String dirigir()`: Descreve a ação de dirigir, retornando uma string.

## Bicicleta.java
A classe `Bicicleta` implementa a interface `Veiculo` e representa uma bicicleta. Implementa os métodos para descrever as ações de acelerar, frear e dirigir uma bicicleta.

### Métodos:
-   `String acelerar()`: Retorna a string "Pedalando a bicicleta...".
-   `String frear()`: Retorna a string "Freando a bicicleta...".
-   `String dirigir()`: Retorna a string "Andando de bicicleta...".

## Carro.java
A classe `Carro` implementa a interface `Veiculo` e representa um carro. Implementa os métodos para descrever as ações de acelerar, frear e dirigir um carro.

### Métodos:
-   `String acelerar()`: Retorna a string "Acelerando o carro...".
-   `String frear()`: Retorna a string "Freando o carro...".
-   `String dirigir()`: Retorna a string "Dirigindo o carro...".

## Moto.java
A classe `Moto` implementa a interface `Veiculo` e representa uma moto. Implementa os métodos para descrever as ações de acelerar, frear e dirigir uma moto.

### Métodos:
-   `String acelerar()`: Retorna a string "Acelerando a moto...".
-   `String frear()`: Retorna a string "Freando a moto...".
-   `String dirigir()`: Retorna a string "Dirigindo a moto...".


## TestFactoryMethod.java
O TestFactoryMethod contém testes para validar a implementação do padrão Factory Method na classe VeiculoFactory. Os testes asseguram que diferentes tipos de veículos possam ser criados corretamente e que seus comportamentos esperados sejam verificados adequadamente.

### testCriacaoCarro()
-   **Objetivo:** Verificar se um carro pode ser criado corretamente usando a VeiculoFactory.
-   **Método:** Invoca o método `criarVeiculo("carro")` da VeiculoFactory e verifica se o objeto retornado não é nulo.
-   **Resultado Esperado:** O veículo do tipo carro não deve ser nulo após a criação.

### testCarroAcelerar()
-   **Objetivo:** Verificar se um carro acelera corretamente.
-   **Método:** Cria um veículo do tipo "carro" usando VeiculoFactory e verifica se a mensagem retornada ao acelerar é "Acelerando o carro...".
-   **Resultado Esperado:** A mensagem de aceleração do carro deve ser corretamente retornada.

### testCarroFrear()
-   **Objetivo:** Verificar se um carro freia corretamente.
-   **Método:** Cria um veículo do tipo "carro" usando VeiculoFactory e verifica se a mensagem retornada ao frear é "Freando o carro...".
-   **Resultado Esperado:** A mensagem de frenagem do carro deve ser corretamente retornada.

### testCarroDirigir()
-   **Objetivo:** Verificar se um carro pode ser dirigido corretamente.
-   **Método:** Cria um veículo do tipo "carro" usando VeiculoFactory e verifica se a mensagem retornada ao dirigir é "Dirigindo o carro...".
-   **Resultado Esperado:** A mensagem de direção do carro deve ser corretamente retornada.

### testCriacaoMoto()
-   **Objetivo:** Verificar se uma moto pode ser criada corretamente usando a VeiculoFactory.
-   **Método:** Invoca o método `criarVeiculo("moto")` da VeiculoFactory e verifica se o objeto retornado não é nulo.
-   **Resultado Esperado:** O veículo do tipo moto não deve ser nulo após a criação.

### testMotoAcelerar()
-   **Objetivo:** Verificar se uma moto acelera corretamente.
-   **Método:** Cria um veículo do tipo "moto" usando VeiculoFactory e verifica se a mensagem retornada ao acelerar é "Acelerando a moto...".
-   **Resultado Esperado:** A mensagem de aceleração da moto deve ser corretamente retornada.

### testMotoFrear()
-   **Objetivo:** Verificar se uma moto freia corretamente.
-   **Método:** Cria um veículo do tipo "moto" usando VeiculoFactory e verifica se a mensagem retornada ao frear é "Freando a moto...".
-   **Resultado Esperado:** A mensagem de frenagem da moto deve ser corretamente retornada.

### testMotoDirigir()
-   **Objetivo:** Verificar se uma moto pode ser dirigida corretamente.
-   **Método:** Cria um veículo do tipo "moto" usando VeiculoFactory e verifica se a mensagem retornada ao dirigir é "Dirigindo a moto...".
-   **Resultado Esperado:** A mensagem de direção da moto deve ser corretamente retornada.

### testCriacaoBicicleta()
-   **Objetivo:** Verificar se uma bicicleta pode ser criada corretamente usando a VeiculoFactory.
-   **Método:** Invoca o método `criarVeiculo("bicicleta")` da VeiculoFactory e verifica se o objeto retornado não é nulo.
-   **Resultado Esperado:** O veículo do tipo bicicleta não deve ser nulo após a criação.

### testBicicletaAcelerar()
-   **Objetivo:** Verificar se uma bicicleta acelera corretamente.
-   **Método:** Cria um veículo do tipo "bicicleta" usando VeiculoFactory e verifica se a mensagem retornada ao acelerar é "Pedalando a bicicleta...".
-   **Resultado Esperado:** A mensagem de aceleração da bicicleta deve ser corretamente retornada.

### testBicicletaFrear()
-   **Objetivo:** Verificar se uma bicicleta freia corretamente.
-   **Método:** Cria um veículo do tipo "bicicleta" usando VeiculoFactory e verifica se a mensagem retornada ao frear é "Freando a bicicleta...".
-   **Resultado Esperado:** A mensagem de frenagem da bicicleta deve ser corretamente retornada.

### testBicicletaDirigir()
-   **Objetivo:** Verificar se uma bicicleta pode ser dirigida corretamente.
-   **Método:** Cria um veículo do tipo "bicicleta" usando VeiculoFactory e verifica se a mensagem retornada ao dirigir é "Andando de bicicleta...".
-   **Resultado Esperado:** A mensagem de direção da bicicleta deve ser corretamente retornada.

### testVeiculoInvalido()
-   **Objetivo:** Verificar se uma exceção é lançada ao tentar criar um veículo com um tipo inválido.
-   **Método:** Tenta criar um veículo usando `criarVeiculo("avião")` da VeiculoFactory e verifica se uma exceção do tipo IllegalArgumentException é lançada com a mensagem "Tipo de veículo inválido!".
-   **Resultado Esperado:** Deve lançar uma exceção com a mensagem correta quando o tipo de veículo não é reconhecido pela fábrica.

## Comprovação de Teste
![image](https://github.com/JotaVS/AtividadePadraoProjeto/assets/114262723/b8871108-f65c-4971-afd8-8c2d5d4ad953)
