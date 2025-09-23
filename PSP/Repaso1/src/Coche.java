public class Coche extends VehiculoTerrestre {

    boolean tieneAireAcondicionado;

    @Override
    public void acelerar() {
        this.velocidad += 10;
    }

    @Override
    public void frenar() {
        this.velocidad -= 5;
    }

    @Override
    public int obtenerVelocidad() {
        return this.velocidad;
    }

    public void __constructor(int velocidad, boolean aire) {
        this.velocidad = velocidad;
        this.tieneAireAcondicionado = aire;
    }

    public void cambiarAire() {
        if (this.tieneAireAcondicionado == true) {
            this.tieneAireAcondicionado = false;
            System.out.println("El aire esta desactivado");
        } else {
            this.tieneAireAcondicionado = true;
            System.out.println("El aire esta activado");
        }
    }

}
