package br.com.fiap.bean;

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
        this.nivelDor = nivelDor;
        this.anoNascimento = anoNascimento;
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
        this.nivelDor = nivelDor;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
// metodos classe
    public int calcularIdade (int anoAtual){
        return  anoAtual - anoNascimento;
    }
    public String definirPrioridade (int anoAtual){
        return "";
    }

}
