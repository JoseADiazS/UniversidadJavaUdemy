package com.company;

public class BreakContinue {
    public static void main(String[] args) {

        /*for (int i = 0; i < 3; i++) {
            //Imprimir solo los numeros pares
            if (i % 2 == 0) {
                System.out.println("i = " + i);
                break;
            }
        }*/

        for (int i = 0; i < 3; i++) {
            //Imprimir solo los numeros pares
            if (i % 2 != 0) {
                continue;
            }
                System.out.println("i = " + i);
            }
        }

    }
