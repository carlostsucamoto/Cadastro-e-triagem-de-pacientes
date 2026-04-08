package br.com.fiap.bean;

import java.time.LocalDate;

public class Paciente {
    //atributos
    private String nome;
    private String sintomas;
    private int nivelDor;
    private int anoNascimento;
//construtores

    public Paciente() {
    }

    public Paciente(String nome, String sintomas, int nivelDor, int anoNascimento) {
        this.nome = nome;
        this.sintomas = sintomas;
        setNivelDor(nivelDor);
        setAnoNascimento(anoNascimento);
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
            System.out.println(e.getMessage());
        }
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        try {
            LocalDate dataAtual = LocalDate.now();
            if (anoNascimento >=1900 && anoNascimento <= dataAtual.getYear()){
                this.anoNascimento = anoNascimento;
            }
            else {
                throw new Exception("ano inválido, tente um número entre 1900 e o ano atual");

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
// metodos classe
    public int calcularIdade (){
        int anoAtualCalculo = LocalDate.now().getYear();
        return  anoAtualCalculo - anoNascimento;
    }
    public String definirPrioridade (){
        int idadePaciente = calcularIdade();
        if (nivelDor >= 8) {
            return ("prioridade urgente");
        } else if (idadePaciente >=60 || nivelDor ==7){
            return ("prioridade alta");
        }
    else{
        return ("Espere até ser chamado");

        }
    }

}
