import datos.PersonaDAO;
import domain.Persona;

import java.util.List;

public class testManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDAO = new PersonaDAO();
        List<Persona> personas = personaDAO.seleccionar();
        for (Persona persona: personas) {
            System.out.println("persona = " + persona);
        }

        // Insertando un nuevo objeto de tipo Persona
        Persona personaNueva = new Persona("Jessica","Peñarete","123@mail.com","3213215644");
        personaDAO.insertar(personaNueva);

        List<Persona> personas1 = personaDAO.seleccionar();
        for (Persona persona: personas1) {
            System.out.println("persona = " + persona);
        }

        // Eliminando un objeto de tipo persona
        Persona persona3 = new Persona();
        personaDAO.eliminar(persona3);

        List<Persona> personas2 = personaDAO.seleccionar();
        for (Persona persona: personas2) {
            System.out.println("persona = " + persona);
        }

        Persona persona4 = new Persona();
        personaDAO.actualizar(persona4);

        List<Persona> personas3 = personaDAO.seleccionar();
        for (Persona persona: personas3) {
            System.out.println("persona = " + persona);
        }
    }
}
