package sample;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.w3c.dom.ls.LSOutput;
import sample.Objetos.Email;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import sample.Objetos.Email;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Controller implements Initializable {
    Scene scene;
    @FXML
    TableView<Email> tableView;
    @FXML
    TableColumn<Email, String> firstcolumn;
    @FXML
    TableColumn<Email, String> namecolumn;
    @FXML
    TableColumn<Email, String> Emailcolumn;

    @FXML private Button button;

    Controller cr;

    @FXML private void llamarventana() throws IOException {
        Stage stage= new Stage();
        FXMLLoader loader=new FXMLLoader();
        AnchorPane root=(AnchorPane)loader.load(getClass().getResource("recibido.fxml").openStream());
        cr=(Controller)loader.getController();
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            llamarventana();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
