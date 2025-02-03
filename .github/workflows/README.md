# CI Pipeline

Este repositório QASandbox contém um pipeline de Integração Contínua (CI) configurado para executar uma série de testes automatizados, incluindo testes de API, testes end-to-end (E2E) e testes mobile utilizando Appium em um emulador Android. O pipeline foi desenvolvido utilizando GitHub Actions.

## Descrição do Pipeline

O pipeline é configurado para ser executado em eventos de `push` e `pull_request` na branch `main`. As etapas do pipeline incluem:

1. **Checkout do Código**:
   - A primeira etapa do pipeline faz o checkout do código fonte do repositório.

2. **Instalação do Java**:
   - Instala o Java OpenJDK 11, que é necessário para compilar e executar testes em diversas ferramentas.

3. **Execução de Testes de API**:
   - Realiza a execução dos testes de API utilizando o Maven.

4. **Instalação do Chrome e ChromeDriver**:
   - Instala o Google Chrome e o ChromeDriver, que são necessários para os testes E2E.

5. **Execução de Testes E2E**:
   - Executa testes end-to-end utilizando Selenium e o Chrome. Esta etapa enfrentou falhas devido a um erro no Chrome, que precisa ser analisado e corrigido.

6. **Instalação do Node.js**:
   - Instala o Node.js, que é necessário para executar o Appium.

7. **Instalação do Appium**:
   - Instala o Appium globalmente, que é o framework utilizado para testes mobile.

8. **Início do Appium**:
   - Inicia o servidor Appium em segundo plano.

9. **Instalação do UiAutomator2**:
   - Instala o driver UiAutomator2, que é utilizado para interagir com dispositivos Android.

10. **Instalação do Android SDK**:
    - Instala o SDK do Android, que é necessário para criar e gerenciar emuladores.

11. **Criação do Emulador Android**:
    - Tenta criar um emulador Android com a versão 15 e nome `emulator-5554`. Esta etapa falhou e requer análise adicional.

12. **Início do Emulador Android**:
    - Inicia o emulador Android em segundo plano para que os testes mobile possam ser executados.

13. **Execução dos Testes Mobile**:
    - Executa os testes mobile em dois projetos distintos utilizando Appium.

## Resultados da Execução

- **Instalação do Java**: SUCESSO
- **Execução dos Testes de API**: SUCESSO
- **Instalação do Chrome e ChromeDriver**: SUCESSO
- **Execução dos Testes E2E**: FALHA (Erro no Chrome. Necessita de análise.)
- **Instalação do Node.js**: SUCESSO
- **Instalação do Appium**: SUCESSO
- **Instalação do Android SDK**: SUCESSO
- **Criação do Emulador**: FALHA (Necessita de análise adicional.)

Apesar das falhas, o fluxo do YML segue o que é necessário para o funcionamento lógico dos testes.