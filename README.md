# QASandbox

## Contextualização

O objetivo deste repositório é estudar e avaliar algumas ferramentas de automação utilizadas em testes de software. Aqui, você encontrará diversos projetos que abrangem diferentes aspectos da automação de testes, desde testes de carga até testes em aplicativos móveis.

## Projetos no Repositório

### 1. **load-test/jmeter-tests**
- **Descrição**: Este projeto utiliza o **JMeter** para avaliar o desempenho da API JSONPlaceholder, simulando a carga de 500 usuários simultâneos por um período de 5 minutos.
- **Relatório**: Um relatório de teste de carga pode ser encontrado na pasta do projeto após a execução dos testes.

### 2. **restAssuredTest**
- **Descrição**: Este projeto utiliza o **Rest Assured** em **Java** para validar os endpoints da API `reqres.in`.
- **Relatório**: O relatório de execução está disponível em `/target/surefire-reports`.

### 3. **cucumber-selenium-test**
- **Descrição**: Este projeto utiliza **Cucumber** e **Selenium** para executar dois testes E2E: um para o login e outro para o checkout.
- **Relatório**: O relatório de execução está disponível em `/target/surefire-reports`.

### 4. **MyAppiumProject-SauceLabs**
- **Descrição**: Este projeto utiliza **Appium** para realizar testes em Android, validando funcionalidades do aplicativo SauceLabs, incluindo o fluxo de login e a navegação no aplicativo.
- **Relatório**: O relatório de execução está disponível em `/target/surefire-reports`.

### 5. **MyAppiumProject-OnlineForm**
- **Descrição**: Este projeto também utiliza **Appium** para testes em Android, focando na validação das funcionalidades de preenchimento de um formulário online usando o Chrome. Inclui a inserção do nome e a verificação da mensagem de agradecimento após o envio das respostas.
- **Relatório**: O relatório de execução está disponível em `/target/surefire-reports`.

## Configuração do Pipeline

Há um arquivo `.yml` configurado em `/QASandbox/.github/workflows`, que automatiza a execução dos testes mencionados acima e suas respectivas dependências.

## Informações Adicionais

Em cada projeto, você encontrará um arquivo README com mais informações sobre a configuração e a execução dos testes. 

Além disso, é possível visualizar as execuções dos testes rodando localmente em minha máquina, consultando a pasta `ScreenRecordFiles`, onde os vídeos das execuções estão armazenados.

Obrigado!!