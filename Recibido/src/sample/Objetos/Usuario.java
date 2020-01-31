package sample.Objetos;

public class Usuario {
    public static String usuario;
    public static String password;

    public Usuario(String usu, String pas) {
        usuario = usu;
        password = pas;
    }

    public static String getUsuario() {
        return usuario;
    }

    public static void setUsuario(String usuario) {
        Usuario.usuario = usuario;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Usuario.password = password;
    }
}


