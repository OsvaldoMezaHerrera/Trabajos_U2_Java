package mx.edu.utez.u2_ti_05_formulariojava;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText ( "Welcome to JavaFX Application!" );
    }
}