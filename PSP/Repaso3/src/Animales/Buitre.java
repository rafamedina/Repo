package Animales;

import Abstracta.AnimalBase;
import Interfaces.Volador;

public class Buitre extends AnimalBase implements Volador {
    public Buitre(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void volar() {
        System.out.println("El " + this.nombre + " esta Volando");
    }
}
