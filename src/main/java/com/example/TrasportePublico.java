package com.example;

import java.util.Scanner;


public class TrasportePublico {
    public static void main(String[] args) {

   /*  Una persona en Medellín necesita calcular el tiempo total de viaje usando diferentes medios de transporte público. 
    Debe tomar un bus (20 minutos), luego el metro (15 minutos), y finalmente caminar (10 minutos). 
    Si hay tráfico pesado, el tiempo del bus se incrementa en 50%. Si llueve, el tiempo de caminar se incrementa en 100%.
     */

    Scanner sc = new Scanner (System.in);

    int bus = 20;
    int metro = 15;
    int caminar = 10;
  
    System.out.println("¿Vas a tomar el bus? (si/no): ");
    String busTiempo = sc.nextLine();

    System.out.println("¿Vas a tomar el metro? (si/no): ");
    String metroTiempo = sc.nextLine();

    System.out.println("¿Vas a caminar? (si/no): ");
    String caminarTiempo = sc.nextLine();

    if (busTiempo.equals("si") || metroTiempo.equals("si") || caminarTiempo.equals("si")) {
      System.out.println("el tiempo es del bus es de " + bus + metro + caminar + "") ;
      
    }

   
      
    }

    

} 

