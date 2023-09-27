package INFO3.TP4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class tp4 {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        int opcion, x;
        char opcion2;
        do {
            // Mostrar opciones al usuario
            System.out.println("\n1- Implementación de una Pila con lista.");
            System.out.println("2- Pila de Palabras.");
            System.out.println("3- Verificación de Paréntesis.");
            System.out.println("4- Conversion decimal a binario.");
            System.out.println("5- Implementacion de una cola con lista.");
            System.out.println("6- Cola de numeros.");
            System.out.println("7- Ordenamiento de cola.");
            System.out.println("8- Verificación de Palíndromos con cola.");
            System.out.println("0- Salir.");
            System.out.print("\nIngrese la opción: ");
            opcion = var.nextInt();
            switch (opcion) {
                case 1:
                    ListStack<Integer> stackList = new ListStack<>();
                    do {
                        System.out.println("\na- Agregar un valor (push). ");
                        System.out.println("b- Eliminar el elemento en la cima (pop). ");
                        System.out.println("c- Ver el elemento en la cima sin eliminar (top). ");
                        System.out.println("z- Salir.");
                        System.out.print("\nIngrese la opción: ");
                        opcion2 = var.next().charAt(0);
                        switch(opcion2){
                            case 'a':
                                System.out.print("\nIngrese el valor a agregar: ");
                                x = var.nextInt();
                                stackList.push(x);
                                break;
                            case 'b':
                                stackList.pop();
                                break;
                            case 'c':
                                System.out.println("Elemento en la cima: " + stackList.top());
                                break;
                        }
                    } while (opcion2 != 'z');  
                    break;
                case 2:
                    ListStack<String> stackListString = new ListStack<>();
                    do {
                        System.out.println("\na- Agregar un valor (push). ");
                        System.out.println("b- Eliminar el elemento en la cima (pop). ");
                        System.out.println("c- Imprimir en orden inverso. ");
                        System.out.println("z- Salir.");
                        System.out.print("\nIngrese la opción: ");
                        opcion2 = var.next().charAt(0);
                        switch(opcion2){
                            case 'a':
                                System.out.print("\nIngrese el valor a agregar: ");
                                String palabra = var.next();
                                stackListString.push(palabra);
                                break;
                            case 'b':
                                stackListString.pop();
                                break;
                            case 'c':
                                ListStack<String> listaAlReves = recorrerAlReves(stackListString);
                                while (!listaAlReves.isEmpty()) {
                                    System.out.print(listaAlReves.top() + " ");
                                    listaAlReves.pop();
                                }
                                break;
                        }
                    } while (opcion2 != 'z');  
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    ListQueue<Integer> queueList = new ListQueue<>();
                    do {
                        System.out.println("\na- Agregar un valor (enqueue). ");
                        System.out.println("b- Eliminar el elemento del frente (dequeue). ");
                        System.out.println("c- Ver el elemento del frente sin eliminar (getFront). ");
                        System.out.println("z- Salir.");
                        System.out.print("\nIngrese la opción: ");
                        opcion2 = var.next().charAt(0);
                        switch(opcion2){
                            case 'a':
                                System.out.print("\nIngrese el valor a agregar: ");
                                x = var.nextInt();
                                queueList.enqueue(x);
                                break;
                            case 'b':
                                try {
                                    queueList.dequeue();
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 'c':
                                System.out.println("Elemento del frente: " + queueList.getFront());
                                break;
                        }
                    } while (opcion2 != 'z'); 
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
            }       
        } while (opcion != 0);
    }

    public static ListStack<String> recorrerAlReves(ListStack<String> stackListString) { 
        ListStack<String> listaAlReves = new ListStack<>(); 
        ListStack<String> tempStack = new ListStack<>();
        
        while (!stackListString.isEmpty()) {
            tempStack.push(stackListString.top());
            stackListString.pop();
        }
        
        while (!tempStack.isEmpty()) {
            listaAlReves.push(tempStack.top());
            tempStack.pop();
        }
        
        return listaAlReves; 
    }

}