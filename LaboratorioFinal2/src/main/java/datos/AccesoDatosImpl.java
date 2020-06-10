package datos;

import domain.Pelicula;
import excepciones.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AccesoDatosImpl implements AccesoDatos {
    @Override
    public boolean existe(String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombre) throws LecturaDatosEx{
        File archivo = new File(nombre);
        List<Pelicula> peliculas = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = br.readLine();
            while (linea != null){
                Pelicula pelicula = new Pelicula(linea);
                peliculas.add(pelicula);
                linea = br.readLine();
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return peliculas;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, Boolean anexar) throws EscrituraDatosEx{
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(archivo,anexar));
            pw.println(pelicula.getNombre());
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String buscar(String nombreArchivo, String buscar) throws AccesoDatosEx{
        File archivo = new File(nombreArchivo);
        List<Pelicula> peliculas = new ArrayList<>();
        String resultado = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = br.readLine();
            while (linea != null){
                peliculas.add(new Pelicula(linea));
            }
            for (int i = 0; i < peliculas.size(); i++) {
                if (peliculas.get(i).getNombre().equals(buscar)){
                    resultado = peliculas.get(i).toString();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    @Override
    public void crear(String nombreArchivo) throws EscrituraDatosEx{
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter pr = new PrintWriter(archivo);
            pr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void borrar(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        archivo.delete();
    }
}
