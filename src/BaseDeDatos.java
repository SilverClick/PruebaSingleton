public class BaseDeDatos {

  private BaseDeDatos(){


    }



    private String usuario;
    private String token;

    private static BaseDeDatos instance = null;

    public static BaseDeDatos getInstance() {
        if (instance == null) {
            // desde aqui si que puedo acceder al constructor
            // porque estoy en la misma clase
            instance = new BaseDeDatos();
        }
        return instance;
    }





    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }


}

