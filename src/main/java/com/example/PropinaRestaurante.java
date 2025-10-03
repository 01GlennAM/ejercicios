package com.example;

import java.util.Scanner;

public class PropinaRestaurante {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese el valor de la cuenta $: ");
        double valorCuenta = sc.nextDouble();

        System.out.println("puede dejar propina de  5%, del 10% o del 15%: ");
        double porsentajePropina = sc.nextDouble();

        double conversionPropina = porsentajePropina / 100;
        System.out.println("porsentaje de la propina: " + conversionPropina);

        double valorPropina = conversionPropina * valorCuenta;
        System.out.println("valor de la propina: $ " + String.format("%.3f", valorPropina)); // se una String.forma para mostrar la cantidad de decimales q quieres

        double valorTotal = valorCuenta + valorPropina;
        System.out.println("total a pagar: " + valorTotal);

         
    }
}