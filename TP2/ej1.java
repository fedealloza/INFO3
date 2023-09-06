package INFO3.TP2;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar opciones al usuario
            System.out.println("\n1- QuickSort con enteros.");
            System.out.println("2- Quicksort con String.");
            System.out.println("3- Quicksort con Double.");
            System.out.println("4- Insercion con enteros.");
            System.out.println("5- Insercion con String.");
            System.out.println("6- Insercion con Double.");
            System.out.println("7- ShellSort con enteros.");
            System.out.println("8- ShellSort con String.");
            System.out.println("9- ShellSort con Double.");
            System.out.println("0- Salir.");
            System.out.print("\nIngrese la opción: ");
            opcion = var.nextInt();

        
            switch (opcion) {
                case 1:
                    Integer[] randomArray = new Integer[arraySize()];
            
                    Random random = new Random();
                    for (int i = 0; i < randomArray.length; i++) {
                        randomArray[i] = random.nextInt(10);
                    }
                    
                    long startTime = System.nanoTime();
            
                    quickSortInt(randomArray, 0, randomArray.length-1);
                    long endTime = System.nanoTime();
                    
                    long elapsedTimeMillis = (endTime - startTime) / 100000;
                    
                    Insertion.showArray(randomArray);
                    System.out.println("\nTiempo transcurrido: " + elapsedTimeMillis + " milisegundos.");
                    break;
                case 2:
                    String[] array = {"hola", "adios", "bienvenido", "chau", "hasta luego"};

                    System.out.println("Array original:");
                    printArrayString(array);
            
                    quickSortString(array, 0, array.length - 1);
            
                    System.out.println("\nArray ordenado:");
                    printArrayString(array);
                    long elapsedTimeMillis = (endTime - startTime) / 100000;
                    
                    Insertion.showArray(randomArray);
                    System.out.println("\nTiempo transcurrido: " + elapsedTimeMillis + " milisegundos.");
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    
                    break;
                case 8:
                    
                    break;
                case 9:
                    
                    break;    
            }
        } while (opcion != 0);
    }

    public static void showArray(Integer[] array) {
        for (Integer integer : array) {
            System.out.print(integer + " ");
        } 
    }

    public static Integer arraySize() throws InputMismatchException {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de numeros del array");
        return scan.nextInt();
    }

    /*
     * --------FUNCIONAMIENTO DEL METODO POR INSERCION-------------------
     * 
     * 1. Comenzamos con una lista/array de elementos desordenados. 
     * 
     * 2. Tomamos el primer elemento de la lista y lo consideramos como una lista ordenada de un solo elemento.
     * 
     * 3. Luego, tomamos el siguiente elemento y lo insertamos en la posición correcta 
     *    dentro de la lista ordenada anterior. 
     *    Para hacer esto, comparamos el elemento con cada elemento en la lista ordenada 
     *    y lo insertamos en la posición correcta. 
     * 
     * 4. Repetimos el paso anterior para cada elemento restante en la lista desordenada,
     *    insertándolos en la posición correcta dentro de la lista ordenada.
     *  
     * 5. Al finalizar, tendremos una lista completamente ordenada.
    
    public static class InsertionSort {
        // Método para ordenar el arreglo utilizando el algoritmo de inserción
        public static void insertionSort(int[] arrInt) {
            int n = arrInt.length;
            
            for (int i = 1; i < n; ++i) {
                int key = arrInt[i];
                int j = i - 1;
                
                // Mover los elementos mayores que key una posición hacia adelante
                while (j >= 0 && arrInt[j] > key) {
                    arrInt[j + 1] = arrInt[j];
                    j = j - 1;
                }
                
                // Insertar key en su posición correcta
                arrInt[j + 1] = key;
            }
        }
    }
     */
    /*
     *
     * --------FUNCIONAMIENTO DEL SHELLSORT-------------------
     *  
     * 1. Comenzamos con un arreglo desordenado. 
     * 
     * 2. Definimos el tamaño del salto inicial. 
     *     Generalmente, se toma la mitad del tamaño del arreglo y se va reduciendo a la mitad en cada iteración.
     *   
     * 3. Dividimos el arreglo en subgrupos de tamaño igual al salto. 
     * 
     * 4. Aplicamos el algoritmo de inserción en cada subgrupo. 
     *    Esto implica comparar y mover los elementos hacia la derecha 
     *    hasta que estén en su posición correcta dentro del subgrupo.
     *  
     * 5. Repetimos los pasos 3 y 4 para subgrupos de tamaño cada vez más pequeño, 
     *    hasta que el tamaño del salto sea 1.
     *  
     * 6. Finalmente, aplicamos el algoritmo de inserción en el arreglo completo 
     *    para asegurarnos de que todos los elementos estén en su posición correcta. 
     * 
    
    public static class ShellSort {
        // Método para ordenar el arreglo utilizando el algoritmo de Shell
        public static void shellSort(int[] arr) {
            int n = arr.length;
            
            // Definir el tamaño del salto
            for (int gap = n / 2; gap > 0; gap /= 2) {
                
                // Insertion sort para cada salto
                for (int i = gap; i < n; i++) {
                    int temp = arr[i];
                    int j;
                    
                    // Mover los elementos mayores que temp una posición hacia adelante
                    for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                        arr[j] = arr[j - gap];
                    }
                    
                    // Insertar temp en su posición correcta
                    arr[j] = temp;
                }
            }
        }
    }
 */


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
    
    public static void quickSortInt(Integer[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partitionInt(array, low, high);
            
            quickSortInt(array, low, pivotIndex - 1);
            quickSortInt(array, pivotIndex + 1, high);
        }
    }

    public static int partitionInt(Integer[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                swapInt(array, i, j);
            }
        }

        swapInt(array, i + 1, high);
        return i + 1;
    }

    public static void swapInt(Integer[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void quickSortString(String[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partitionString(array, low, high);
            quickSortString(array, low, pivotIndex - 1);
            quickSortString(array, pivotIndex + 1, high);
        }
    }

    public static int partitionString(String[] array, int low, int high) {
        String pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j].compareTo(pivot) < 0) {
                i++;
                swapString(array, i, j);
            }
        }
        swapString(array, i + 1, high);
        return i + 1;
    }

    public static void swapString(String[] array, int i, int j) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printArrayString(String[] array) {
        for (String element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

}
