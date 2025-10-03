package com.example;


public class ControlInventario
 {
    public static void main(String[] args) {

       /*  Un mercado en Cartagena necesita controlar su inventario de frutas. Cada día se venden diferentes cantidades y 
        llegan nuevos productos. Si el inventario de alguna fruta baja de 10 unidades, se debe hacer un pedido de 50 unidades.
        Simula una semana de ventas y reposición. */


        // creo q se puede resolver así, he igual se puede mejorar mucho mas 

        int pera = 10;
        int manzana = 10;

        if (pera < 10 ) {
            System.out.println("hacer pedido de pera + 50 ");
        } else{
            System.out.println("tenemos buen stock de peras ");
        }

        if (manzana < 10) {
            System.out.println("hacer un pedio de manzanas + 50");
            
        }else {
            System.out.println("tenemos buen stock de manzanas");
        }

         
    }
}