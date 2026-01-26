// Talvez seja melhor criar interfaces usando xml.
package ola_mundo_swing;
import static ola_mundo_swing.JanelaHelper.*;
import java.util.logging.Logger;
import javax.swing.*;

public class OlaMundoSwing {
    private JFrame janela;
    private JLabel label;
    public static void main(String[] args) {
        OlaMundoSwing app = new OlaMundoSwing();
        
        Logger logger = Logger.getLogger(OlaMundoSwing.class.getName());
        logger.info("Aplicação iniciada com sucesso.");

        // Criar uma janela simples usando Swing
        app.janela = new JFrame("Olá Mundo Swing");
        app.janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.janela.setSize(400, 300);
        
        // Exibir uma mensagem de boas-vindas
        JOptionPane.showMessageDialog(app.janela, "Olá, Mundo! Bem-vindo ao Swing.");
        
        // Label
        // A linha abaixo cria um label, rotulo.
        app.label = new JLabel("Esta é uma aplicação Swing simples.");
        app.label.setHorizontalAlignment(SwingConstants.CENTER); // uma regra para centralizar o rótulo na janela
        app.janela.getContentPane().add(app.label); // adiciona o rótulo ao conteúdo da janela

        // botão
        JButton button = new JButton("Clique aqui");
        button.addActionListener(e -> mudarTexto(app.label, "Botão pressionado!")); // Define a ação do botão
        app.janela.getContentPane().add(button, java.awt.BorderLayout.SOUTH); // adiciona o botão na parte inferior da janela
        // janela.getContentPane().add(button);  // Add button to window
        // janela.setVisible(true); // torna a janela visível
        açãoJanela(app.janela, "exibir");
        manterRodando(app.janela);
        fecharAplicacao();
    }
}