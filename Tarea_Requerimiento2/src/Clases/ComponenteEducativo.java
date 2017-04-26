package Clases;

/**
 *
 * @author macbook
 */
public class ComponenteEducativo {

    private String strCodigo;
    private String strNombre;
    private int intNumCreditos;

    public ComponenteEducativo(String strCodigo, String strNombre, int intNumCreditos) {
        this.strCodigo = strCodigo;
        this.strNombre = strNombre;
        this.intNumCreditos = intNumCreditos;
    }

    public String getStrCodigo() {
        return strCodigo;
    }

    public String getStrNombre() {
        return strNombre;
    }

    public int getIntNumCreditos() {
        return intNumCreditos;
    }

    @Override
    public String toString() {
        return "Código: " + strCodigo + "\tMateria: " + strNombre + "\tCreditos: " + intNumCreditos + "\n";
    }
}
