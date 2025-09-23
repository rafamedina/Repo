import org.w3c.dom.ls.LSOutput;

import java.io.File;

public class Prueba {
    public static void main(String[] args) {
            String base = System.getProperty("user.dir");
            String sep = File.separator;

            String rutaAbsoluta = (base + sep + "datos" + sep + "Ejemplo.txt");
            System.out.println("Ruta generada: " + rutaAbsoluta);

            File archivo = new File(rutaAbsoluta);
            System.out.println("¿Existe el archivo? "+archivo.exists());
        }
    }



