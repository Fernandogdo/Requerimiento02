package Principal;

import Clases.ArchivoTexto;

/**
 *
 * @author macbook
 */
public class Main {

    public static void main(String args[]) {
        ArchivoTexto aplicacion = new ArchivoTexto();

        aplicacion.abrir_archivo();
        aplicacion.agregar_informacion();
        aplicacion.cerrar_archivo();
    }
}
