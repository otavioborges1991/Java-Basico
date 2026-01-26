package ola_mundo_swing;

import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JanelaHelper {
    private static final Logger logger = Logger.getLogger(JanelaHelper.class.getName());

    public static void mudarTexto(JLabel label, String mensagem) {
        label.setText(mensagem);
    }

    public static void fecharAplicacao() {
        logger.info("Aplicação finalizada.");
        System.exit(0);
    }

    public static void manterRodando(JFrame janela) {
        logger.info("Aguardando interação do usuário...");
        while (janela.isVisible()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                logger.severe("Erro na thread de espera: " + e.getMessage());
            }
        }
    }

    public static void açãoJanela(JFrame janela, String ação) {
        if (ação.equals("esconder")) {
            esconderJanela(janela);
        } else if (ação.equals("exibir")) {
            exibirJanela(janela);
        } else if (ação.equals("atualizar")) {
            atualizarJanela(janela);
        } else if (ação.equals("fechar")) {
            fecharJanela(janela);
        } else {
            logger.warning("Ação desconhecida: " + ação);
        }
    }

    public static void fecharJanela(JFrame janela) {
        janela.dispose();
        logger.info("Janela fechada.");
    }

    public static void exibirJanela(JFrame janela) {
        janela.setVisible(true);
        logger.info("Janela exibida.");
    }

    public static void esconderJanela(JFrame janela) {
        janela.setVisible(false);
        logger.info("Janela escondida.");
    }

    public static void atualizarJanela(JFrame janela) {
        janela.revalidate();
        janela.repaint();
        logger.info("Janela atualizada.");
    }
}