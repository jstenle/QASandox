# Projeto de Teste de Login

## Descrição
Este projeto foi criado para demonstrar a automação de testes de ponta a ponta (E2E) utilizando a combinação de **Cucumber** e **Selenium**. O foco principal é validar a funcionalidade de login em uma aplicação web, garantindo que os usuários possam acessar com credenciais válidas.

## Requisitos
- Java JDK (versão 17 ou superior)
- Maven
- Dependências Cucumber, Selenium

## Configuração do Projeto
1. **Clone o Repositório**:
   ```bash
   git clone https://github.com/jstenle/QASandox/cucumber-selenium-test.git
   cd cucumber-selenium-test

2. **Instale as Dependências com Maven**:
   ```bash
   mvn install

## Execução dos Testes

1. **Executando Testes com JUnit**:
- Para executar todos os testes automatizados, você pode usar o seguinte comando Maven:
   ```bash
   mvn test

2. **Executando Testes Individualmente no Eclipse**:
- Abra o Eclipse e importe o projeto existente.
- Para executar testes específicos, clique com o botão direito na classe de teste desejada ou no arquivo TestRunner.java e escolha Run As > JUnit Test.

## Funcionalidade dos Testes
- O projeto contém testes que validam a funcionalidade de login, incluindo cenário de sucesso.
- Os testes asseguram que os usuários sejam redirecionados para a seção correta após o login e validam as mensagens apresentadas ao usuário.

## Estrutura dos Testes
- pageObjects: Contém as classes que representam as páginas da aplicação.
- stepDefinitions: Contém os métodos que correspondem a cada passo definido nos arquivos de feature.
- utils: Contém classes utilitárias, como o WebDriverManager, que gerencia a inicialização e o encerramento do WebDriver.

## Reporte
- Verifique o reporte gerado em: cucumber-selenium-test/target/surefire-reports

## Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para fazer fork do repositório e enviar pull requests com melhorias, correções ou novas funcionalidades.

## Licença
Este projeto não tem uma licença definida. Sinta-se livre para usar e modificar conforme necessário.