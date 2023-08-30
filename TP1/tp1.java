package INFO3.TP1;

import java.util.Scanner;

class tp1 {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        int opcion;
        boolean b=true;
        do {
            // Mostrar opciones al usuario
            System.out.println("\n1- Factorial de n.");
            System.out.println("2- Suma de los primeros n enteros.");
            System.out.println("3- Calcular potencia de un numero base elevado a un exponente.");
            System.out.println("4- imprima un conteo regresivo desde un numero hasta 1.");
            System.out.println("5- Mostrar Historial.");
            System.out.println("0- Salir.");
            System.out.print("\nIngrese la opción: ");
            opcion = var.nextInt();

            // Declarar variables
            int n1 = 0;
            int base=0, exponente=0;

            // Realizar la acción correspondiente a la opción seleccionada
            switch (opcion) {
                case 1:
                    // Pedir entrada al usuario y calcular el factorial
                    n1 = pedirEntero();
                    System.out.println();
                    int factorial = calcfactorial(n1);
                    System.out.println(" = "+ factorial);
                    break;
                case 2:
                    // Pedir entrada al usuario y calcular la suma
                    n1 = pedirEntero();
                    System.out.println();
                    int suma = sumarecursiva(n1);
                    System.out.println(" = "+suma);
                    break;
                case 3:
                    // Pedir entrada al usuario y calcular la potencia
                    System.out.println("INGRESE PRIMERO LA BASE Y DESPUES EL EXPONENTE");
                    base = pedirEntero();
                    exponente = pedirEntero();
                    System.out.print(base+" ^ "+exponente+" : ");
                    int potencia = calcpotencia(base, exponente);
                    System.out.println(" = "+potencia);
                    break;
                case 4:
                    // Pedir entrada al usuario y realizar el conteo regresivo
                    n1 = pedirEntero();
                    System.out.println();
                    System.out.print("n = "+n1+" : ");
                    int cont = conteorecursivo(n1);
                    System.out.println(cont);
                    break;
                /*case 5:1
                    if (historial.isEmpty()) {
                        System.out.println("NO HAY NADA");
                    } else {
                        mostrarHistorial();
                    }
                    break;*/
            }
        } while (opcion != 0);
    }

    // Función para calcular el factorial de un número
    public static int calcfactorial (int n1) {
        if (n1 == 1){
            System.out.print(n1);
            return 1;
        } else {
            int prod = calcfactorial(n1-1);
            System.out.print(" * "+n1);
            return prod * n1;
        }
    }

    // Función para calcular la suma de los primeros n enteros
    public static int sumarecursiva (int n1) {
        if (n1 == 1){
            System.out.print(n1);
            return 1;
        } else {
            int sum = sumarecursiva(n1-1);
            System.out.print(" + "+n1);
            return sum + n1;
        }
    }

    // Función para pedir al usuario un número entero válido
    public static int pedirEntero (){
        boolean a = true;
        int n1=0;
        Scanner var = new Scanner(System.in);
        do {
            System.out.print("Ingrese el número entero: ");
            try {
                String n1a;
                n1a = var.nextLine();
                n1 = Integer.parseInt(n1a);
                a = false;
                break; // Sale del bucle si se ingresa un valor válido
            } catch (NumberFormatException  e) {
                System.out.println("Error: Ingrese un valor numérico válido.");
            }
        } while (a == true);
        return n1;
    }

    // Función para calcular la potencia de un número
    public static int calcpotencia(int base, int exponente) {
        //si el exponente es igual a 0 se devuelve 1
        //ya que cualquier número elevado a la potencia 0 es igual a 1
        if (exponente == 0){
            return 1;
        } else {
            System.out.print(base + " * ");
            int pot = calcpotencia(base, exponente - 1);
            return base * pot;
        }
    }

    // Función para realizar un conteo regresivo desde un número hasta 1
    public static int conteorecursivo (int n1) {
        if (n1 == 1){
            return 1;
        } else {
            System.out.print(n1 + " , ");
            int conteo = conteorecursivo(n1-1);
            return conteo;
        }
    }
}