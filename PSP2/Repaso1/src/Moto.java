public class Moto extends VehiculoTerrestre {
    boolean tieneCasco;

    @Override
    public void acelerar() {
        this.velocidad += 20;
    }

    @Override
    public void frenar() {
        this.velocidad -= 10;
    }

    @Override
    public int obtenerVelocidad() {
        return this.velocidad;
    }

    public void __constructor(boolean casco) {
        this.tieneCasco = casco;
    }

    public void comprobarCasco() {
        if (this.tieneCasco == true) {
            System.out.println("El casco esta puesto");
        } else {
            System.out.println("El casco no esta puesto");
        }
    }

}
