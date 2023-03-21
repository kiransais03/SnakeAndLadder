module com.example.ladderandsnake.ladderandsnake {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.example.ladderandsnake.ladderandsnake to javafx.fxml;
    exports com.example.ladderandsnake.ladderandsnake;
}