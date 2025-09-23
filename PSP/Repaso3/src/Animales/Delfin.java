package Animales;

import Abstracta.AnimalBase;
import Interfaces.Nadador;

public class Delfin extends AnimalBase implements Nadador {



    public Delfin(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void nadar() {
        System.out.println("El " + this.nombre + " esta nadando");
    }
}
