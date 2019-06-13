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
public class NewClass {
    public static void main(String[] args) {
       
        String cadena = "john puglla";
        int index =cadena.indexOf("o");
        String vocales = "AEIOUaeiou";
        String consonantes = "SFHRAEOPqwrstypsdfghojulñmnbvcxz";
        int contarvocales = 0, contarconsonantes =0;
        for (int i=0; i< cadena.length(); i++){
            if (vocales.contains(cadena.charAt(i)+ "")){
                contarvocales++;
                
            }
            if (consonantes .contains (cadena.charAt(i)+ "")){
                contarconsonantes++;
                
            }
            System.out.println("vocales"+contarvocales+"consonantes"+contarconsonantes);
        }
        
   
