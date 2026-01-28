package estudonauta.curso.ola_mundo_fx;

import java.io.IOException;
import estudonauta.curso.App;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("main");
    }
}