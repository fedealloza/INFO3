package INFORMATICA3.Calc;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class DivisionCero extends Exception {
    public DivisionCero(String mensaje) {
        super(mensaje);
    }
}

public class Calc {

    private static List<Float> historial = new ArrayList<>();

    public static void main(String[] args) {

        Scanner var = new Scanner(System.in);

        int opcion;
        int n1 = null;
        Float n2 = null, resultado = null;
        boolean b=true;

        do {
            System.out.println("\n1- Suma.");
            System.out.println("2- Resta.");
            System.out.println("3- Multiplicación.");
            System.out.println("4- División.");
            System.out.println("5- Mostrar Historial.");
            System.out.println("0- Salir.");
            System.out.print("\nIngrese la opción: ");
            opcion = var.nextInt();

            try {
                switch (opcion) {
                    case 1:
                        resultado = sumar(n1, n2);
                        System.out.println("La suma es: " + resultado);
                        agregarResultado(resultado);
                        break;
                    case 2:
                        resultado = restar(n1, n2);
                        System.out.println("La resta es: " + resultado);
                        agregarResultado(resultado);
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
                    case 5:
                        if (historial.isEmpty()) {
                            System.out.println("NO HAY NADA");
                        } else {
                            mostrarHistorial();
                        }
                        break;
                }
            } catch (DivisionCero e) {
                System.out.println(e.getMessage());
            }

        } while (opcion != 0);

    }

    

    public static float restar(float n1, float n2) {
        float resultado = n1 - n2;
        return resultado;
    }

    public static float dividir(float n1, float n2) throws DivisionCero {
        if (n2 == 0) {
            throw new DivisionCero("Error: No se puede dividir entre cero");
        } else {
            float resultado = n1 / n2;
            return resultado;
        }
    }

    public static float multiplicar(float n1, float n2) {
        float resultado = n1 * n2;
        return resultado;
    }

    public static void agregarResultado(float resultado) {
        historial.add(resultado);
    }

    public static void mostrarHistorial() {
        System.out.println("Resultados: " + historial);
    }

}