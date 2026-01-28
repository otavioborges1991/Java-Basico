module estudonauta.curso {
    // transitive para que outros módulos que dependam desse também tenham acesso ao javafx.graphics, removido porque estava funcionando sem ele, se precisar adicionarei de volta
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    opens estudonauta.curso to javafx.fxml;
    exports estudonauta.curso;
}
