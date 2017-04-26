package Clases;

/**
 *
 * @author macbook
 */
public class Persona {

    private String strIdentificacion;
    private String strNombres;
    private String strEmail;

    public Persona(String strIdentificacion, String strNombres, String strEmail) {
        this.strIdentificacion = strIdentificacion;
        this.strNombres = strNombres;
        this.strEmail = strEmail;
    }

    public String getIdentificacion() {
        return strIdentificacion;
    }

    public String getNombres() {
        return strNombres;
    }

    public String getEmail() {
        return strEmail;
    }

    @Override
    public String toString() {
        return "Identificacion: " + strIdentificacion + "\nNombres: " + strNombres + "\nEmail: " + strEmail;
    }
}
