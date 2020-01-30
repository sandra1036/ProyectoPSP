package sample;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.w3c.dom.ls.LSOutput;
import sample.Objetos.Email;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import sample.Objetos.Email;
import sample.Objetos.Usuario;

import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Controller implements Initializable {
    Scene scene;
    @FXML
    TextField textUsuario;
    @FXML
    TextField textPassword;

    @FXML private Button button;

    public static Usuario usuario;
    public static String user;
    public static String pass;

    @Override
    public void initialize(URL location, ResourceBundle resources) {


    }
    //Este boton pasa a la pantalla donde muestro el mensaje
    public void Click(javafx.event.ActionEvent actionEvent) throws IOException, MessagingException {
        usuario = new Usuario(textUsuario.getText(), textPassword.getText());
        Properties p = new Properties();
        p.put("mail.smtp.host", "smtp.gmail.com");
        p.setProperty("mail.smtp.starttls.enable", "true");
        p.setProperty("mail.smtp.port", "587");
        p.setProperty("mail.smtp.socketFectory.port", "587");
        p.setProperty("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(p, null);

        Transport t = session.getTransport("smtp");

        user = usuario.getUsuario();
        pass = usuario.getPassword();

        try {
            t.connect(user, pass);
            Stage stage= new Stage();
            FXMLLoader loader=new FXMLLoader(getClass().getResource("recibido.fxml"));
            Parent root=(Parent)loader.load();
            stage.setScene(new Scene(root));
            stage.show();
        }
        catch (Exception e) {
            Alert a = new Alert(Alert.AlertType.NONE);
            a.setAlertType(Alert.AlertType.ERROR);
            a.setContentText("No se ha podido identificar");
            a.show();
        }
    }
}
