package Clases;

/**
 *
 * @author macbook
 */
public class Docente extends Persona {

    private String strIdDocente;

    public Docente(String strIdentificacion, String strNombres, String strEmail, String strIdDocente) {
        super(strIdentificacion, strNombres, strEmail);
        this.strIdDocente = strIdDocente;
    }

    public String getStrIdDocente() {
        return strIdDocente;
    }

    @Override
    public String toString() {
        return "\n" + super.toString() + "\nID Docente: " + strIdDocente;
    }
}
