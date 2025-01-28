# Relatório de Teste de Carga – API JSONPlaceholder

## Introdução

Este relatório apresenta os resultados do teste de carga realizado na API pública JSONPlaceholder. O objetivo do teste foi avaliar a capacidade de resposta da API sob carga significativa.

## Objetivo do Teste

Simular 500 usuários simultâneos acessando o endpoint `/posts` da API JSONPlaceholder durante um período de 5 minutos, com o intuito de identificar o desempenho da API em condições de carga máxima.

## Configuração do Teste

- **Total de Usuários Simulados**: 500
- **Duração do Teste**: 5 minutos
- **Endpoint Testado**: `https://jsonplaceholder.typicode.com/posts`
- **Tipo de Requisição**: POST

## Resultados

As métricas coletadas durante o teste são as seguintes:

- **Total de Requisições**: 500
- **Tempo Médio de Resposta**: 588 ms
- **Taxa de Erro**: 0%
- **Throughput**: 1.7 requisições por segundo

### Análise dos Resultados

- **Total de Requisições**: O teste simula 500 requisições, o que é suficiente para avaliar como a API se comporta sob carga.
  
- **Tempo Médio de Resposta (588 ms)**: Este valor indica que, em média, a API respondeu em 588 ms. Esse tempo é um bom indicador de desempenho, pois geralmente um tempo de resposta abaixo de 1 segundo é considerado aceitável para a maioria das aplicações. Contudo, melhorias podem ser consideradas se o objetivo for uma experiência de usuário ainda mais ágil.

- **Taxa de Erro (0%)**: Esta métrica mostra que todas as requisições foram bem-sucedidas e a API não apresentou erros durante o teste. Isso é um sinal positivo sobre a estabilidade da API em condições de carga.

- **Throughput (1.7 requisições por segundo)**: Esse resultado indica que a API foi capaz de processar 1.7 requisições a cada segundo durante o teste. Dependendo do padrão de uso esperado, pode ser necessário otimizar a API para suportar um volume maior de requisições quando o número de usuários aumentar ainda mais.

## Identificação de Gargalos
Durante a execução do teste, não foram observados sinais claros de gargalos. Com um tempo médio de resposta de 588 ms e uma taxa de erro de 0%, a API respondeu de forma adequada sob a carga de 500 usuários simultâneos. No entanto, é importante ressaltar que o throughput (1.7 requisições por segundo) pode ser um indicador que, em cenários de carga muito superior, a API pode precisar de otimizações para lidar com um maior volume de requisições.

Recomenda-se que, em testes futuros, novos cenários de carga sejam explorados, incluindo uma quantidade maior de usuários, para melhor avaliar o comportamento da API sob condições de estresse.

## Conclusão
Os resultados do teste de carga indicam que a API JSONPlaceholder está, por enquanto, em boas condições para lidar com 500 usuários simultâneos sem apresentar erros e com um tempo de resposta aceitável.