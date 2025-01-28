# Testes de API com Rest Assured

## Descrição

Este projeto contém testes automatizados para validar os endpoints da API `reqres.in` usando a biblioteca Rest Assured em Java. O foco é garantir a funcionalidade dos métodos HTTP (GET, POST, PUT, DELETE) e validar as respostas, incluindo códigos de status, headers e corpo da resposta.

## Requisitos

- Java JDK (versão 17 ou superior)
- Maven
- Biblioteca Rest Assured
- JUnit

## Execução dos Testes

1. Abra o Eclipse e importe o projeto Maven.
2. Certifique-se de que todas as dependências estão configuradas corretamente no `pom.xml`.
3. Para executar todos os testes:
   - Clique com o botão direito no projeto e selecione `Run As` > `Maven test`.
4. Para executar testes individuais:
   - Clique com o botão direito na classe de teste ou método desejado e selecione `Run As` > `JUnit Test`.

## Validações Realizadas

- Verificação dos códigos de status HTTP.
- Validação dos headers de resposta.
- Validação do corpo da resposta para as operações de GET, POST, PUT e DELETE.

## Reporte

- Verifique o reporte gerado em: restAssuredTest/target/surefire-reports/TEST-com.apiTest.restAssuredTest.AppTest.xml