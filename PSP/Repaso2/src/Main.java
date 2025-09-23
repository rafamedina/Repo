//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Telefono telefono = new Telefono();
            telefono.encender();
            telefono.mostrarEstado();
            telefono.apagar();
            telefono.mostrarEstado();
            telefono.reailizarLLamada();


            Ordenador ordenador = new Ordenador();
            ordenador.encender();
            ordenador.mostrarEstado();
            ordenador.apagar();
            ordenador.mostrarEstado();
            ordenador.ejecutarPrograma("Ejecutando el word");


            Televisor televisor = new Televisor();
            televisor.encender();
            televisor.mostrarEstado();
            televisor.apagar();
            televisor.mostrarEstado();
            televisor.cambiarCanal(5);

        }
    }
