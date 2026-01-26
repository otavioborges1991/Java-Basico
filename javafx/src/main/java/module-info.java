module estudonauta.curso {
    requires javafx.controls;
    requires javafx.fxml;

    opens estudonauta.curso to javafx.fxml;
    exports estudonauta.curso;
}
