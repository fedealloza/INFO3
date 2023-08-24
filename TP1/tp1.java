package INFO3.TP1;

import java.util.Scanner;

class tp1 {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);

        int opcion;
        int n1=4;
        int base, exponente;
        boolean b;

        do {
            System.out.print("Ingrese el número 1: ");
            try {
                String baseaux;
                baseaux = var.nextLine();
                base = Integer.parseInt(baseaux);
                b = false;
                break; // Sale del bucle si se ingresa un valor válido
            } catch (NumberFormatException  e) {
                System.out.println("Error: Ingrese un valor numérico válido.");
            }
        } while (b == true);
        b=true;
        do {
            System.out.print("Ingrese el número 2: ");
            try {
                String exponenteaux;
                exponenteaux = var.nextLine();
                exponente = Integer.parseInt(exponenteaux);
                b = false;
                break; // Sale del bucle si se ingresa un valor válido
            } catch (NumberFormatException  e) {
                System.out.println("Error: Ingrese un valor numérico válido.");
            }
        } while (b == true);



        do {
            System.out.println("\n1- Factorial de 4.");
            System.out.println("2- Suma de los primeros n enteros.");
            System.out.println("3- Multiplicación.");
            System.out.println("4- División.");
            System.out.println("5- Mostrar Historial.");
            System.out.println("0- Salir.");
            System.out.print("\nIngrese la opción: ");
            opcion = var.nextInt();

            switch (opcion) {
                case 1:
                    int factorial = calcfactorial(n1);
                    System.out.println("El factorial de "+ n1 + " es: "+ factorial);
                    break;
                case 2:
                    int suma = sumarecursiva(n1);
                    System.out.println("La suma de 1+2+3+4 es: "+ suma);
                    break;
                case 3:
                        resultado = multiplicar(n1, n2);
                        System.out.println("La multiplicación es: " + resultado);
                        agregarResultado(resultado);
                        break;
                    case 4:
                        resultado = dividir(n1, n2);
                        System.out.println("El resultado de la división es: " + resultado);
                        agregarResultado(resultado);
                        break;
                    case 5:1
                        if (historial.isEmpty()) {
                            System.out.println("NO HAY NADA");
                        } else {
                            mostrarHistorial();
                        }
                        break;*/ 
                }
            } while (opcion != 0);
    }

    public static int calcfactorial (int n1) {
        if (n1 == 0){
            return 1;
        } else {
            return n1 * calcfactorial(n1-1);
        }
    }

    public static int sumarecursiva (int n1) {
        if (n1 == 0){
            return 1;
        } else {
            return n1 + calcfactorial(n1-1);
        }
    }

}