# Maven and JUnit5 Test Project

Este repositório foi criado como um teste de aplicação e estudo sobre o Maven e o JUnit5. O projeto é um simples exemplo que demonstra como utilizar o Maven para gerenciar dependências e o ciclo de vida do build, bem como a aplicação de testes unitários com o JUnit5.

## Sobre o Maven

O Maven utiliza um arquivo de configuração chamado `pom.xml` (Project Object Model), onde são especificadas as dependências do projeto, plugins e outras configurações.

### Comandos Maven Utilizados

Aqui estão alguns comandos Maven que foram utilizados durante este projeto de teste:

- **Criar projeto:**
  ```sh
  mvn archetype:generate -DgroupId=one.digitalinovation -DartifactId=quick-start-maven -Darchetype=maven-archetype-quickstart -DinteractiveMode=false

- **Compilar projeto:**
  ```sh
  mvn compile
  //Compila as classes fontes do projeto.

- **Testar projeto:**
  ```sh
  mvn test

- **Empacotar/Criar JAR:**
  ```sh
  mvn package

- **Apagar o diretório de trabalho/target:**
  ```sh
  mvn clean

## Sobre o JUnit5

JUnit5 é um framework para a criação e execução de testes unitários em Java. 

### Assertions no JUnit5
O JUnit5 oferece uma variedade de assertions que podem ser usadas para validar o comportamento do código(exemplos):

- `assertEquals(expected, actual)` - Verifica se os valores esperados e reais são iguais.
- `assertTrue(condition)` - Verifica se a condição é verdadeira.
- `assertFalse(condition)` - Verifica se a condição é falsa.
- `assertThrows(expectedType, executable)` - Verifica se o código lançado lança uma exceção do tipo esperado.

