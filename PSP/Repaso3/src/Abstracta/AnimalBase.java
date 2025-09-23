package Abstracta;

import Interfaces.Animal;

public abstract class AnimalBase implements Animal {

    protected String nombre;
    protected int edad;

    @Override
    public void comer() {

        System.out.println("El " + this.nombre + " esta comiendo");

    }

    @Override
    public void mostrarEdad() {
        System.out.println("el " + this.nombre +" tiene " + this.edad + " años");
    }

    @Override
    public void hacerSonido() {
        System.out.println("El " + this.nombre + " esta haciendo ruido");
    }


    public AnimalBase(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
}
