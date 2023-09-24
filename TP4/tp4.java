package INFO3.TP4;

import java.util.Scanner;

import INFO3.TP3.ArrayQueue;

public class tp4 {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        int opcion, x;
        char opcion2;
        
        do {
            // Mostrar opciones al usuario
            System.out.println("\n1- Implementacion de una pila.");
            System.out.println("2- Comprobacion de palindromos.");
            System.out.println("3- Expresiones matematicas.");
            System.out.println("4- Implementacion de una cola.");
            System.out.println("5- Ordenar una cola.");
            System.out.println("6- Ordenar una cola.");
            System.out.println("7- Ordenar una cola.");
            System.out.println("8- Ordenar una cola.");
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
}