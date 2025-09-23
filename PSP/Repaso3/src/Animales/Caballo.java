package Animales;

import Abstracta.AnimalBase;
import Interfaces.*;

public class Caballo extends AnimalBase implements Terrestre {
    public Caballo(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void correr() {
        System.out.println("El " + this.nombre + " esta corriendo");
    }
}

