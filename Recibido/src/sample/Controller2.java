package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.Objetos.Email;
import sample.Servicio.ClienteTCP;
import sample.Servicio.ServidorTCP;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
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

    public void ClickEn(javafx.event.ActionEvent actionEvent) throws IOException, MessagingException {
//        Email email=new Email("nada","sanoro@alu.iesserpis.org","sandraromero262@gmail.com","");
//        email.setUsuario("sanoro@aluiesserpis.org");
//        email.setAsunto(textFieldasu.getText());
//        email.setContenido(mensaje.getText());
//        email.setDestino(textFielddes.getText().trim());
//        enviarcorreo();

        enviarcorreo();

    }





public boolean enviarcorreo() throws MessagingException {
    Properties p=new Properties();
        p.put("mail.smtp.host","smtp.gmail.com");
        p.setProperty("mail.smtp.starttls.enable", "true");
        p.setProperty("mail.smtp.port","587");
        p.setProperty("mail.smtp.user","sanoro@alu.iesserpis.org");
        p.setProperty("mail.smtp.auth","true");

    Session session=Session.getDefaultInstance(p,null);
    MimeBodyPart texto=new MimeBodyPart();
        //texto.setText(String.valueOf(email.getContenido()));

    MimeMultipart mimeMessage=new MimeMultipart();
        mimeMessage.addBodyPart(texto);

    MimeMessage mensaje=new MimeMessage(session);
        mensaje.setFrom(new InternetAddress("sanoro@alu.iesserpis.org"));
        mensaje.setReplyTo(InternetAddress.parse("sanoro@alu.iesserpis.org", false));
        mensaje.addRecipient(Message.RecipientType.TO,new InternetAddress("sandraromero262@gmail.com"));
        //mensaje.setSubject(String.valueOf(email.getAsunto()));
        mensaje.setContent(mimeMessage);
    System.out.println(mensaje);
    Transport t=session.getTransport("smtp");
      //aqui conecta con el gmail del destino con el origen  t.connect();
        t.sendMessage(mensaje,mensaje.getAllRecipients());
        t.close();
    return false;

}

}
