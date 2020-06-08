package negocio;

import excepciones.AccesoDatosEx;
import excepciones.EscrituraDatosEx;

public interface CatalogoPeliculas {
    void agregarPelicula(String nombrePelicula, String nombreArchivo) throws EscrituraDatosEx;
    void listarPeliculas(String nombreArchivo) throws AccesoDatosEx;
    void buscarPelicula(String nombreArchivo, String buscar) throws AccesoDatosEx;
    void iniciarArchivo(String nombreArchivo) throws EscrituraDatosEx;
}
