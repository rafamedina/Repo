//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        try{
            Process proceso = Runtime.getRuntime().exec("calc.exe");
            System.out.println("Proceso lanzado: calculadora");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}