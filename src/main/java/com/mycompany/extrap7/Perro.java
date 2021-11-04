
package com.mycompany.extrap7;


public class Perro extends AnimalTerrestre {
    private String collar;

    public Perro(String collar, int patas, String nombre, String lugarOrigen, String color) {
        super(patas, nombre, lugarOrigen, color);
        this.collar = collar;
    }

    public Perro() {
    }
    public void trucos(){
        System.out.println("HAGO TRUCOS");
    }

    public String getCollar() {
        return collar;
    }

    public void setCollar(String collar) {
        this.collar = collar;
    }

    @Override
    public String toString() {
        return super.toString()+"Perro{" + "collar=" + collar + '}';
    }
    
    
}
