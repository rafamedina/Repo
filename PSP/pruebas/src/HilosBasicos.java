
class HilosBasicos implements Runnable {
    private String nombre;

    public HilosBasicos(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(nombre + "esta en ejecucion: " + i);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(nombre + " ha terminado.");
    }
    public static void main(String[] args) {
    Thread hilo1 = new Thread(new HilosBasicos("Hilo1"));
    Thread hilo2 = new Thread(new HilosBasicos("Hilo2"));
    hilo1.start();
    hilo2.start();


    try{
        hilo1.join();
        hilo2.join();
    }catch(InterruptedException e){
        e.printStackTrace();
    }
        System.out.println("Todos los hilos han terminado");
    }
}


