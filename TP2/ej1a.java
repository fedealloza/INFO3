package INFO3.TP2;

import java.util.Scanner;

class ej1a {
    public static void main(String[] args) {
        int[] arrInt = {5, 2, 8, 1, 3};
        
        // Ordenación de enteros usando los métodos
        insertionSort(arrInt);
        shellSort(arrInt);
        quickSort(arrInt, 0, arrInt.length - 1);
        
        // Imprimir el arreglo ordenado
        for (int num : arrInt) {
            System.out.print(num + " ");
        }

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
     */
    public class InsertionSort {
        // Método para ordenar el arreglo utilizando el algoritmo de inserción
        public void insertionSort(int[] arr) {
            int n = arr.length;
            
            for (int i = 1; i < n; ++i) {
                int key = arr[i];
                int j = i - 1;
                
                // Mover los elementos mayores que key una posición hacia adelante
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                
                // Insertar key en su posición correcta
                arr[j + 1] = key;
            }
        }
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
    public class ShellSort {
        // Método para ordenar el arreglo utilizando el algoritmo de Shell
        public void shellSort(int[] arr) {
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

    public class QuickSort {
        // Método para ordenar el arreglo utilizando el algoritmo de QuickSort
        public void quickSort(int[] arr, int low, int high) {
            if (low < high) {
                // Obtener el índice del pivote
                int pi = partition(arr, low, high);
                
                // Ordenar los elementos antes y después del pivote
                quickSort(arr, low, pi - 1);
                quickSort(arr, pi + 1, high);
            }
        }
        
        // Método para particionar el arreglo y obtener el índice del pivote
        private int partition(int[] arr, int low, int high) {
            int pivot = arr[high];
            int i = (low - 1);
            
            // Mover los elementos menores que el pivote hacia la izquierda
            for (int j = low; j < high; j++) {
                if (arr[j] < pivot) {
                    i++;
                    
                    // Intercambiar arr[i] y arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            
            // Intercambiar arr[i + 1] y arr[high]
            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;
            
            return i + 1;
        }
    }
}