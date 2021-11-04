
package com.mycompany.extrap7;

public class Ballena extends AnimalAcuatico{
    private int largo;

    

    public Ballena(int largo, int nAletas, String nombre, String lugarOrigen, String color) {
        super(nAletas, nombre, lugarOrigen, color);
        this.largo = largo;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
    
    
    public void pelearPinocho(){
        System.out.println("hola peleo con pinocho");
    }

    @Override
    public String toString() {
        return super.toString()+ "Ballena{" + "largo=" + largo + '}';
    }
    
    
    
    
}
