package estudonauta.curso.ola_mundo_fx;

import estudonauta.curso.App;
import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController extends App {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary"); // esse comando me parece mudar a tela a ser mostrado escolhendo um dos arquivos fxml. 
                                        // Eu posso criar um jeito de escolher a proxima tela a mostrar, talvez com parametros
    }
}
