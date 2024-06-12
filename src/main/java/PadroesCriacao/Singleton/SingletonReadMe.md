# Padrão Singleton - Player de Musica
## PlayerMusica.java
  A classe PlayerMusica busca gerenciar qual música está tocando no programa.  
  É utilizado o padrão Singleton para que seja garantido que apenas uma instância dessa classe seja criada enquanto o programa esteja sendo executado.

### Variáveis:
  - private static PlayerMusica instance: A única instância da classe PlayerMusica.
  - private String musicaAtual: A música atualmente sendo reproduzida.

### Métodos:
  - public static PlayerMusica getInstance(): Método estático que retorna a única instância da classe PlayerMusica. Se a instância ainda não foi criada, cria uma nova.
  - public void setMusicaAtual(String musica): Método que define a música atual a ser reproduzida, recebe uma string “musica” e passa o valor para a variável “musicaAtual”
  - public String getMusicaAtual(): Método que retorna a música atualmente sendo reproduzida, buscando seu nome na variável “musicaAtual” e retornando em formato de string.

## TestSingleton.java
  A classe TestSingleton testa a implementação da classe PlayerMusica para garantir que siga o padrão Singleton e que as funcionalidades principais estão funcionando conforme esperado.

### deveObterInstanciaUnicaDoPlayer(): 
Objetivo: Verificar se o método getInstance da classe PlayerMusica retorna sempre a mesma instância.
Método: Chamar PlayerMusica.getInstance() duas vezes e comparar as instâncias retornadas.
Resultado Esperado: As duas instâncias obtidas devem ser a mesma (singleton).

### deveTocarMusicaAtual():
  - Objetivo: Verificar se é possível configurar e recuperar a música atual no player.
  - Método: Chamar PlayerMusica.getInstance(), definir uma música usando setMusicaAtual, e verificar se a música atual é a mesma usando getMusicaAtual.
  - Resultado Esperado: A música configurada deve ser recuperada corretamente.

