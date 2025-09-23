public class Telefono extends DispositivoBase {



public void reailizarLLamada(){
    System.out.println("Realizando llamada...");
}


    @Override
    public void encender() {
        System.out.println("Se encendio el telefono");
        this.estaEncendido = true;
    }

    @Override
    public void apagar() {
        System.out.println("Se apago el telefono");
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

