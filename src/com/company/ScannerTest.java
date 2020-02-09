package com.company;

import java.util.Scanner;

public class ScannerTest {


    public static void main(String[] args) {
        // write your code here
       Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de Usuario");
        var usuario = scanner.nextLine();
        System.out.println("Usuario = "+usuario);
    }
}
