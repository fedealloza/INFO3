package INFO3.TP3;

import java.util.Random;
import java.util.Scanner;

public class tp3 {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        int opcion;
        
        do {
            // Mostrar opciones al usuario
            System.out.println("\n1- Implementacion de una pila.");
            System.out.println("2- Comprobacion palindromos.");
            System.out.println("3- Expresiones matematicas.");
            System.out.println("4- Implementacion de una cola.");
            System.out.println("5- Ordenar una cola.");
            System.out.println("0- Salir.");
            System.out.print("\nIngrese la opción: ");
            opcion = var.nextInt();

        
            switch (opcion) {
                case 1:

                break;
                case 2:

                break;
                case 3:

                break;
                case 4:

                break;
                case 5:

                break;
            }       
        } while (opcion != 0);
    }
}
