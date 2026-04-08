package br.com.fiap.main;

import br.com.fiap.bean.Paciente;

public class Main {
        public static void main(String[] args) {
            //teste mockado
            Paciente paciente1 = new Paciente();
            paciente1.setNome("Carlos Eduardo");
            paciente1.setAnoNascimento(2000);
            paciente1.setNivelDor(8);
            paciente1.setSintomas("tosse");
            System.out.printf("ola! %s verifiquei que o senhor possui %d anos,notei também que você esta sentindo um nível %d de dor e que seu sintoma é %s", paciente1.getNome(),paciente1.calcularIdade(),paciente1.getNivelDor(),paciente1.getSintomas());
            System.out.printf("\nE sua prioridade é: %s",paciente1.definirPrioridade());
        }
    }

