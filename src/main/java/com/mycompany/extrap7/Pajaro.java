
package com.mycompany.extrap7;

public class Pajaro extends AnimalAereo {
    private String pico;

    public Pajaro(String pico, int alas, String nombre, String lugarOrigen, String color) {
        super(alas, nombre, lugarOrigen, color);
        this.pico = pico;
    }
    public Pajaro() {
    }
    public void ramas(){
        System.out.println("HAGO UNA CASA CON RAMAS");
    }

    public String getPico() {
        return pico;
    }

    public void setPico(String pico) {
        this.pico = pico;
    }

    @Override
    public String toString() {
        return super.toString()+"Pajaro{" + "pico=" + pico + '}';
    }
    
}
