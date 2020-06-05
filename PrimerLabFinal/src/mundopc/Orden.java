package mundopc;

import java.util.ArrayList;

public class Orden {
    private int idOrden;
    private ArrayList<Computadora> computadoras = new ArrayList<>();
    private static int contadorOrdenes = 1;

    public Orden(){
        this.idOrden = contadorOrdenes;
        contadorOrdenes++;
    }
    public void agregarComputadora(Computadora computadora){
        this.computadoras.add(computadora);
    }
    public void mostrarOrden(){
        System.out.println("La orden " + this.idOrden + " es: ");
        for (int i = 0; i < computadoras.size(); i++) {
            System.out.println(computadoras.get(i) + "\n");
        }
    }
}
