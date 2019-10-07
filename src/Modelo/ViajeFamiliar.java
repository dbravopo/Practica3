/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author INGESIS
 */
public class ViajeFamiliar extends Viaje {
    private int Familia;

    public ViajeFamiliar(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada, int familia) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
        this.Familia = familia;
    }

    public int getFamilia() {
        return Familia;
    }

    public void setFamilia(int Familia) {
        this.Familia = Familia;
    }
    

 @Override
 public String descripcion() {
 return "Viaje para disfrutar con toda tu familia";
 }
 @Override
 public String cualquierMetodo2() {
 return "Método implementado en la clase hija viaje familiar";
 }
}
