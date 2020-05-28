public class PruebaAritmetica {
    public static void main(String[] args) {
        //Crear objeto de la clase Aritmetica
        Aritmetica a = new Aritmetica();

        System.out.println("Resultado de la suma es: " + a.sumar(5,3));
        System.out.println("Resultado de la resta es: " + a.restar(5,3));
        System.out.println("Resultado de la multiplicacion es: " + a.multiplicar(5,3));
        System.out.println("Resultado de la division es: " + a.dividir(10,2));
    }
}
