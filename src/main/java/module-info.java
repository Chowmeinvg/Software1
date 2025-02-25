module org.example.softwaregithub {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.softwaregithub to javafx.fxml;
    exports org.example.softwaregithub;
}