package INFO3.TP3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import INFO3.TP4.ListQueue;
import INFO3.TP4.ListStack;

public class tp3 {
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
            System.out.println("0- Salir.");
            System.out.print("\nIngrese la opción: ");
            
            opcion = var.nextInt();
            
            switch (opcion) {
                case 1:
                    ArrayStack<Integer> stackArray = new ArrayStack<>();
                    
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
                                stackArray.push(x);
                                break;
                            case 'b':
                                stackArray.pop();
                                break;
                            case 'c':
                                System.out.println("Elemento en la cima: " + stackArray.top());
                                break;
                        }
                    } while (opcion2 != 'z');  
                    break;
                case 2:
                    // Creo una pila para almacenar caracteres
                    ArrayStack<Character> stackArray2 = new ArrayStack<>(); 
                    
                    System.out.print("\nIngrese una cadena: ");
                    String cadena = var.next(); // Leo la cadena ingresada por el usuario

                    // Eliminar espacios en blanco y convertir a minúsculas
                    cadena = cadena.replaceAll("\\s+", "").toLowerCase();

                    // Lleno la pila con la primera mitad de los caracteres
                    int mitad = cadena.length() / 2; // Calcular la mitad de la longitud de la cadena
                    for (int i = 0; i < mitad; i++) {
                        stackArray2.push(cadena.charAt(i)); // Agrego cada caracter de la primera mitad de la cadena a la pila
                    }

                    // Comparo los caracteres de la segunda mitad con la pila
                    boolean esPalindromo = true;
                    int inicio = mitad; // Variable para indicar el inicio de la segunda mitad de la cadena
                    if (cadena.length() % 2 != 0) {
                        inicio++; // Si la longitud de la cadena es impar, incremento el inicio para omitir el caracter del medio
                    }
                    for (int i = inicio; i < cadena.length(); i++) {
                        if (cadena.charAt(i) != stackArray2.pop()) { // Comparo cada caracter de la segunda mitad con el caracter desapilado de la pila
                            esPalindromo = false; // Si hay alguna diferencia, la cadena no es un palíndromo
                            break;
                        }
                    }
                    // Mostrar el resultado
                    if (esPalindromo) {
                        System.out.println("La cadena es un palíndromo.");
                    } else {
                        System.out.println("La cadena no es un palíndromo.");
                    }
                    break;
                case 3:
                    System.out.print("\nIngrese una cadena: ");
                    String expresion = var.nextLine();
                    
                    boolean estaEquilibrada = verificarEquilibrio(expresion);

                    if (estaEquilibrada == true) {
                        System.out.println("La expresion: "+expresion+" esta equilibrada");
                    } else {
                        System.out.println("La expresion: "+expresion+" esta deequilibrada");
                    }
                    
                    break;
                case 4:
                    ArrayQueue<Integer> queueArray = new ArrayQueue<>();
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
                                queueArray.enqueue(x);
                                break;
                            case 'b':
                                try {
                                    queueArray.dequeue();
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 'c':
                                System.out.println("Elemento del frente: " + queueArray.getFront());
                                break;
                        }
                    } while (opcion2 != 'z'); 
                    break;
                case 5:
                    ListQueue<Integer> cola = new ListQueue<>();

                    do {
                        System.out.println("\na- Agregar un valor (enqueue). ");
                        System.out.println("b- Eliminar el elemento del frente (dequeue). ");
                        System.out.println("c- Ver el elemento del frente sin eliminar (getFront). ");
                        System.out.println("d- Imprimir la cola original y la cola ordenada. ");
                        System.out.println("z- Salir.");
                        System.out.print("\nIngrese la opción: ");
                        opcion2 = var.next().charAt(0);
                        
                        switch(opcion2){
                            case 'a':
                                System.out.print("\nIngrese el valor a agregar: ");
                                x = var.nextInt();
                                cola.offer(x);
                                break;
                            case 'b':
                                try {
                                    cola.dequeue();
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 'c':
                                System.out.println("Elemento del frente: " + cola.getFront());
                                break;
                            case 'd':
                                System.out.println("Cola original: " + cola);

                                ordenarColaAscendente(cola);
                                
                                System.out.println("Cola ordenada en orden ascendente: " + cola);
                            break;
                        }
                    } while (opcion2 != 'z'); 
                    break;
            }       
        } while (opcion != 0);
    }

    public static boolean verificarEquilibrio(String expresion) {
        ListStack<Character> stackList = new ListStack<>();

        for (int i = 0; i < expresion.length(); i++) {
            char caracter = expresion.charAt(i);

            if (caracter == '(') {
                stackList.push(caracter);
            } else if (caracter == ')') {
                if (stackList.isEmpty()) {
                    return false;
                }
                stackList.pop();
            }
        }

        return stackList.isEmpty();
    }

    public static void ordenarColaAscendente(ListQueue<Integer> cola) {
        ListQueue<Integer> colaAuxiliar = new ListQueue<>();
        
        while (!cola.isEmpty()) {
            int elementoActual = cola.dequeue();

            while (!colaAuxiliar.isEmpty() && colaAuxiliar.peek().compareTo(elementoActual) < 0) {
                cola.enqueue(colaAuxiliar.dequeue());
            }

            colaAuxiliar.offer(elementoActual);
        }

        while (!colaAuxiliar.isEmpty()) {
            cola.enqueue(colaAuxiliar.dequeue());
        }
    }
}