package datos;

import domain.Pelicula;
import excepciones.AccesoDatosEx;
import excepciones.EscrituraDatosEx;

import java.util.List;

public interface AccesoDatos {
    boolean existe(String nombreArchivo) throws AccesoDatosEx;
    List<Pelicula> listar(String nombre) throws AccesoDatosEx;
    void escribir(Pelicula pelicula, String nombreArchivo, Boolean anexar) throws EscrituraDatosEx;
    String buscar(String nombreArchivo, String buscar) throws AccesoDatosEx;
    void crear(String nombreArchivo) throws EscrituraDatosEx;
    void borrar(String nombreArchivo);
}
