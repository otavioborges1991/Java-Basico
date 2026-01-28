package estudonauta.curso;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class MainController implements Initializable {

    String caminhoPasta = "C:/Users/otavio/code/cursos/Estudonauta/Java Básico/javafx/src/main/resources/estudonauta/curso";
    final File pasta = new File(caminhoPasta);
    
    @FXML
    private Label lblSelecionado;
    @FXML
    private ListView <String> listaProjetos;

    @FXML
    private void MostrarProjeto() throws IOException {
        String seleção = listaProjetos.getSelectionModel().getSelectedItem(); // identifica o item selecionado 
        lblSelecionado.setText(seleção); // altera o texto do label para o item selecionado
        
    }

    private void criarListaProjetos() {
        // Código para criar uma lista com os projetos existentes vai aqui.
        listaProjetos.getItems().addAll(
            pasta.list()
        );

    }
    
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lblSelecionado.setText("Nenhum projeto selecionado");

        // Código para criar uma lista com os projetos existentes vai aqui.
        criarListaProjetos();
    }
    
    

    
    
}
