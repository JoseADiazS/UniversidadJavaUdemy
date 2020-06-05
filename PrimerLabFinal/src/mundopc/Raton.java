package mundopc;

public class Raton extends DispositivoEntrada{

    private int idRaton;
    private static int contadorRatones = 1;

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = contadorRatones;
        contadorRatones++;
    }

    public int getIdRaton() {
        return idRaton;
    }

    public void setIdRaton(int idRaton) {
        this.idRaton = idRaton;
    }

    public static int getContadorRatones() {
        return contadorRatones;
    }

    public static void setContadorRatones(int contadorRatones) {
        Raton.contadorRatones = contadorRatones;
    }

    public String toString(){
        return "El raton " + this.idRaton + " de tipo de entrada " + this.getTipoEntrada() + " y marca " +
                this.getMarca();
    }

}
