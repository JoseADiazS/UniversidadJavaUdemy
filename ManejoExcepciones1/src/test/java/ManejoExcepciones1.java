import Domain.Division;
import Domain.OperacionExcepcion;

public class ManejoExcepciones1 {
    public static void main(String[] args) {
        try {
            Division division = new Division(10,0);
        } catch (OperacionExcepcion operacionExcepcion) {
            operacionExcepcion.printStackTrace();
            System.out.println(operacionExcepcion.getMessage());
        }
        System.out.println("El programa continua");
    }
}
