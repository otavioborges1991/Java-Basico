package estudonauta.curso;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class OlaMundoFx {

    @FXML
    private Button btnClique;
    @FXML
    private Label lblMensagem;

    @FXML
    private void mostrarMensagem() throws IOException {
        lblMensagem.setText("Olá, Mundo! Em Java FX.");
    }
}
