
package com.mycompany.extrap7;
public class Main {
    public static void main(String[] args) {
        System.out.println("============================ANIMAL===========================");   
      Animal ani = new Animal("tiburon","mexico","azul");
        System.out.println(ani);
        ani.comer();
        ani.sonido("muaaa");
        System.out.println("=============ANIMAL ACUATICO============================");
        System.out.println("=========================================");
        AnimalAcuatico n1= new AnimalAcuatico(3,"tiburon","mexico","azul");
        System.out.println(n1);
        n1.comer();
        n1.nadar();
        System.out.println("=========================================");
        Ballena b1= new Ballena(55,4, "yubarta", "marte","azul");
        System.out.println(b1);
        b1.pelearPinocho();
        b1.nadar();
        b1.sonido("buaaaaaa");
        System.out.println("=============ANIMAL TERRESTRE============================");
        System.out.println("=================================================");
        AnimalTerrestre n2= new AnimalTerrestre(4, "lobo", "mexico","cafe");
        System.out.println(n2);
        n2.correr();
        System.out.println("=========================================");
        Perro p1 = new Perro("azul",5, "scooby","brazil","cafe");
        System.out.println(p1);
        p1.sonido("wuaf");
        p1.trucos();
        System.out.println("=============ANIMAL AEREO============================");
         System.out.println("=========================================");
        AnimalAereo n3= new AnimalAereo(2, "aquila", "peru", "blanca");
        System.out.println(n3);
        n3.volar();
         System.out.println("=========================================");
        Pajaro pa = new Pajaro("pico",2,"colibri","canada","verde");
        System.out.println(pa);
        pa.ramas();
        pa.sonido("pio pio");
                
    }
    
}
