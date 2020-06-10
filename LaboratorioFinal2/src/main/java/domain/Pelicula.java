package domain;

/**
 * REpresenta los objetos pelicula utilizados en la aplicacion catalogo de peliculas.
 */
public class Pelicula {
    /**
     * Atributo nombre de la clase pelicula
     */
    private String nombre;

    //Metodos contructores

    /**
     * Constructor vacio de la clase pelicula
     */
    public Pelicula(){}

    /**
     * Constructor de la clase pelicula.
     * @param nombre Nombre de la pelicula
     */
    public Pelicula(String nombre){
        this.nombre = nombre;
    }

    /**
     * Metodo getter de el atributo Nombre
     * @return Nombre de la pelicula
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo setter de el atributo Nombre
     * @param nombre Nombre de la pelicula
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Sobrescritura del metodo toString para la clase Pelicula
     * @return Mensaje: La pelicula es: + Nombre de la pelicula
     */
/*    @Override
    public String toString() {
        return "La pelicula es: " + this.getNombre();

    }*/
}
