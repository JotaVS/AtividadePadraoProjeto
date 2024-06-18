# Padrão Strategy - Processador de Pagamentos
## Introdução
Este projeto implementa o padrão de design Strategy para modelar diferentes métodos de pagamento. Neste caso, implementamos três estratégias de pagamento: cartão de crédito, PayPal e transferência bancária.

## Classes
### PagamentoStrategy.java
A interface `PagamentoStrategy` define o método que todas as estratégias de pagamento devem implementar.

#### Métodos:
-   **String pagar(double valor)**: Método para realizar o pagamento, retorna uma string indicando o sucesso do pagamento.

### Credito.java
A classe `Credito` implementa a estratégia de pagamento por cartão de crédito.

#### Variáveis:
-   **private String numeroCartao**: Número do cartão de crédito.
-   **private String nomeCartao**: Nome do titular do cartão.
-   **private String cvv**: Código CVV do cartão.
-   **private String dataValidade**: Data de validade do cartão.

#### Construtor:
-   **public Credito(String numeroCartao, String nomeCartao, String cvv, String dataValidade)**: Inicializa os dados do cartão de crédito.

#### Métodos:
-   **public String pagar(double valor)**: Realiza o pagamento e retorna uma string indicando o valor pago com cartão de crédito.

### PayPal.java
A classe `PayPal` implementa a estratégia de pagamento pelo PayPal.

#### Variáveis:
-   **private String email**: Email do usuário do PayPal.
-   **private String senha**: Senha do usuário do PayPal.

#### Construtor:
-   **public PayPal(String email, String senha)**: Inicializa os dados do PayPal.

#### Métodos:
-   **public String pagar(double valor)**: Realiza o pagamento e retorna uma string indicando o valor pago com PayPal.

### TransferenciaBancaria.java
A classe `TransferenciaBancaria` implementa a estratégia de pagamento por transferência bancária.

#### Variáveis:
-   **private String numeroConta**: Número da conta bancária.
-   **private String codigoBanco**: Código do banco.

#### Construtor:
-   **public TransferenciaBancaria(String numeroConta, String codigoBanco)**: Inicializa os dados da conta bancária.

#### Métodos:
-   **public String pagar(double valor)**: Realiza o pagamento e retorna uma string indicando o valor pago por transferência bancária.

### ProcessadorPagamento.java
A classe `ProcessadorPagamento` utiliza uma instância de `PagamentoStrategy` para processar o pagamento.

#### Variáveis:
-   **private PagamentoStrategy pagamentoStrategy**: A estratégia de pagamento atual.

#### Métodos:
-   **public void setPagamentoStrategy(PagamentoStrategy pagamentoStrategy)**: Define a estratégia de pagamento.
-   **public String processarPagamento(double valor)**: Processa o pagamento utilizando a estratégia definida. Lança uma exceção se a estratégia de pagamento não estiver definida.

### TestStrategy.java

O `TestStrategy.java` contém testes unitários para validar o comportamento do processamento de pagamentos utilizando diferentes estratégias (`Credito`, `PayPal`, `TransferenciaBancaria`) implementadas com o padrão Strategy.

#### Métodos de Teste:

#### `public void metodoCartaoCredito()`

-   **Objetivo:** Verificar o processamento de pagamento usando Cartão de Crédito.
    
-   **Método:**
    
    -   Criar uma instância de `ProcessadorPagamento`.
    -   Configurar a estratégia de pagamento como Cartão de Crédito com os detalhes específicos (número do cartão, nome, código de segurança, data de validade).
    -   Chamar `processarPagamento` com o valor de 100.0.
    -   Verificar se o resultado indica pagamento bem-sucedido usando Cartão de Crédito.
-   **Resultado Esperado:**
    
    -   O resultado deve ser `"Pago 100.0 usando Cartão de Crédito."`.

#### `public void metodoPayPal()`

-   **Objetivo:** Verificar o processamento de pagamento usando PayPal.
    
-   **Método:**
    
    -   Criar uma instância de `ProcessadorPagamento`.
    -   Configurar a estratégia de pagamento como PayPal com os detalhes específicos (e-mail e senha).
    -   Chamar `processarPagamento` com o valor de 200.0.
    -   Verificar se o resultado indica pagamento bem-sucedido usando PayPal.
-   **Resultado Esperado:**
    
    -   O resultado deve ser `"Pago 200.0 usando PayPal."`.

#### `public void metodoTransferenciaBancaria()`

-   **Objetivo:** Verificar o processamento de pagamento usando Transferência Bancária.
    
-   **Método:**
    
    -   Criar uma instância de `ProcessadorPagamento`.
    -   Configurar a estratégia de pagamento como Transferência Bancária com os detalhes específicos (número da conta e código do banco).
    -   Chamar `processarPagamento` com o valor de 300.0.
    -   Verificar se o resultado indica pagamento bem-sucedido por Transferência Bancária.
-   **Resultado Esperado:**
    
    -   O resultado deve ser `"Pago 300.0 por Transferência Bancária."`.

#### `public void metodoInvalido()`

-   **Objetivo:** Verificar o tratamento de método de pagamento inválido.
    
-   **Método:**
    
    -   Criar uma instância de `ProcessadorPagamento`.
    -   Chamar `processarPagamento` sem definir uma estratégia de pagamento válida.
    -   Verificar se uma exceção do tipo `IllegalStateException` é lançada.
    -   Verificar se a mensagem de exceção é `"Metodo de pagamento invalido."`.
-   **Resultado Esperado:**
    
    -   Deve ser lançada uma exceção `IllegalStateException` com a mensagem `"Metodo de pagamento invalido."`.
