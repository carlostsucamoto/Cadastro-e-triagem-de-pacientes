package br.com.fiap.main;

import br.com.fiap.bean.Paciente;

import java.util.Scanner;

public class MainVersao2 {
    public static void main(String[] args) {
        Paciente paciente2;
        Scanner scan;
        String nome;
        int anoNascimento;
        int nivelDor;
        String sintomas;
        try {
            scan = new Scanner(System.in);
            System.out.println("Preciso que você digite seu nome:");
            nome = scan.nextLine();
            System.out.printf("Olá %s,seja bem vindo!, digite seu ano de nascimento: ",nome);
            anoNascimento = scan.nextInt();
            scan.nextLine();
            System.out.println("Certo, e qual o motivo da sua vinda? Qual sintoma está sentindo?");
            sintomas = scan.nextLine();
            System.out.print("E qual é a intensidade da dor que esse sintoma está te causando? (Digite um número 1 a 10)");
            nivelDor = scan.nextInt();
            paciente2 = new Paciente(nome, sintomas, nivelDor, anoNascimento);
            System.out.println("\n--- Resumo do Atendimento ---");
            System.out.printf("Olá! %s, verifiquei que você possui %d anos.", paciente2.getNome(), paciente2.calcularIdade());
            System.out.printf("\nNotei também que você está sentindo um nível %d de dor e que seu sintoma é %s.", paciente2.getNivelDor(), paciente2.getSintomas());
            System.out.printf("\nSua prioridade é: %s\n", paciente2.definirPrioridade());
        } catch (Exception e) {
            System.out.println("Erro: Por favor, digite apenas números para o ano e o nível de dor.");
        }

    }
}