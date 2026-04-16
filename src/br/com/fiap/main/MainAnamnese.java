package br.com.fiap.main;

import br.com.fiap.bean.Anamnese;
import br.com.fiap.bean.Paciente;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MainAnamnese {
    public static void main(String[] args) {
        Paciente paciente1;
        String auxiliar, nome, sintomas, dor;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {

            nome = JOptionPane.showInputDialog("Seja-bem vindo(a), preciso que digite seu nome: ").toUpperCase();
            auxiliar = JOptionPane.showInputDialog("Agora preciso que digite sua data de nascimento: ");
            int ano = Integer.parseInt(auxiliar);
            sintomas = JOptionPane.showInputDialog("Qual/quais sintomas você tem sentido?").toUpperCase();
            dor = JOptionPane.showInputDialog("Digite de 0 a 10 qual o nível de dor que está sentindo: ");
            int nivelDor = Integer.parseInt(dor);
            paciente1 = new Paciente(nome, sintomas, nivelDor, ano);

            Anamnese ficha1;
            String queixa, historico, habito, qualRemedio, qualAlergia;
            queixa = JOptionPane.showInputDialog("Digite a sua queixa principal: ").toUpperCase();
            historico = JOptionPane.showInputDialog("Essa sua queixa principal, vem acontecenda há algum tempo?, se sim descreva como começou").toUpperCase();
            habito = JOptionPane.showInputDialog("Agora preciso saber um pouco mais sobre você e seuas habitos, você bebe?, fuma alguma coisa? está indo ao banheiro normalmente? digite algo que o médico possa considerar útil para a resolução do tratamento: ");
            ficha1 = new Anamnese();
            ficha1.setQueixaPrincipal(queixa);
            ficha1.setHistoricoDoencas(historico);
            ficha1.setHabitoDeVida(habito);
            int remedio = JOptionPane.showConfirmDialog(null, "Você toma algum remédio controlado?", "Triagem", JOptionPane.YES_NO_OPTION);
            if (remedio == JOptionPane.YES_OPTION) {
                qualRemedio = JOptionPane.showInputDialog("Digite os remédios utilizados: ");
                ficha1.setUsaMedicacaoControlada(true);
                ficha1.setQuaisMedicamentos(qualRemedio);

            } else {
                ficha1.setUsaMedicacaoControlada(false);
            }
            int alergia = JOptionPane.showConfirmDialog(null, "Você tem alguma alergia?", "Triagem", JOptionPane.YES_NO_OPTION);
            if (alergia == JOptionPane.YES_OPTION) {
                qualAlergia = JOptionPane.showInputDialog("Digite as suas alergias: ");
                ficha1.setTemAlergia(true);
                ficha1.setQualAlergia(qualAlergia);
            } else {
                ficha1.setTemAlergia(false);
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
