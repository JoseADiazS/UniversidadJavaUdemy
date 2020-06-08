package negocio;

import datos.AccesoDatos;
import datos.AccesoDatosImpl;
import domain.Pelicula;
import excepciones.AccesoDatosEx;
import excepciones.EscrituraDatosEx;

public class CatalogoPeliculasImpl implements CatalogoPeliculas {
    AccesoDatos datos;
    @Override
    public void agregarPelicula(String nombrePelicula, String nombreArchivo) throws EscrituraDatosEx {
        datos.escribir(new Pelicula(nombrePelicula),nombreArchivo,true);
    }

    @Override
    public void listarPeliculas(String nombreArchivo) throws AccesoDatosEx {
        datos.listar(nombreArchivo);
    }

    @Override
    public void buscarPelicula(String nombreArchivo, String buscar) throws AccesoDatosEx {
        datos.buscar(nombreArchivo,buscar);
    }

    @Override
    public void iniciarArchivo(String nombreArchivo) throws EscrituraDatosEx {
        datos = new AccesoDatosImpl();
        datos.crear(nombreArchivo);
    }
}
