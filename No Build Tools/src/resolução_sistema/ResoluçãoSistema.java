package resolução_sistema;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResoluçãoSistema {

    public static void main(String[] args) {
        try {
            // suponho que isto seja para detectar o 'Toolkit' do sistema, (windows, linux, Apple)
            // de resolução do sistema
            Toolkit toolkit = Toolkit.getDefaultToolkit();

            Dimension tamanhaTela = toolkit.getScreenSize();

            int largura = tamanhaTela.width;
            int altura = tamanhaTela.height;

            System.out.println("Resolução de tela: " + largura + " x " + altura + " pixels");
            
        } catch (Exception exception) {
            System.err.println("Erro ou tentar acessar a resolução do sistema: " + exception.getMessage());
        }
        
    }
}