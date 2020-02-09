package com.company;

import java.util.Scanner;

public class ScannerTest {


    public static void main(String[] args) {
        // write your code here
       Scanner scanner = new Scanner(System.in);

        System.out.println("Proporciona el titulo: ");
        var titulo = scanner.nextLine();
        System.out.println("Proporciona el autor: ");
        var autor = scanner.nextLine();
        System.out.println(titulo + " fue escrito por" + autor);
    }

}
