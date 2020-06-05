package Domain;

public class Division {
    private int numerado;
    private int denominador;

    public Division(int numerado, int denominador) throws OperacionExcepcion {
        if (this.denominador == 0) {
            throw new OperacionExcepcion("Denominador igual a cero");
        }
        this.numerado = numerado;
        this.denominador = denominador;
    }

    public void visualizarOperacion(){
        System.out.println("El resultado de la division es: "+ this.numerado / this.denominador);
    }

}


