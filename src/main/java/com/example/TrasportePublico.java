package com.example;

import java.util.Scanner;


public class TrasportePublico {
    public static void main(String[] args) {

   /*  Una persona en Medellín necesita calcular el tiempo total de viaje usando diferentes medios de transporte público. 
    Debe tomar un bus (20 minutos), luego el metro (15 minutos), y finalmente caminar (10 minutos). 
    Si hay tráfico pesado, el tiempo del bus se incrementa en 50%. Si llueve, el tiempo de caminar se incrementa en 100%.
     */

    Scanner sc = new Scanner (System.in);

    
    int tiempoToltal = 0;
    int bus = 20;
    int metro = 15;
    int caminar =10;
    int tiempoToltalTraficoPesado = 0;
    int tiempoToltalBajoLluvia = 0;
    double trafico = 1.5;
    double lluvia = 2;


    // tiempo en bus  20 minutos
    System.out.println("¿Vas a tomar el bus? (si/no): ");
    String busTiempo = sc.nextLine();
    if (busTiempo.equals("si")) {
      tiempoToltal += bus;

    }
  
    //tiempo en metro 15m
    System.out.println("¿Vas a tomar el metro? (si/no): ");
    String metroTiempo = sc.nextLine();
    if (metroTiempo.equals("si")) {
      tiempoToltal += metro;
      
    }
    

    // tiempo caminando 10m
    System.out.println("¿Vas a caminar? (si/no): ");
    String caminarTiempo = sc.nextLine();
    if (caminarTiempo.equals("si")) {
      tiempoToltal += caminar;
    }
    
  
    // si hay trafico se suma el 50%
    System.out.println("¿hay trafico pesado? (si/no): ");
    String traficoPesado = sc.nextLine();
    if (traficoPesado.equals("si") && busTiempo.equals("si")) {
      tiempoToltalTraficoPesado += bus * trafico;
       System.out.println("si hay trafico pesado en el bus te demoras  " + (tiempoToltal + tiempoToltalTraficoPesado) + " minutos mas"); 
    }

     // si hay lluvia y camina entonces 100% 
    System.out.println("¿hay lluvia? (si/no): ");
    String lluviaTiempo = sc.nextLine();
    if (lluviaTiempo.equals("si") && caminarTiempo.equals("si")) {
      tiempoToltalBajoLluvia += caminar * lluvia;
       System.out.println("si te toca caminar  " + (tiempoToltal +tiempoToltalBajoLluvia) + " minutos"); 

     

    }
      
  System.out.println("el tiempo total es de  " + tiempoToltal + " minutos en tiempo normal");
 

  }
}
  



