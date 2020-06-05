package mundopc;

public class Monitor {
    private int idMonitor;
    private String marca;
    private double tamaño;
    private static int contadorMonitores = 1;

    public Monitor(){
        idMonitor = contadorMonitores;
        contadorMonitores++;
    }
    public Monitor(String marca, double tamaño){
        this.marca = marca;
        this.tamaño = tamaño;
        idMonitor = contadorMonitores;
        contadorMonitores++;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public void setIdMonitor(int idMonitor) {
        this.idMonitor = idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public static int getContadorMonitores() {
        return contadorMonitores;
    }

    public static void setContadorMonitores(int contadorMonitores) {
        Monitor.contadorMonitores = contadorMonitores;
    }

    public String toString(){
        return "El monitor " + this.idMonitor + " con tamaño de " + this.getTamaño() + " pulgadas y marca " +
                this.getMarca();
    }
}
