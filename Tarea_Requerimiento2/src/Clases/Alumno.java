package Clases;

/**
 *
 * @author macbook
 */
public class Alumno extends Persona{
    private String strIdAlumno;

    public Alumno(String strNombres, String strEmail, String strIdAlumno, String strIdentificacion) {
        super(strIdentificacion, strNombres, strEmail);
        this.strIdAlumno = strIdAlumno;
    }

    @Override
    public String toString() {
        return "\nAlumno\n" + super.toString() + "\nID Alumno: " + strIdAlumno;
    }
}

