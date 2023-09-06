package INFO3.TP2;

class QuickSortString {
    public static void main(String[] args) {
        String[] array = {"hola", "adios", "bienvenido", "chau", "hasta luego"};

        System.out.println("Array original:");
        printArray(array);

        quickSort(array, 0, array.length - 1);

        System.out.println("\nArray ordenado:");
        printArray(array);
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
    public static void quickSort(String[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    public static int partition(String[] array, int low, int high) {
        String pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j].compareTo(pivot) < 0) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return i + 1;
    }

    public static void swap(String[] array, int i, int j) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printArray(String[] array) {
        for (String element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

