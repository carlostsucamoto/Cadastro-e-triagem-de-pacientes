package br.com.fiap.bean;

public class Anamnese {
    //atributos
    private String queixaPrincipal;
    private  String historicoDoencas;
    private boolean usaMedicacaoControlada;
    private String quaisMedicamentos;
    private boolean temAlergia;
    private String qualAlergia;
    private String habitoDeVida;

// construtores

    public Anamnese() {
    }

    public Anamnese(String queixaPrincipal, String historicoDoencas, boolean usaMedicacao, String quaisMedicamentos, boolean temAlergia, String qualAlergia, String habitoDeVida) {
        this.queixaPrincipal = queixaPrincipal;
        this.historicoDoencas = historicoDoencas;
        this.usaMedicacaoControlada = usaMedicacao;
        this.quaisMedicamentos = quaisMedicamentos;
        this.temAlergia = temAlergia;
        this.qualAlergia = qualAlergia;
        this.habitoDeVida = habitoDeVida;
    }
// getters e setters

    public String getQueixaPrincipal() {
        return queixaPrincipal;
    }

    public void setQueixaPrincipal(String queixaPrincipal) {
        this.queixaPrincipal = queixaPrincipal;
    }

    public String getHistoricoDoencas() {
        return historicoDoencas;
    }

    public void setHistoricoDoencas(String historicoDoencas) {
        this.historicoDoencas = historicoDoencas;
    }

    public boolean isUsaMedicacaoControlada() {
        return usaMedicacaoControlada;
    }

    public void setUsaMedicacaoControlada(boolean usaMedicacaoControlada) {
        this.usaMedicacaoControlada = usaMedicacaoControlada;


        if (!this.usaMedicacaoControlada) {
            this.quaisMedicamentos = "Nenhuma";
        }
    }
    public String getQuaisMedicamentos() {
        return quaisMedicamentos;
    }

    public void setQuaisMedicamentos(String quaisMedicamentos) {
        this.quaisMedicamentos = quaisMedicamentos;
    }

    public boolean isTemAlergia() {
        return temAlergia;
    }

    public void setTemAlergia(boolean temAlergia) {
        this.temAlergia = temAlergia;

        if (!this.temAlergia) {
            this.qualAlergia = "Nenhuma";
        }
    }

    public String getQualAlergia() {
        return qualAlergia;
    }

    public void setQualAlergia(String qualAlergia) {
        this.qualAlergia = qualAlergia;
    }

    public String getHabitoDeVida() {
        return habitoDeVida;
    }

    public void setHabitoDeVida(String habitoDeVida) {
        this.habitoDeVida = habitoDeVida;
    }
    public String verificarRiscoCirurgico(){
        if (temAlergia == true || usaMedicacaoControlada == true) {
            return ("ATENÇÃO: Risco Cirúrgico Elevado");

        }else return ("Risco Cirúrgico Padrão");
    }

}
