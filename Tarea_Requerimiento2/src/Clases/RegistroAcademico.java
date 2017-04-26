package Clases;

import java.util.ArrayList;

/**
 *
 * @author macbook
 */
public class RegistroAcademico {

    private ArrayList<Persona> lstPersonas = new ArrayList<>();
    private ArrayList<ComponenteEducativo> lstComponentes = new ArrayList<>();

    public RegistroAcademico() {
    }

    public void agregarPersonas(Persona objPersona) {
        lstPersonas.add(objPersona);
    }

    public void agregarComponentes(ComponenteEducativo objComponentesE) {
        lstComponentes.add(objComponentesE);
    }

    public String getPersonas() {
        String descripcion = null;
        for (Persona personas : lstPersonas) {
            descripcion = personas.toString();
        }
        return descripcion;
    }

    public String getComponentesE() {
        String descripcion = null;
        for (ComponenteEducativo componentes : lstComponentes) {
            descripcion = componentes.toString();
        }
        return descripcion;
    }
}
