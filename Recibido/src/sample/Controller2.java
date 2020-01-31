package sample;

import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import sample.Objetos.Email;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;


public class Controller2 {
    @FXML
    private TextField textFielddes;

    @FXML
    private TextField textFieldasu;

    @FXML
    private TextArea mensaje;

    @FXML
    private Button enviar;

    public void ClickEn(javafx.event.ActionEvent actionEvent) throws IOException, MessagingException, InvocationTargetException {
          enviarcorreo();
    }



    public boolean enviarcorreo() throws MessagingException, InvocationTargetException {

        //Esto es lo que hace que se conecte con el gmail
            Properties p = new Properties();
            p.put("mail.smtp.host", "smtp.gmail.com");
            p.setProperty("mail.smtp.starttls.enable", "true");
            //El puerto que se identifica con el SMTP
            p.setProperty("mail.smtp.port", "587");
            p.setProperty("mail.smtp.socketFectory.port", "587");
            p.setProperty("mail.smtp.user", "programacionprocesos2@gmail.com");
            p.setProperty("mail.smtp.auth", "true");


            Session session = Session.getDefaultInstance(p, null);
            MimeBodyPart texto = new MimeBodyPart();

            //Creamos un email el cual le pasaremos el asunto el destino y el mensaje
            Email email = new Email(textFieldasu.getText(), "127.0.0.1", textFielddes.getText(), mensaje.getText());
            //Escribe el mensaje
            texto.setText(email.getContenido());

            MimeMultipart mimeMessage = new MimeMultipart();
            mimeMessage.addBodyPart(texto);

            MimeMessage mensaje = new MimeMessage(session);
            //El origen del correo
            mensaje.setFrom(new InternetAddress(Controller.user));

            //Destinatario del correo
            mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(textFielddes.getText()));
            //Coge el asunto
            mensaje.setSubject(email.getAsunto());
            //Coge el mensaje
            mensaje.setContent(mimeMessage);
            //Muestra que se ha enviado el mensaje
            System.out.println(mensaje);
            //Protocolo de transpote
            Transport t = session.getTransport("smtp");
            //aqui conecta con el gmail
            t.connect(Controller.user, Controller.pass);
            //envia el mensaje
            t.sendMessage(mensaje, mensaje.getAllRecipients());
            t.close();
            return true;
    }
}
