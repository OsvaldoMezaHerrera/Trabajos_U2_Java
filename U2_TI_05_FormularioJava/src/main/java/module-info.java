module mx.edu.utez.u2_ti_05_formulariojava {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens mx.edu.utez.u2_ti_05_formulariojava to javafx.fxml;
    exports mx.edu.utez.u2_ti_05_formulariojava;
}