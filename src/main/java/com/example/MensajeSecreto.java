package com.example;



public class MensajeSecreto {
    public static void main(String[] args) {

        String mensaje = "H0l4  MUnD0,  3st0  3s  Un  m3ns4j3  s3cr3t0";

        // dice el ejer se debe traducir el mensaje y poner sin tanto espacio y q sea en minuscula


        // con el metodo replace se cambia el 0 por la letra "o"
        String remplace = mensaje.replace("0" ,"o" );
        System.out.println(remplace);


        // acá lo mismo pero el 3 por la e  y abajo el 4 por la a
        String remplance2 = remplace.replace("3", "e");
        System.out.println(remplance2);

        String remplance3 = remplance2.replace("4", "a");
        System.out.println(remplance3);

        // acá se pone todo en minuscula con toLowercase y se quitan los espacios con ralaceAll
        String resultadoFinal = remplance3.toLowerCase().replaceAll("  ", " ");
        System.out.println(resultadoFinal);

    }
}
