public class Main {
    public static void main(String[] args) {
        BaseDeDatos miUnicaInstancia = BaseDeDatos.getInstance();
// rellenamos los atributos
        miUnicaInstancia.setUsuario("pokegonzalo");
        miUnicaInstancia.setToken("pokegonzalo1");
        System.out.println(miUnicaInstancia.getUsuario() +"\n"+ miUnicaInstancia.getToken());
    }


}