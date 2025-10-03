package com.example;


public class Notas {
    public static void main(String[] args) {

        // crear un programa para medir el promedio gana con 3.0

        double nota1 = 3.5;
        double nota2 = 3.8;
        double nota3 = 4.0;

        // claculo el promedio/ se divide sibre 3 por q ese es el promedio
        double promedio = (nota1 + nota2 + nota3 ) /3; 
        System.out.println(String.format("%.2f", promedio));
        

        if (promedio >= 3.5) {
            System.out.println("el alumno aprovo ");
            
        }else {
            System.out.println("no aprovo");
        }
         
    }
}