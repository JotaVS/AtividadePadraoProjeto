# Padrão Proxy - Conta Bancária
O projeto implementa o padrão de projeto Proxy para fornecer uma camada de controle e segurança no sistema, o padrão Proxy é aplicado para gerenciar o acesso à conta bancária real, verificando a autenticação antes de permitir que operações como depósito, retirada e consulta de saldo sejam executadas.

## ContaBancaria.java

A classe `ContaBancaria` representa uma conta bancária que permite operações de depósito, retirada e consulta de saldo.

### Atributos:

-   `private double saldo`: Armazena o saldo atual da conta.

### Construtor:

-   `public ContaBancaria(double saldoInicial)`: Inicializa a conta bancária com um saldo inicial.

### Métodos:

-   `public String depositar(double quantidade, String senha)`: Adiciona a quantidade especificada ao saldo e retorna uma mensagem de confirmação.
-   `public String retirar(double quantidade, String senha)`: Deduz a quantidade especificada do saldo se houver fundos suficientes e retorna uma mensagem de confirmação ou de saldo insuficiente.
-   `public double getSaldo()`: Retorna o saldo atual da conta.

## ContaBancariaProxy.java

A classe `ContaBancariaProxy` é um proxy para a `ContaBancaria`, que adiciona uma camada de segurança verificando a senha antes de permitir operações na conta bancária.

### Atributos:

-   `private ContaBancaria contaBancaria`: Instância da conta bancária real.
-   `private String senhaCorreta`: Senha correta para acessar a conta.

### Construtor:

-   `public ContaBancariaProxy(double saldoInicial, String senhaCorreta)`: Inicializa o proxy com o saldo inicial e a senha correta.

### Métodos:

-   `public String depositar(double quantidade, String senha)`: Verifica a senha e, se correta, delega a operação de depósito para a conta bancária real, retornando uma mensagem de confirmação ou de acesso negado.
-   `public String retirar(double quantidade, String senha)`: Verifica a senha e, se correta, delega a operação de retirada para a conta bancária real, retornando uma mensagem de confirmação ou de acesso negado.
-   `public double getSaldo()`: Retorna o saldo atual da conta bancária real.

## IContaBancaria.java

A interface `IContaBancaria` define os métodos que devem ser implementados por qualquer classe que represente uma conta bancária.

### Métodos:

-   `String depositar(double quantidade, String senha)`: Define o método para depositar uma quantidade na conta.
-   `String retirar(double quantidade, String senha)`: Define o método para retirar uma quantidade da conta.
-   `double getSaldo()`: Define o método para obter o saldo atual da conta.

## TestProxy.java
A classe `TestProxy` busca testas as funcionalidades do projeto, verificando se o uso do padrão Proxy está funcionando de acordo com o esperado.
#### `testeDepositarSenhaCorreta()`

-   **Objetivo:** Verificar se é possível depositar na conta bancária utilizando a senha correta.
-   **Método:** Cria uma instância de `ContaBancariaProxy` com um saldo inicial de 1000.0 e senha "123". Chama o método `depositar(200.0, "123")` e verifica se a mensagem de confirmação é retornada corretamente. Em seguida, verifica se o saldo foi atualizado corretamente para 1200.0.
-   **Resultado Esperado:** O depósito deve ser aceito e refletir o saldo atualizado na conta bancária.

#### `testeDepositarSenhaIncorreta()`

-   **Objetivo:** Verificar o comportamento ao tentar depositar com uma senha incorreta.
-   **Método:** Cria uma instância de `ContaBancariaProxy` com um saldo inicial de 1000.0 e senha "123". Chama o método `depositar(200.0, "456")` e verifica se é retornada a mensagem "Acesso negado. Senha Incorreta.". Verifica também se o saldo permanece inalterado em 1000.0.
-   **Resultado Esperado:** Deve ocorrer uma negação de acesso devido à senha incorreta e o saldo não deve ser alterado.

#### `testeRetirarSenhaCorreta()`

-   **Objetivo:** Verificar se é possível realizar uma retirada na conta bancária utilizando a senha correta.
-   **Método:** Cria uma instância de `ContaBancariaProxy` com um saldo inicial de 1000.0 e senha "123". Chama o método `retirar(200.0, "123")` e verifica se a mensagem de confirmação é retornada corretamente. Em seguida, verifica se o saldo foi atualizado corretamente para 800.0.
-   **Resultado Esperado:** A retirada deve ser aceita e refletir o saldo atualizado na conta bancária.

#### `testeRetirarSenhaIncorreta()`

-   **Objetivo:** Verificar o comportamento ao tentar realizar uma retirada com uma senha incorreta.
-   **Método:** Cria uma instância de `ContaBancariaProxy` com um saldo inicial de 1000.0 e senha "123". Chama o método `retirar(200.0, "456")` e verifica se é retornada a mensagem "Acesso negado. Senha Incorreta.". Verifica também se o saldo permanece inalterado em 1000.0.
-   **Resultado Esperado:** Deve ocorrer uma negação de acesso devido à senha incorreta e o saldo não deve ser alterado.

#### `testeRetirarSaldoInsuficiente()`

-   **Objetivo:** Verificar o comportamento ao tentar realizar uma retirada com saldo insuficiente.
-   **Método:** Cria uma instância de `ContaBancariaProxy` com um saldo inicial de 1000.0 e senha "123". Chama o método `retirar(1200.0, "123")` e verifica se é retornada a mensagem "Saldo Insuficiente.". Verifica também se o saldo permanece inalterado em 1000.0.
-   **Resultado Esperado:** Deve ser indicado que o saldo é insuficiente para a retirada solicitada e o saldo não deve ser alterado.

#### `testGetSaldo()`

-   **Objetivo:** Verificar se o método `getSaldo()` retorna o saldo correto da conta bancária.
-   **Método:** Cria uma instância de `ContaBancariaProxy` com um saldo inicial de 1000.0 e senha "123". Chama o método `getSaldo()` e verifica se o saldo retornado é igual a 1000.0.
-   **Resultado Esperado:** O saldo retornado deve corresponder ao saldo atual da conta bancária.

## Comprovação dos Testes
![image](https://github.com/JotaVS/AtividadePadraoProjeto/assets/114262723/27e89117-6f03-4542-ba0c-01d794174fdd)

