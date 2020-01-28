package sample.Objetos;

public class Email {
    public String asunto;
    public String origen;
    public String[] destino;
    public String contenido;

    public Email(String asunto, String origen, String[] destino, String contenido) {
        this.asunto = asunto;
        this.origen = origen;
        this.destino = destino;
        this.contenido = contenido;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String[] getDestino() {
        return destino;
    }

    public void setDestino(String[] destino) {
        this.destino = destino;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
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
