module com.app.java.guessnumber {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.app.java.guessnumber to javafx.fxml;
    exports com.app.java.guessnumber;
}