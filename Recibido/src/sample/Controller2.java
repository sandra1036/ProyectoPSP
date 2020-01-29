package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.Servicio.ClienteTCP;
import sample.Servicio.ServidorTCP;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller2 implements Initializable {

    @FXML
    private TextField textFielddes;

    @FXML
    private TextField textFieldasu;

    @FXML
    private TextArea mensaje;

    @FXML
    private Button enviar;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void ClickEn(javafx.event.ActionEvent actionEvent) throws IOException {
        ServidorTCP servidorTCP=new ServidorTCP();
        ClienteTCP clienteTCP=new ClienteTCP();
        System.out.println(servidorTCP.toString());
        System.out.println(clienteTCP.toString());

    }

}
