abstract class VehiculoTerrestre implements Vehiculo {
    int velocidad;
    int ruedas;

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getRuedas() {
        return ruedas;
    }
}
