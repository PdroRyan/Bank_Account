# 💰 Sistema Bancário em Java

Este projeto é um sistema bancário simples desenvolvido em Java. Ele permite criar contas, realizar depósitos, saques e visualizar o saldo. O sistema é operado via terminal (console) com um menu interativo.

## 📂 Estrutura do Projeto

src/
└── co/pedroryan/bank/
└── App.java
└── Account.java
└── Bank.java

## 🚀 Funcionalidades

- Criar contas bancárias com nome do cliente.
- Realizar depósitos.
- Realizar saques com verificação de saldo.
- Exibir lista de todas as contas criadas.
- Exibir o total geral dos saldos de todas as contas.

## 🧠 Como funciona

O programa é executado via terminal e oferece menus interativos para criar contas e operar nelas. Ele está dividido em duas partes principais:

### 1. Menu principal

Permite:
- Criar uma nova conta.
- Sair do programa.

```text
O que você deseja fazer?
C = Criar uma conta
E = Sair
2. Operações da conta
Após criar uma conta, é possível:

Depositar valores.

Sacar valores (com verificação de saldo).

Sair da operação.


O que deseja fazer?
D = Depósito
S = Saque
E = Sair

🛠️ Tecnologias utilizadas
Java 11 ou superior

Scanner para entrada de dados

Programação orientada a objetos (POO)

📌 Exemplo de uso

O que você deseja fazer?
C = Criar uma conta
E = Sair
Digite aqui: C
Digite o seu nome: Ana
O que deseja fazer?
D = Depósito
S = Saque
E = Sair
Digite aqui: D
Qual o valor que deseja depositar?
100
