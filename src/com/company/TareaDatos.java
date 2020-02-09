package com.company;

import java.util.Scanner;

public class TareaDatos {

    public static void main(String[] args) {

        String nombre = "";
        int id = 0;
        double precio = 0.0;
        char simbolo = 0;
        boolean envioGratuito = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Proporciona el nombre: ");
        nombre = scanner.nextLine();
        System.out.println("Proporciona el id: ");
        id = scanner.nextInt();
        System.out.println("Proporciona el precio: ");
        precio = scanner.nextDouble();
        System.out.println("Proporciona el simbolo: ");
        simbolo = scanner.next().charAt(0);
        System.out.println("Proporciona el envio gratuito: ");
        envioGratuito = scanner.nextBoolean();

        System.out.println("Precio: " + simbolo + precio);
        System.out.println("Envio gratuito: " + envioGratuito);

    }
}
