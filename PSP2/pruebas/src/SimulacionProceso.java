public class SimulacionProceso {
    enum Estado {
        LISTO, EJECUCION, BLOQUEADO, TERMINADO
    }

    public static void SimularProcesos(){
    Estado estado = Estado.LISTO;
        System.out.println("Estado inicial: " + estado);

        estado = Estado.EJECUCION;
        System.out.println("Proceso en ejecución.. Estado actual: " + estado);

        estado = Estado.BLOQUEADO;
        System.out.println("proceso bloqueado.. Esperando un recurso. Estado actual: " + estado);

        estado = Estado.LISTO;
        System.out.println("Recurso disponible. Estado actual: " + estado);

        estado = Estado.TERMINADO;
        System.out.println("Proceso terminado. Estado actual:  "+ estado);
    }

    public static void main(String[] args) {
        System.out.println("Simulando el primer proceso");
        SimularProcesos();
        System.out.println("Simulando segundo proceso");
        SimularProcesos();

    }

}