package Clases;

/**
 *
 * @author macbook
 */
import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ArchivoTexto {

    private Formatter salida; // objeto usado para enviar texto al archivo

    // permite al usuario abrir el archivo
    public void abrir_archivo() {
        try {
            salida = new Formatter("RegistroAcedemico.txt");
        } // fin de try
        catch (SecurityException securityException) {
            System.err.println(
                    "No tiene acceso de escritura a este archivo.");
            System.exit(1);
        } // fin de catch
        catch (FileNotFoundException filesNotFoundException) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del método abrir_archivo

    // agrega registros al archivo
    public void agregar_informacion() {
        // el archivo permite el ingreso
        // de edad, nombre, apellido de una persona

        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;

        while (bandera) // itera hasta que bandera sea false
        {
            try // envía valores al archivo
            {
                // obtiene los datos que se van a enviar

                Alumno alumno1 = new Alumno("Alex Aranda", "alexflaquito95@gmail.com", "aalex3", "1146582658");

                DocenteAuxiliar docenteA1 = new DocenteAuxiliar("1105025272", " Armando Cabrera", "aacabrera@utpl.edu.ec", "aacabrera", "Lunes a Viernes");

                DocenteTitular docenteT1 = new DocenteTitular("14432543534", "Rene Elizalde", "relizalde@utpl.edu.ec", "reroes", "Lunes a Miercoles");

                ComponenteEducativo componente1 = new ComponenteEducativo("110-500", "Programación Avanzada", 4);
                ComponenteEducativo componente2 = new ComponenteEducativo("124-850", "Cálculo", 6);
                ComponenteEducativo componente3 = new ComponenteEducativo("137-390", "Desarrollo Espiritual II", 3);

                // escribe el nuevo registro
                salida.format("\t\t************ Registro Acedemico ************\n");
                salida.format(alumno1.toString() + "\nComponentes:\n" + componente1 + componente2 + componente3);
                salida.format(docenteA1.toString());
                salida.format(docenteT1.toString());

                System.out.println("Presione (2) para guardar archivo");
                int valor = entrada.nextInt();
                if (valor == 2) {
                    bandera = false;
                }

            } // fin de try
            catch (FormatterClosedException formatterClosedException) {
                System.err.println("Error al escribir en el archivo.");
                return;
            } // fin de catch
            catch (NoSuchElementException elementException) {
                System.err.println("Entrada invalida. Intente de nuevo.");
                entrada.nextLine(); // descarta la entrada para que el usuario intente de nuevo
            } // fin de catch

        } // fin de while
    } // fin del método agregarRegistros

    // cierra el arrchivo
    public void cerrar_archivo() {
        if (salida != null) {
            salida.close();
        }
    } // fin del método cerrarArchivo
} // fin de la clase ArchivoTexto

