
public class Televisor extends DispositivoBase{

    public void cambiarCanal(int canal){
        System.out.println("Se cambio al canal " + canal);
    }


    @Override
    public void encender() {
        System.out.println("Se encendio la tele");
        this.estaEncendido = true;
    }

    @Override
    public void apagar() {
        System.out.println("Se apago la tele");
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
