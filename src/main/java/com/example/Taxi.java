package com.example;

import java.util.Scanner;

public class Taxi {
    public static void main(String[] args) {

        // se delcaran las variables
        int tarifaBse = 4000;
        int valorKilometro = 800;
        int valorMinuto = 150;

        // llama el scanner por q se va a pedir informacion a la persona
        Scanner sc = new Scanner(System.in);

        //distancia recorrida
        System.out.println("ingrese  la distancia a recorrer: KM");
        double distancia = sc.nextDouble();

        // precio de la distancia recorrida 
        double precioDistanciaRecorrida =  distancia * valorKilometro;
        System.out.println("el precio por la distancia es de $" + String.format("%.1f" , precioDistanciaRecorrida));

        System.out.println("ingrese el tiempo de espera en el trafico de la ciudad: Min");
        double timepoEspera = sc.nextDouble();

        // tiempo en dinero del tiempo de espera
        double precioTiempoEspera = timepoEspera * valorMinuto;
        System.out.println("valor en tiempo de espera: $" + precioTiempoEspera);

        //total a pagar 
        double precioTotal =tarifaBse + precioDistanciaRecorrida + precioTiempoEspera;
        System.out.println("el valor del viaje es de : " + precioTotal);

         
    }
}