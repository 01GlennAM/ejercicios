package com.example;

import java.util.Scanner;

public class Dia {
    public static void main(String[] args) {
        System.out.println("Ejercicio 1");

        // importo al llamo al scanner y luego creo un objeto de el con el new
 
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese un dia de la semana:");
        String dia = sc.nextLine();

        switch (dia) {
            case "lunes": 
            System.out.println(1);
                break;

            case "martes":
            System.out.println(2);
                break;

            case "miercoles":
            System.out.println(3);
                break;

            case "jueves":
            System.out.println(4);
                break;

            case "viernes":
            System.out.println(5);
                break;

            case "sabado":
            System.out.println(6);
                break;

            case "domingo":
            System.out.println(7);
                break;
        
            default:
            System.out.println("el dia no existe:");
                break;
        }
         
    }
}
