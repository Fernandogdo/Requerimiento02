package Clases;

/**
 *
 * @author macbook
 */
public class DocenteAuxiliar extends Docente {

    private String strHorarioTutoria;

    public DocenteAuxiliar(String strIdentificacion, String strNombres, String strEmail, String strIdDocente, String strHorarioTutoria) {
        super(strIdentificacion, strNombres, strEmail, strIdDocente);
        this.strHorarioTutoria = strHorarioTutoria;
    }

    public String getStrHorarioTutoria() {
        return strHorarioTutoria;
    }

    @Override
    public String toString() {
        return "\nDocente Auxiliar" + super.toString() + "\nHorario Tutoria: " + strHorarioTutoria;
    }
}
