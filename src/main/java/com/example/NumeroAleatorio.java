package com.example;


public class NumeroAleatorio {
    public static void main(String[] args) {

        // para generar numero aleatorio entre un numero espesifico y otro se usan variables

        int numeroMenor = 1;
        int numeroMayor = 100;
        int amplitud = numeroMayor - numeroMenor; // siempre poner acá el numero mayor primero de lo contrario da numeros negativos

        double numeroAleatorio = Math.random(); // Genera un número aleatorio entre 0.0 y 1.0
        int numeroFinal = (int) (numeroAleatorio * amplitud) - numeroMenor;
        System.out.println("numero aleatorio entre: " + numeroMenor + " y " + numeroMayor + " el numero aleatorio es:" + numeroFinal);

    }
}