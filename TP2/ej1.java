package INFO3.TP2;

import java.util.Arrays;
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
                    
                    System.out.println("Array original:");
                    showArray(randomArray);

                    quickSortInt(randomArray, 0, randomArray.length-1);
                    long endTime = System.nanoTime();
                    
                    System.out.println("\nArray ordenado:");
                    showArray(randomArray);
                    long elapsedTimeMillis = (endTime - startTime) / 100000;
                    
                    System.out.println("\nTiempo transcurrido: " + elapsedTimeMillis + " milisegundos.");
                    break;
                case 2:
                    String[] array = {"hola", "adios", "bienvenido", "chau", "hasta luego"};

                    long startTime2 = System.nanoTime();

                    System.out.println("Array original:");
                    printArrayString(array);
                    
                    quickSortString(array, 0, array.length - 1);
                    long endTime2 = System.nanoTime();

                    System.out.println("\nArray ordenado:");
                    printArrayString(array);
                    long elapsedTimeMillis2 = (endTime2 - startTime2) / 100000;
                    
                    System.out.println("\nTiempo transcurrido: " + elapsedTimeMillis2 + " milisegundos.");
                    break;
                case 3:
                    Double[] randomArrayDouble = new Double[(int) arraySizeDouble()];

                    Random randomDouble = new Random();
                    for (int i = 0; i < randomArrayDouble.length; i++) {
                        randomArrayDouble[i] = randomDouble.nextDouble();
                    }    

                    long startTime3 = System.nanoTime();

                    System.out.println("Array original:");
                    showArrayDouble(randomArrayDouble);

                    quickSortDouble(randomArrayDouble, 0, randomArrayDouble.length-1);
                    long endTime3 = System.nanoTime();
                    
                    System.out.println("\nArray ordenado:");
                    showArrayDouble(randomArrayDouble);

                    long elapsedTimeMillis3 = (endTime3 - startTime3) / 100000;
                    System.out.println("\nTiempo transcurrido: " + elapsedTimeMillis3 + " milisegundos.");
                    break;
                case 4:
                    Integer[] randomArrayInsertionInt = new Integer[arraySize()];
        
                    Random randomInsertion = new Random();
                    for (int i = 0; i < randomArrayInsertionInt.length; i++) {
                        randomArrayInsertionInt[i] = randomInsertion.nextInt(10);
                    }
                
                    long startTime4 = System.nanoTime();

                    System.out.println("Array original:");
                    showArrayInsertion(randomArrayInsertionInt);

                    insertionSort(randomArrayInsertionInt);
                    long endTime4 = System.nanoTime();

                    System.out.println("\nArray ordenado:");
                    showArrayInsertion(randomArrayInsertionInt);

                    long elapsedTimeMillis4 = (endTime4 - startTime4) / 100000;
                    System.out.println("\nTiempo transcurrido: " + elapsedTimeMillis4 + " milisegundos.");
                    break;
                case 5:
                    String[] arr = {"hola", "adios", "bienvenido", "chau", "hasta luego"};
                    long startTime5 = System.nanoTime();

                    System.out.println("Array original:");
                    printArrayStringInsertion(arr);

                    InsertionSortString(arr);
                    long endTime5 = System.nanoTime();
                    
                    System.out.println("\nArray ordenado:");
                    printArrayStringInsertion(arr);
                    long elapsedTimeMillis5 = (endTime5 - startTime5) / 100000;
                    
                    System.out.println("\nTiempo transcurrido: " + elapsedTimeMillis5 + " milisegundos.");
                    break;
                case 6:
                    Double[] randomArrayInsertionDouble = new Double[(int) arraySizeDouble()];

                    Random randomInserDouble = new Random();
                    for (int i = 0; i < randomArrayInsertionDouble.length; i++) {
                        randomArrayInsertionDouble[i] = randomInserDouble.nextDouble();
                    }    

                    long startTime6 = System.nanoTime();

                    System.out.println("Array original:");
                    showArrayInsertionDouble(randomArrayInsertionDouble);
                    
                    int n = randomArrayInsertionDouble.length;
            
                    insertionSortDouble(randomArrayInsertionDouble);
                    long endTime6 = System.nanoTime();
                
                    System.out.println("Array ordenado:");
                    showArrayInsertionDouble(randomArrayInsertionDouble);
                
                    long elapsedTimeMillis6 = (endTime6 - startTime6) / 100000;
                    
                    System.out.println("\nTiempo transcurrido: " + elapsedTimeMillis6 + " milisegundos.");
                    break;
                case 7:
                    Integer[] randomArrayShellsortInt = new Integer[arraySize()];

                    Random randomShellRandom = new Random();
                    for (int i = 0; i < randomArrayShellsortInt.length; i++) {
                        randomArrayShellsortInt[i] = randomShellRandom.nextInt(10);
                    }

                    long startTime7 = System.nanoTime();

                    System.out.println("Array original:");
                    showArrayShellsortInt(randomArrayShellsortInt);


                    shellSortInt(randomArrayShellsortInt);
                    long endTime7 = System.nanoTime();

                    
                    System.out.println("\nArray ordenado:");
                    showArrayShellsortInt(randomArrayShellsortInt);

                    long elapsedTimeMillis7 = (endTime7 - startTime7) / 100000;
                    
                    System.out.println("\nTiempo transcurrido: " + elapsedTimeMillis7 + " milisegundos.");
                    break;
                case 8:
                    String[] arrShellStrings = {"hola", "adios", "bienvenido", "chau", "hasta luego"};
                    
                    long startTime8 = System.nanoTime();

                    System.out.println("Array original:");
                    printArrayStringShell(arrShellStrings);
                    
                    shellSortString(arrShellStrings);
                    long endTime8 = System.nanoTime();
                    
                    System.out.println("\nArray ordenado:");
                    printArrayStringShell(arrShellStrings);
                    
                    long elapsedTimeMillis8 = (endTime8 - startTime8) / 100000;
                    
                    System.out.println("\nTiempo transcurrido: " + elapsedTimeMillis8 + " milisegundos.");
                    break;
                case 9:
                    Double[] randomArrayShellSortDouble = new Double[(int) arraySizeDouble()];

                    Random randomShellDouble = new Random();
                    for (int i = 0; i < randomArrayShellSortDouble.length; i++) {
                        randomArrayShellSortDouble[i] = randomShellDouble.nextDouble();
                    }   

                    long startTime9 = System.nanoTime();

                    System.out.println("Array original:");
                    showArrayShellsortDouble(randomArrayShellSortDouble);

                    shellSortDouble(randomArrayShellSortDouble);
                    long endTime9 = System.nanoTime();
                    
                    System.out.println("\nArray ordenado:");
                    showArrayShellsortDouble(randomArrayShellSortDouble);

                    long elapsedTimeMillis9 = (endTime9 - startTime9) / 100000;
                    
                    System.out.println("\nTiempo transcurrido: " + elapsedTimeMillis9 + " milisegundos.");
                    break;    
            }
        } while (opcion != 0);
    }


    public static void showArray(Integer[] array) {
        for (Integer integer : array) {
            System.out.print(integer + " ");
        } 
    }

    public static void showArrayDouble(Double[] array) {
        for (Double number : array) {
            System.out.print(number + " ");
        }
    }

    public static Integer arraySize() throws InputMismatchException {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de numeros del array: ");
        return scan.nextInt();
    }

    public static double arraySizeDouble() throws InputMismatchException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números del array: ");
        return scan.nextDouble();
    }


    /*
     * --------FUNCIONAMIENTO DEL METODO POR INSERCION-------------------
      
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
     */
    // Método para ordenar el arreglo utilizando el algoritmo de inserción
    public static void insertionSort(Integer[] arrInt) {
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
    
    public static void insertionSortDouble(Double[] arrDouble) {
            int n = arrDouble.length;
            
            for (int i = 1; i < n; ++i) {
                double key = arrDouble[i];
                int j = i - 1;
                
                // Mover los elementos mayores que key una posición hacia adelante
                while (j >= 0 && arrDouble[j] > key) {
                    arrDouble[j + 1] = arrDouble[j];
                    j = j - 1;
                }
                
                // Insertar key en su posición correcta
                arrDouble[j + 1] = key;
            }
    }

    public static void InsertionSortString(String[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    
    
    
    public static void showArrayInsertion(Integer[] array) {
        for (Integer integer : array) {
            System.out.print(integer + " ");
        } 
    }


    public static void showArrayInsertionDouble(Double[] array) {
        for (Double arrDouble : array) {
            System.out.print(arrDouble + " ");
        } 
    }

    public static void printArrayStringInsertion(String[] array) {
        for (String element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

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
     */
        // Método para ordenar el arreglo utilizando el algoritmo de Shell
    public static void shellSortInt(Integer[] arr) {
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

    public static void shellSortString(String[] arr) {
        int n = arr.length;

        // Definir el tamaño del salto
        int gap = n / 2;
        while (gap > 0) {
             // Insertion sort para cada salto
            for (int i = gap; i < n; i++) {
                String temp = arr[i];
                int j = i;
                 // Mover los elementos mayores que temp una posición hacia adelante
                while (j >= gap && arr[j - gap].compareTo(temp) > 0) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                // Insertar temp en su posición correcta
                arr[j] = temp;
            }
            gap /= 2;
        }
    }

    public static void shellSortDouble(Double[] arr) {
        int n = arr.length;
            
        // Definir el tamaño del salto
        for (int gap = n / 2; gap > 0; gap /= 2) {        
            // Insertion sort para cada salto
            for (int i = gap; i < n; i++) {
                Double temp = arr[i];
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

    public static void showArrayShellsortInt(Integer[] array) {
        for (Integer integer : array) {
            System.out.print(integer + " ");
        } 
    }

    public static void showArrayShellsortDouble(Double[] array) {
        for (Double shDouble : array) {
            System.out.print(shDouble + " ");
        } 
    }

    public static void printArrayStringShell(String[] array) {
        for (String element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
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
    //quickInt
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

    public static void quickSortDouble(Double[] randomArrayDouble, int low, int high) {
        if (low < high) {
            int pivotIndex = partitionDouble(randomArrayDouble, low, high);
            quickSortDouble(randomArrayDouble, low, pivotIndex - 1);
            quickSortDouble(randomArrayDouble, pivotIndex + 1, high);
        }
    }

    private static int partitionDouble(Double[] arr, int low, int high) {
        double pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swapDouble(arr, i, j);
            }
        }
        swapDouble(arr, i + 1, high);
        return i + 1;
    }
    
    private static void swapDouble(Double[] arr, int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;        
    }
}
