package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller2 implements Initializable {

    @FXML
    private TextField textFielddes;

    @FXML
    private TextField textFieldasu;

    @FXML
    private TextArea mensaje;



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        textFielddes.getText();
        textFieldasu.getText();
        mensaje.getText();
    }
}
