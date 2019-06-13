/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.util.Scanner;

/**
 *
 * @author ISTLOJJA
 */
public class dialaborable {
    public static void main(String[] args) {
        Scanner  entrada = new  Scanner(System .in);
        String m;
        System.out.println("ingrese por favor un dia de la semana");
        m = entrada.nextLine();
        if ( m.equals ("lunes") ||m.equals ("martes")||m.equals ("miercoles")|| m.equals ("jueves")|| m.equals ("viernes")){
            System.out.println("este dia es laborable ");
        }else{
            if ( m.equals ("sabado") ||m.equals ("domingo")){
                System.out.println("este dia es de descanzo");
                
                
            }System.out.println("este  dia no se encuentra en la semana ESCRIBE BIEN"); 
    
            
          
        }
           
    }
    
}
