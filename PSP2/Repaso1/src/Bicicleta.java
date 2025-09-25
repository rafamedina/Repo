public class Bicicleta extends VehiculoTerrestre {
    boolean tieneTimbre;

    @Override
    public void acelerar() {
        this.velocidad += 5;
    }

    @Override
    public void frenar() {
        this.velocidad += 2;
    }

    @Override
    public int obtenerVelocidad() {
        return this.velocidad;
    }

    public void __constructor(boolean timbre) {
        this.tieneTimbre = timbre;
    }

    public void usarTimbre() {
        this.tieneTimbre = true;
        System.out.println("Timbre usado");
    }
}
