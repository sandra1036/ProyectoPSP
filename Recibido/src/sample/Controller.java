package sample;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import org.w3c.dom.ls.LSOutput;
import sample.Objetos.Email;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import sample.Objetos.Email;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    TableView<Email> tableView;
    @FXML
    TableColumn<Email, String> firstcolumn;
    @FXML
    TableColumn<Email, String> namecolumn;
    @FXML
    TableColumn<Email, String> Emailcolumn;
    @FXML
    Button botoncrear= new Button();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        botoncrear.setOnMouseClicked(event -> System.out.println("patata"));

    }
}
