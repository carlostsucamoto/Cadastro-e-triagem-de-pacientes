# Sistema de Triagem de Pacientes

## Descrição

Este projeto consiste em um sistema simples de triagem de pacientes desenvolvido em Java.
O objetivo é simular um atendimento inicial, coletando informações básicas do paciente e definindo sua prioridade de atendimento com base na idade e no nível de dor informado.

## Funcionalidades

* Cadastro de paciente com:

  * Nome
  * Ano de nascimento
  * Sintomas
  * Nível de dor (0 a 10)

* Cálculo automático da idade

* Classificação de prioridade:

  * Prioridade urgente
  * Prioridade alta
  * Atendimento padrão

## Regras de Negócio

* Pacientes com nível de dor maior ou igual a 8 → prioridade urgente
* Pacientes com 60 anos ou mais ou nível de dor 7 → prioridade alta
* Demais casos → atendimento padrão

## Tecnologias Utilizadas

* Java
* Programação Orientada a Objetos (POO)
* Entrada de dados com Scanner

## Estrutura do Projeto

* `Paciente` → Classe responsável pelos dados e regras de negócio
* `Main` → Execução com dados fixos (teste)
* `MainVersao2` → Execução com entrada de dados via usuário

## Como Executar

1. Compile o projeto
2. Execute a classe `MainVersao2`
3. Insira os dados solicitados no terminal

## Objetivo Acadêmico

Projeto desenvolvido para prática de conceitos de:

* Classes e objetos
* Encapsulamento
* Métodos
* Estruturas condicionais

## Autor

Carlos Eduardo Tsucamoto Chiarelli
