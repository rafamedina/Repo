
using System.ComponentModel;
using System.ComponentModel.Design;
using System.Runtime.CompilerServices;

class Program
{
    static List<double> numeros = new List<double>();

    static void Main()
    {
        Console.WriteLine("=== Analizador de Números ===");
        double num1 = 0, num2 = 0;
        bool programa = true;
        while (programa == true)
        {
           int eleccion = Menu();
            switch (eleccion)
            {
                case 1:
                    PedirNumeros();
                    break;
                case 2:       
                     double global = 0;
                    foreach( double num in  numeros)
                    {
                       
                        global = global + num;
                        
                    }
                    Console.WriteLine($"La suma es de: {global}");
                    break;
                case 3:
                    double global2 = 0;
                    int i = 0;
                    foreach (double num in numeros)
                    {

                        i = i + 1;
                        
                        global = global2 + num;
                        
                    }
                    double media = global2 / i;
                    Console.WriteLine($"La media es: {media}");
                    break;

                case 4:
                    double minimo = double.MaxValue;
                    foreach (double num in numeros)
                    {
                        if (num < minimo)
                        {
                            minimo = num;
                        }
                    }
                    Console.WriteLine("El valor mínimo es: " + minimo);
                    break;

                case 5:
                    double maximo = double.MinValue;
                    foreach (double num in numeros)
                    {
                        if (num > maximo)
                        {
                            maximo = num;
                        }
                    }
                    Console.WriteLine("El valor máximo es: " + maximo);
                    break;

                case 6:
                    programa = false;
                    break;




            }

        }
        
    }


    public static int Menu()
    {
        Console.WriteLine("(1) Leer números");
        Console.WriteLine("(2) Calcular suma");
        Console.WriteLine("(3) Calcular media");
        Console.WriteLine("(4) Calcular mínimo");
        Console.WriteLine("(5) Calcular máximo");
        Console.WriteLine("(6) Salir");
        Console.WriteLine("Que elecion haces: ");
        int eleccion = int.Parse(Console.ReadLine());
        return eleccion;
    }
    public static void PedirNumeros()
    {
        numeros.Clear();
        Console.WriteLine("Introduce números (0 para terminar):");
        while (true)
        {
            double num = filtro();
            if (num == 0)
                break;
            numeros.Add(num);
        }
    }

    public static double filtro()
    {
        while (true)
        {
            Console.WriteLine("Dame un número:");
            string input = Console.ReadLine();
            double num;
            if (double.TryParse(input, out num))
            {
                return num;
            }
            else
            {
                Console.WriteLine("Error: Debes escribir un número (puede tener decimales con punto). Intenta de nuevo.");
            }
        }
    }
}
