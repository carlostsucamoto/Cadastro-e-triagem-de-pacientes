package br.com.fiap.main;

import br.com.fiap.bean.Anamnese;
import br.com.fiap.bean.Paciente;

import javax.swing.*;
import java.time.format.DateTimeFormatter;

public class MainAnamnese {
    public static void main(String[] args) {
        Paciente paciente1;
        String auxiliar, nome, sintomas, dor;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {

            nome = JOptionPane.showInputDialog("Seja-bem vindo(a), preciso que digite seu nome");
            auxiliar = JOptionPane.showInputDialog("Agora preciso que digite sua data de nascimento");
            int ano = Integer.parseInt(auxiliar);
            sintomas = JOptionPane.showInputDialog("Qual/quais sintomas você tem sentido?");
            dor = JOptionPane.showInputDialog("Digite de 0 a 10 qual o nível de dor que está sentindo");
            int nivelDor = Integer.parseInt(dor);

            paciente1 = new Paciente(nome, sintomas, nivelDor, ano);;



        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
