import datos.Conexion;
import datos.PersonaDAO;
import domain.Persona;
import java.sql.*;
import java.util.List;

public class testManejoPersonas {
    public static void main(String[] args) {
        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit() == true){
                conexion.setAutoCommit(false);
            }

            PersonaDAO personaDAO = new PersonaDAO(conexion);
            Persona cambioPersona = new Persona();
            personaDAO.actualizar(cambioPersona);
            Persona nuevaPersona = new Persona();
            nuevaPersona.setNombre("Carlos");
            nuevaPersona.setApellido("Roa");
            personaDAO.insertar(nuevaPersona);

            conexion.commit();

        } catch (SQLException throwables) {
            throwables.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
    }
}
