package br.com.fiap.bean;

import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.Period;

public class Paciente {
    //atributos
    private String nome;
    private String sintomas;
    private int nivelDor;
    private LocalDate dataNascimento;
    private Anamnese fichaClinica;

    //construtores
    public Paciente() {
    }

    public Paciente(String nome, String sintomas, int nivelDor, LocalDate dataNascimento) {
        this.nome = nome;
        this.sintomas = sintomas;
        setNivelDor(nivelDor);
        setDataNascimento(dataNascimento);
    }

    //metodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public int getNivelDor() {
        return nivelDor;
    }

    public void setNivelDor(int nivelDor) {
        try {
            if (nivelDor >= 0 && nivelDor <= 10) {
                this.nivelDor = nivelDor;
            } else {
                throw new Exception("Número inválido, o nível de dor deve ser um número de 0 a 10");
            }
        } catch (Exception e) {
            // Agora sim ele mostra a janela na cara do usuário e encerra o sistema!
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        try {
            LocalDate inicio = LocalDate.parse("1900-01-01").minusDays(1);
            LocalDate fim = LocalDate.now().plusDays(1);
            if (dataNascimento.isAfter(inicio) && dataNascimento.isBefore(fim)) {
                this.dataNascimento = dataNascimento;
            } else {
                throw new Exception("Data fora da faixa permitida");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }
    }

    public Anamnese getFichaClinica() {
        return fichaClinica;
    }

    public void setFichaClinica(Anamnese fichaClinica) {
        this.fichaClinica = fichaClinica;
    }

    //metodos da classe
    public int calcularIdade() {
        LocalDate dataAtual = LocalDate.now();
        Period idade = Period.between(dataNascimento, dataAtual);
        return idade.getYears();
    }

    public String definirPrioridade() {
        int idadePaciente = calcularIdade();
        if (nivelDor >= 8) {
            return ("prioridade urgente");
        } else if (idadePaciente >= 60 || nivelDor == 7) {
            return ("prioridade alta");
        } else {
            return ("Espere até ser chamado");
        }
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", sintomas='" + sintomas + '\'' +
                ", nivelDor=" + nivelDor +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}