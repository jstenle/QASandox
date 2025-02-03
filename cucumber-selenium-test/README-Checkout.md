# Projeto de Teste de Checkout E-commerce

## Descrição
Este projeto contém testes automatizados para o fluxo de checkout em um e-commerce de exemplo, utilizando **Cucumber** para a definição de cenários e **Selenium** para a automação do navegador. O objetivo é validar a adição de produtos ao carrinho, o preenchimento de informações de pagamento e a finalização da compra.

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
- O projeto contém testes que validam a funcionalidade de checkout, incluindo cenário de sucesso.
- Os testes asseguram que os usuários possam adicionar produtos ao carrinho, preencher informações de pagamento e ver uma mensagem de confirmação após a compra.

## Estrutura dos Testes
- pageObjects: Contém classes que representam as páginas da aplicação.
- stepDefinitions: Contém os métodos que correspondem a cada passo definido nos arquivos de feature.
- utils: Contém classes utilitárias, como o WebDriverManager, que gerencia a inicialização e o encerramento do WebDriver.

## Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para fazer fork do repositório e enviar pull requests com melhorias, correções ou novas funcionalidades.

## Licença
Este projeto não tem uma licença definida. Sinta-se livre para usar e modificar conforme necessário.