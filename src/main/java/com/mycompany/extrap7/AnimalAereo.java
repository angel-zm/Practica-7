
package com.mycompany.extrap7;

public class AnimalAereo extends Animal{
    private int alas;

    public AnimalAereo(int alas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.alas = alas;
    }
    public AnimalAereo() {
    }
    
    public void volar(){
        System.out.println("ESTOY VOLANDO");
    }
     public void comer (){
        System.out.println("Hola, estoy comiendo");
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    @Override
    public String toString() {
        return super.toString()+"AnimalAereo{" + "alas=" + alas + '}';
    }
     
    
}
