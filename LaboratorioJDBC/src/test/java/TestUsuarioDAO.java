import datos.UsuarioDAO;
import domain.Usuario;

import java.util.List;
import java.util.Scanner;

public class TestUsuarioDAO {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        int seleccion = 0;
        Scanner scanner = new Scanner(System.in);
        UsuarioDAO control = new UsuarioDAO();
       do {
           System.out.println("Digite su seleccion: ");
           System.out.println("1. Seleccionar usuarios");
           System.out.println("2. Insertar usuario");
           System.out.println("3. Actualizar usuario");
           System.out.println("4. Eliminar usuario");
           System.out.println("5. Salir");
           seleccion = Integer.parseInt(scanner.next());
           switch (seleccion){
               case 1:
                   List<Usuario> lista = control.seleccionar();
                   for (Usuario usuario1:lista
                        ) {
                       System.out.println(usuario1.toString());
                   }
                   break;
               case 2:
                   control.insertar(usuario);
                   break;
               case 3:
                   control.actualizar(usuario);
                   break;
               case 4:
                   control.Eliminar(usuario);
                   break;
           }
       } while (seleccion != 5);
    }
}
