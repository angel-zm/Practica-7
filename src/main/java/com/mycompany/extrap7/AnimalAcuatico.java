
package com.mycompany.extrap7;

public class AnimalAcuatico extends Animal {
    private int nAletas;

    public AnimalAcuatico(int nAletas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.nAletas = nAletas;
    }
    public void comer (){
        System.out.println("Hola, estoy comiendo");
    }
    public void nadar(){
        System.out.println("ESTOY NADANDO");
    }
    public int getnAletas() {
        return nAletas;
    }

    public void setnAletas(int nAletas) {
        this.nAletas = nAletas;
    }

    @Override
    public String toString() {
        return super.toString()+ "AnimalAcuatico{" + "nAletas=" + nAletas + '}';
    }
    
    
}

