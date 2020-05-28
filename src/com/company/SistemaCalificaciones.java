package com.company;

import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Proporciona un valor entre 0 y 10: ");
        int valorNota = Integer.parseInt(scanner.nextLine());
        String nota = "";
        if (0 <= valorNota && valorNota < 6) {
            nota = "F";
        }else if(6 <= valorNota && valorNota < 7){
            nota ="D";
        }else if (7 <= valorNota && valorNota < 8){
            nota = "C";
        }else if (8 <= valorNota && valorNota < 9){
            nota = "B";
        }else if (9 <= valorNota && valorNota <= 10){
            nota = "A";
        }else{
            nota = "Valor desconocido";
        }

        System.out.println(nota);
    }
}

