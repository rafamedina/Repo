public class Ordenador extends DispositivoBase{

    public void ejecutarPrograma(String programa){
        System.out.println(programa);
    }

    @Override
    public void encender() {
        System.out.println("Se encendio el ordenador");
        this.estaEncendido = true;
    }

    @Override
    public void apagar() {
        System.out.println("Se apago el ordenador");
        this.estaEncendido = false;
    }

    @Override
    public void mostrarEstado() {
        if(this.estaEncendido){
            System.out.println("El dispositivo esta encendido");
        } else {
            System.out.println("El dispositivo esta apagado");
        }

    }

}
