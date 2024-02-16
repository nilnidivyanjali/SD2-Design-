module org.example.myjavafxapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.myjavafxapp to javafx.fxml;
    exports org.example.myjavafxapp;
}