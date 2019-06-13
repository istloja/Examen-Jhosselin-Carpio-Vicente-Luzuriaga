/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author ISTLOJJA
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = "la maravilla";
        int index1 = 1;
        int index = cadena.indexOf("g");
//                System.out.println(index);
//                System.out.println(cadena.concat("hola que "));
//                System.out.println(cadena);
//                System.out.println(cadena.contains("aeiou"));
        // el contains te devuelve si es true o false//para saber 
        //si un texto esta en otro texto y te dixce esi esta es tru4e si no es false//
        int contarA = 0;
        String buscar = "Aa";
        for (int i = 0; i < cadena.length(); i++) {
            if (buscar.contains(cadena.charAt(i) + "posición" + i)) {
                System.out.println(" encontre una A");
                contarA++;
            } else {
                System.out.println("no encontre una A");
            }
            System.out.println("el numero total de A  es" + contarA);

        }

    }

}
