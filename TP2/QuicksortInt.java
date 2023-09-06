package INFO3.TP2;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class QuicksortInt {
    public static void main(String[] args) {
        Integer[] randomArray = new Integer[arraySize()];
        
        Random random = new Random();
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(10);
        }
        
        long startTime = System.nanoTime();

        quickSort(randomArray, 0, randomArray.length-1);
        long endTime = System.nanoTime();
        
        long elapsedTimeMillis = (endTime - startTime) / 100000;
        
        Insertion.showArray(randomArray);
        System.out.println("\nTiempo transcurrido: " + elapsedTimeMillis + " milisegundos.");
        
    }

    public static void showArray(Integer[] array) {
        for (Integer integer : array) {
            System.out.print(integer + " ");
        } 
    }


    /*
     *
     * --------FUNCIONAMIENTO DEL QUICKSORT-------------------
     *  
     * 1. Comenzamos con un arreglo desordenado. 
     * 
     * 2. Elegimos un elemento del arreglo como pivote. Este puede ser cualquier elemento, 
     *    pero generalmente se selecciona el último elemento del arreglo. 
     * 
     * 3. Reorganizamos los elementos del arreglo de manera que los 
     *    elementos menores que el pivote estén a su izquierda y los elementos mayores estén a su derecha. 
     *    Esto se conoce como particionamiento. 
     * 
     * 4. Recursivamente, aplicamos los pasos 2 y 3 en los subarreglos antes y después del pivote, 
     *    hasta que todos los subarreglos tengan un solo elemento. 
     * 
     * 5. Al finalizar, tendremos un arreglo completamente ordenado. 
     * 
     */

    public static Integer arraySize() throws InputMismatchException {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de numeros del array: ");
        return scan.nextInt();
    }
    
    public static void quickSort(Integer[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    public static int partition(Integer[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, high);
        return i + 1;
    }

    public static void swap(Integer[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

