
import Animales.*;
import Interfaces.Volador;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Caballo caballo = new Caballo("Perico", 15);
        caballo.hacerSonido();
        caballo.comer();
        caballo.mostrarEdad();
        caballo.correr();

        Delfin delfin = new Delfin("Rulfo", 7);
        delfin.hacerSonido();
        delfin.comer();
        delfin.mostrarEdad();
        delfin.nadar();

        Buitre buitre = new Buitre("Buitrin", 14);
        buitre.hacerSonido();
        buitre.comer();
        buitre.mostrarEdad();
        buitre.volar();


    }

}

