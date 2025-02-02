# MyAppiumProject

Este projeto é uma automação de testes para o aplicativo móvel **Sauce Labs Mobile App** utilizando **Appium** e **JUnit**. O objetivo é validar as funcionalidades do aplicativo, incluindo o fluxo de login e a navegação no aplicativo.

## Pré-Requisitos

Certifique-se de que você possui os seguintes pré-requisitos antes de configurar o projeto:

- **Java JDK** (8 ou superior)
- **Maven** (3.6.1 ou superior)
- **Node.js** e **npm** (para instalar o Appium)
- **Appium Server** (instalado via npm)
- **Android Studio** com um emulador ou dispositivo Android configurado

## Instalação

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/jstenle/QASandox/MyAppiumProject.git
   cd MyAppiumProject

2. **Instale o Appium globalmente (se não estiver instalado):**
   ```bash
   npm install -g appium

3. **Configuração do Ambiente**
- Configurar JAVA_HOME
- Certifique-se de que a variável de ambiente JAVA_HOME está configurada corretamente. Você pode configurá-lo em seu perfil de shell:
   ```bash
   export JAVA_HOME=$(/usr/libexec/java_home)

- Adicione também ANDROID_HOME e ANDROID_SDK_ROOT:
   ```bash
   export ANDROID_HOME=$HOME/Library/Android/sdk
   export ANDROID_SDK_ROOT=$ANDROID_HOME
   export PATH=$PATH:$ANDROID_HOME/platform-tools

## Executando os Testes
1. **Inicie o Appium Server:**
   ```bash
   appium

2. **Executando Testes Individualmente no Eclipse**:
- Abra o Eclipse e importe o projeto existente.
- Para executar testes específicos, clique com o botão direito na classe de teste desejada ou no arquivo LoginTest.java e escolha Run As > Maven Test.

3. **Os resultados dos testes serão gerados no diretório target/surefire-reports.**

## Funcionalidade dos Testes
- O projeto contém testes que validam a funcionalidade de login.
- Os testes asseguram que os usuários sejam redirecionados para a seção correta após o login e validam as mensagens apresentadas ao usuário.

## Estrutura dos Testes
- pageObjects: Contém as classes que representam as páginas da aplicação.
- utils: Contém classes utilitárias, como o DriverManager, que gerencia a inicialização e o encerramento do AndroidDriver.

## Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para fazer fork do repositório e enviar pull requests com melhorias, correções ou novas funcionalidades.

## Licença
Este projeto não tem uma licença definida. Sinta-se livre para usar e modificar conforme necessário.