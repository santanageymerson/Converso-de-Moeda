💱 Conversor de Moedas - Desafio Alura
📌 Descrição do Projeto

Este projeto foi desenvolvido por geymerson como parte do desafio da formação Java Orientado a Objetos da Alura.
O objetivo é criar um conversor de moedas que:

Interaja com o usuário via console.

Ofereça no mínimo 6 opções de conversões.

Obtenha as cotações em tempo real através de uma API externa.

Apresente o valor convertido e finalize o programa.

O desafio simula um caso real de uso, onde é necessário trabalhar com APIs REST, JSON, e a biblioteca GSON para desserializar os dados recebidos.

🎯 Objetivo

Construir um programa em Java capaz de:

Apresentar um menu com opções de conversão de moedas.

Solicitar ao usuário o valor a ser convertido.

Consultar a cotação em tempo real utilizando a API ExchangeRate API.

Exibir o resultado da conversão no console.

Encerrar o programa após a conversão.

🛠 Tecnologias Utilizadas

Java 17+

IntelliJ IDEA (IDE recomendada)

API ExchangeRate

Biblioteca GSON para conversão de JSON

Trello para organização de tarefas

Git/GitHub para versionamento de código

📋 Requisitos

Antes de executar o projeto, é necessário:

Ter o Java instalado e configurado.

Criar uma conta na ExchangeRate API para obter a chave de acesso (API Key).

Ter acesso à internet para consultar as cotações em tempo real.

🚀 Como Executar

Clone o repositório:

git clone https://github.com/seu-usuario/conversor-moedas.git


Abra o projeto no IntelliJ IDEA.

Adicione a biblioteca GSON no seu projeto (via Maven, Gradle ou manualmente).

Configure sua API Key no código, substituindo "YOUR_API_KEY" pela chave recebida por e-mail.

Execute a classe principal (Main).

📖 Exemplo de Uso
===== Conversor de Moedas =====
1 - Dólar → Real
2 - Real → Dólar
3 - Euro → Real
4 - Real → Euro
5 - Libra → Real
6 - Real → Libra
Escolha uma opção: 1
Informe o valor: 100
Resultado: 100 dólares equivalem a 486.65 reais

📌 Funcionalidades Extras (opcionais)

Histórico de conversões com data e hora.

Mais opções de moedas.

Armazenamento de logs.

Uso de outras APIs de cotação.

📅 Organização do Projeto

O desenvolvimento foi gerenciado via Trello, quebrando o desafio em tarefas:

Configuração do ambiente.

Consumo da API.

Desserialização com GSON.

Implementação das conversões.

Criação do README e melhorias.

📜 Licença

Este projeto foi desenvolvido para fins educacionais, sem fins comerciais.
