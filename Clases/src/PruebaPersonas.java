public class PruebaPersonas {
    public static void main(String[] args) {

        // Creacion de un objeto de tipo persona
        Persona p1 = new Persona();
        //Atributos del objeto segun la clase Persona
        p1.nombre = "Jose";
        p1.apellido = "Diaz";
        //Llamamos al metodo desplegar nombres en la clase Persona
        p1.desplegarNombres();

        //Creacion de un segundo objeto de clase Persona
        Persona p2 = new Persona();
        //Atributos del objeto p2
        p2.nombre = "Wendy";
        p2.apellido = "Peñarete";
        //Llamamos al metodo dpslegar nombres de la persona 2
        p2.desplegarNombres();
    }
}
