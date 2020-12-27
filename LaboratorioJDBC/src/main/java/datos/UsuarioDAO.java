package datos;

import domain.Usuario;

import java.sql.*;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static datos.Conexion.*;

public class UsuarioDAO {
    private static final String SQL_SELECT = "SELECT id_usuario, usuario, password FROM usuario";
    private static final String SQL_INSERT = "INSERT INTO usuario(usuario, password) VALUES (?,?)";
    private static final String SQL_UPDATE = "UPDATE usuario SET id_usuario = ?, usuario = ?, password = ? WHERE " +
            "id_usuario = ?";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario = ?";

    public List<Usuario> seleccionar(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario = null;
        List<Usuario> usuarios = new ArrayList<>();

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()){
                int idUsuario = rs.getInt("id_usuario");
                String usr = rs.getString("usuario");
                String password = rs.getString("password");
                usuario = new Usuario(idUsuario,usr,password);
                usuarios.add(usuario);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace(System.out);
        }finally {
            try {
                close(rs);
                close(stmt);
                close(conn);
            } catch (SQLException throwables) {
                throwables.printStackTrace(System.out);
            }
        }
        return usuarios;
    }

    public int insertar(Usuario usuario){
        Connection conn = null;
        PreparedStatement stmt = null;
        Scanner scanner = new Scanner(System.in);
        int registro = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            System.out.println("Ingrese el usuario: ");
            usuario.setUsuario(scanner.next());
            System.out.println("Ingrese la password: ");
            usuario.setPassword(scanner.next());
            stmt.setString(1,usuario.getUsuario());
            stmt.setString(2,usuario.getPassword());
            registro = stmt.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace(System.out);
        }finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return registro;
    }

    public int actualizar(Usuario usuario){
        Connection conn = null;
        PreparedStatement stmt = null;
        Scanner scanner = new Scanner(System.in);
        int registro = 0;

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            System.out.println("Ingrese el # de Id del campo a actualizar: ");
            int actualiza = Integer.parseInt(scanner.next());
            System.out.println("Ingrese el nuevo Id: ");
            usuario.setIdUsuario(Integer.parseInt(scanner.next()));
            System.out.println("Ingrese el nuevo usuario: ");
            usuario.setUsuario(scanner.next());
            System.out.println("Ingrese la nueva password: ");
            usuario.setPassword(scanner.next());
            stmt.setInt(1, usuario.getIdUsuario());
            stmt.setString(2,usuario.getUsuario());
            stmt.setString(3,usuario.getPassword());
            stmt.setInt(4,actualiza);
            registro = stmt.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace(System.out);
        }finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException throwables) {
                throwables.printStackTrace(System.out);
            }
        }

        return registro;
    }

    public int Eliminar(Usuario usuario){
        Connection conn = null;
        PreparedStatement stmt = null;

        int registro = 0;

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el # de Id del campo a eliminar: ");
            usuario.setIdUsuario(Integer.parseInt(scanner.next()));
            stmt.setInt(1,usuario.getIdUsuario());
            registro = stmt.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException throwables) {
                throwables.printStackTrace(System.out);
            }
        }
        return registro;
    }

}
