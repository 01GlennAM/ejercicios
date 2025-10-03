package com.example;

import java.lang.Math;

public class ClaseMath{
    public static void main(String[] args) {


// no funciona en las oepraciones simples
/* int suma = Math.add(1, 2); // Suma 1 y 2, resultado: 3
int resta = Math.subtract(5, 3); // Resta 3 de 5, resultado: 2
int producto = Math.multiply(4, 5); // Multiplica 4 por 5, resultado: 20
int division = Math.divide(10, 2); // Divide 10 entre 2, resultado: 5 */
double potencia = Math.pow(2, 3); // Eleva 2 a la potencia 3, resultado: 8
System.out.println(potencia);
double raizCuadrada = Math.sqrt(9); // Calcula la raíz cuadrada de 9, resultado: 3
System.out.println(raizCuadrada);

double seno = Math.sin(Math.PI / 2); // Calcula el seno de 90 grados, resultado: 1
System.out.println(seno);
double coseno = Math.cos(Math.PI); // Calcula el coseno de 180 grados, resultado: -1
System.out.println(coseno);
double tangente = Math.tan(Math.PI / 4); // Calcula la tangente de 45 grados, resultado: 1
System.out.println(tangente);


// estas son de comparación
int min = Math.min(1, 2); // Devuelve el mínimo entre 1 y 2, resultado: 1
System.out.println(min);
int max = Math.max(1, 2); // Devuelve el máximo entre 1 y 2, resultado: 2
System.out.println(max);
int abs = Math.abs(-5); // Devuelve el valor absoluto de -5, resultado: 5
System.out.println(abs);
    
    }
} 
