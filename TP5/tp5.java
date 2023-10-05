package INFO3.TP5;
import java.util.Random;
import java.util.Scanner;

public class tp5 {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        int opcion, x;
        char opcion2;
        binarySearchTree<Integer> arbolBinario = new binarySearchTree<>();
        do {
            // Mostrar opciones al usuario
            System.out.println("\n1- Generar un árbol binario de 10 números de valores comprendidos entre 0 y 25.");
            System.out.println("2- Mostrar el Arbol Binario.");
            System.out.println("3- Verificar si el árbol acepta valores duplicados, en caso contrario hacer lo contrario.");
            System.out.println("4- Método Depth, mostrar cuántos niveles tiene.");
            System.out.println("5- Método Dtree.");
            System.out.println("0- Salir.");
            System.out.print("\nIngrese la opción: ");
            opcion = var.nextInt();
            
            switch (opcion) {
                case 1:
                    Random random = new Random();
                    // Agregar 10 valores aleatorios al árbol
                    for (int i = 0; i < 12; i++) {
                        x = random.nextInt(26);
                        arbolBinario.insert(x);
                    }
                    break;
                case 2:
                do {
                    System.out.println("\na- Mostrar el Arbol InOrder. ");
                    System.out.println("b- Mostrar el Arbol PreOrder. ");
                    System.out.println("c- Mostrar el Arbol PostOrder. ");
                    System.out.println("z- Salir.");
                    System.out.print("\nIngrese la opción: ");
                    opcion2 = var.next().charAt(0);
                    
                    switch(opcion2){
                        case 'a':
                            System.out.println("ARBOL BINARIO IN ORDER");
                            // Imprimir el árbol en orden
                            arbolBinario.printInOrder();
                            break;
                        case 'b':
                            System.out.println("ARBOL BINARIO PRE ORDER");
                            // Imprimir el árbol pre orden
                            arbolBinario.printPreOrder();
                            break;
                        case 'c':
                            System.out.println("ARBOL BINARIO POST ORDER");
                            // Imprimir el árbol post orden
                            arbolBinario.printPostOrder();
                            break;
                    }
                } while (opcion2 != 'z');
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