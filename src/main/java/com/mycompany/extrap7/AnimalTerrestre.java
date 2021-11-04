
package com.mycompany.extrap7;


public class AnimalTerrestre extends Animal{
    private int patas;

    public AnimalTerrestre(int patas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.patas = patas;
    }
    public void correr(){
        System.out.println("estoy corriendo");
    }
    public void comer (){
        System.out.println("Hola, estoy comiendo");
    }
    public AnimalTerrestre() {
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    @Override
    public String toString() {
        return super.toString()+"AnimalTerrestre{" + "patas=" + patas + '}';
    }
    
    
}
