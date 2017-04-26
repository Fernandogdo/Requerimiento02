package Clases;

/**
 *
 * @author macbook
 */
public class DocenteTitular extends Docente {

    private String strHorarioClase;

    public DocenteTitular(String strIdentificacion, String strNombres, String strEmail, String strIdDocente, String strHorarioClase) {
        super(strIdentificacion, strNombres, strEmail, strIdDocente);
        this.strHorarioClase = strHorarioClase;
    }

    public String getStrHorarioClase() {
        return strHorarioClase;
    }

    @Override
    public String toString() {
        return "\n\nDocente Titular" + super.toString() + "\nHorario Clase: " + strHorarioClase;
    }
}
