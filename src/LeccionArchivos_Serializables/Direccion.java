/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeccionArchivos_Serializables;

import java.io.Serializable;

/**
 *
 * @author ISTLOJJA
 */
public class Direccion  implements Serializable {
    private String ciudad;
    private String calle;
    private int numeroCasa;

    public Direccion() {
    }

    public Direccion(String ciudad, String calle, int numeroCasa) {
        this.ciudad = ciudad;
        this.calle = calle;
        this.numeroCasa = numeroCasa;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }
            
    
}
