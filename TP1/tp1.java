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
            System.out.println("2- Sumar los primeros n enteros.");
            System.out.println("3- Calcular potencia de un numero base elevado a un exponente.");
            System.out.println("4- Imprimir un conteo regresivo desde un numero hasta 1.");
            System.out.println("5- Calcular el producto de dos numeros enteros usando sumas sucesivas.");
            System.out.println("6- Imprimir los elementos de un arreglo en orden inverso.");
            System.out.println("7- Devolver el numero de unos en la representacion binaria de N.");
            System.out.println("0- Salir.");
            System.out.print("\nIngrese la opción: ");
            opcion = var.nextInt();

            // Declarar variables
            int n1 = 0, n2=0, base=0, exponente=0;
            int[] arreglo = {1, 2, 3, 4, 5};
        
            switch (opcion) {
                case 1:
                    n1 = pedirEntero();
                    System.out.println();
                    int factorial = calcfactorial(n1);
                    System.out.println(" = "+ factorial);
                    break;
                case 2:
                    n1 = pedirEntero();
                    System.out.println();
                    int suma = sumarecursiva(n1);
                    System.out.println(" = "+suma);
                    break;
                case 3:
                    System.out.println("INGRESE PRIMERO LA BASE Y DESPUES EL EXPONENTE");
                    base = pedirEntero();
                    exponente = pedirEntero();
                    System.out.print(base+" ^ "+exponente+" : ");
                    int potencia = calcpotencia(base, exponente);
                    System.out.println(" = "+potencia);
                    break;
                case 4:
                    n1 = pedirEntero();
                    System.out.println();
                    System.out.print("n = "+n1+" : ");
                    int cont = conteorecursivo(n1);
                    System.out.println(cont);
                    break;
                case 5:
                    n1 = pedirEntero();
                    n2 = pedirEntero();
                    System.out.print(n1+" x "+n2+" : ");
                    int producto = prodenteros(n1, n2);
                    System.out.println(" = "+producto);
                    break;
                case 6:
                    System.out.println();
                    imprimirEnOrdenInverso(arreglo, arreglo.length - 1);
                    System.out.println();
                    break;
                case 7:
                    n1 = pedirEntero();
                    System.out.println();
                    int cantidadUnos = contarUnosBinarios(n1);
                    System.out.println("Cantidad de unos en la representación binaria de " + n1 + ": " + cantidadUnos);
                    System.out.println();
                    break;
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

    
    public static int prodenteros(int n1, int n2) {
        if (n2 == 0) {
            return 0;
        } else {
            System.out.print(n1 + " + "); // Imprime el número actual
            int prod = prodenteros(n1, n2 - 1); // Llamada recursiva con n2 disminuido en 1
            return n1 + prod; // Retorna la suma del número actual y el resultado de la llamada recursiva
        }
    }

    public static void imprimirEnOrdenInverso(int[] arreglo, int indice) {
        // Si el índice es mayor o igual a cero
        if (indice >= 0) {
            // Imprimir el elemento en el índice actual del arreglo
            System.out.print(arreglo[indice] + " , ");
            
            // Llamar recursivamente a la función con un índice menor
            imprimirEnOrdenInverso(arreglo, indice - 1);
        }
    }

    public static int contarUnosBinarios(int n1) {
        //Si el número es 0, no hay unos en su representación binaria
        if (n1 == 0) {
            return 0;
        } else {
            //Si el número es impar, se divide entre 2 y se suma 1 al resultado recursivo
            if (n1 % 2 == 1) {
                return contarUnosBinarios(n1 / 2) + 1;
            } else {
                //Si el número es par, simplemente se divide entre 2 y se obtiene el resultado recursivo
                return contarUnosBinarios(n1 / 2);
            }
        }
    }

}