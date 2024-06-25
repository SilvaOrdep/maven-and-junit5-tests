# Maven and JUnit5 Test Project

Este repositório foi criado como um teste de aplicação e estudo sobre o Maven e o JUnit5. O projeto é um simples exemplo que demonstra como utilizar o Maven para gerenciar dependências e o ciclo de vida do build, bem como a aplicação de testes unitários com o JUnit5.

## Sobre o Maven

O Maven utiliza um arquivo de configuração chamado `pom.xml` (Project Object Model), onde são especificadas as dependências do projeto, plugins e outras configurações.

### Comandos Maven Utilizados

Aqui estão alguns comandos Maven que foram utilizados durante este projeto de teste:

- **Criar projeto:**
  ```sh
  mvn archetype:generate -DgroupId=one.digitalinovation -DartifactId=quick-start-maven -Darchetype=maven-archetype-quickstart -DinteractiveMode=false
