package sample.Objetos;

import javafx.beans.property.SimpleStringProperty;

public class Email {
    public SimpleStringProperty asunto;
    public String origen;
    public SimpleStringProperty destino;
    public SimpleStringProperty contenido;

    public String usuario;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public  String contrasena;
    public Email(String asunto, String origen, String destino, String contenido) {
        this.asunto =new SimpleStringProperty(asunto);
        this.origen = origen;
        this.destino =new SimpleStringProperty(destino);
        this.contenido =new SimpleStringProperty(contenido);
    }

    public SimpleStringProperty getAsunto() {
        return asunto;
    }

    public void setAsunto(SimpleStringProperty asunto) {
        this.asunto = asunto;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public SimpleStringProperty getDestino() {
        return destino;
    }

    public void setDestino(SimpleStringProperty destino) {
        this.destino = destino;
    }

    public SimpleStringProperty getContenido() {
        return contenido;
    }

    public void setContenido(SimpleStringProperty contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Email{" +
                "Asunto='" + asunto + '\'' +
                ", Origen='" + origen + '\'' +
                ", Destino='" + destino + '\'' +
                ", Contenido='" + contenido + '\'' +
                '}';
    }
}
