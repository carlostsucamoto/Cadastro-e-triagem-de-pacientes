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
            paciente1 = new Paciente();

            nome = JOptionPane.showInputDialog("Seja-bem vindo(a), preciso que digite seu nome: ").toUpperCase();
            paciente1.setNome(nome);

            auxiliar = JOptionPane.showInputDialog("Digite sua data de nascimento (dia/mês/ano): ");
            LocalDate dataNasc = LocalDate.parse(auxiliar, dtf);
            paciente1.setDataNascimento(dataNasc);

            sintomas = JOptionPane.showInputDialog("Qual/quais sintomas você tem sentido?").toUpperCase();
            paciente1.setSintomas(sintomas);

            dor = JOptionPane.showInputDialog("Digite de 0 a 10 qual o nível de dor que está sentindo: ");
            int nivelDor = Integer.parseInt(dor);
            paciente1.setNivelDor(nivelDor);

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

            paciente1.setFichaClinica(ficha1);

            String relatorio = String.format(
                    "Olá, %s!\n" +
                            "Vi que você tem %d anos e está sentindo uma dor de intensidade %d.\n" +
                            "Logo, sua prioridade é: %s\n\n" +
                            "--- DADOS DA TRIAGEM ---\n" +
                            "Queixa principal: %s\n" +
                            "Histórico: %s\n" +
                            "Hábitos: %s\n\n" +
                            "ALERTA DO SISTEMA: %s\n\n" +
                            "Vou passar essas informações ao médico.",
                    paciente1.getNome(),
                    paciente1.calcularIdade(),
                    paciente1.getNivelDor(),
                    paciente1.definirPrioridade(),
                    paciente1.getFichaClinica().getQueixaPrincipal(),
                    paciente1.getFichaClinica().getHistoricoDoencas(),
                    paciente1.getFichaClinica().getHabitoDeVida(),
                    paciente1.getFichaClinica().verificarRiscoCirurgico()
            );
            JOptionPane.showMessageDialog(null, relatorio, "Prontuário Final", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: Formato inválido! \nDetalhe: " + e.getMessage());
        }
    }
}