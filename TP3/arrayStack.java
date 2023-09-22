package INFO3.TP3;

import java.util.Scanner;
import java.util.Stack;

public class arrayStack {
    public static class ArrayStack<AnyType>{
        private AnyType[] theArray;
        private int topOfStack;
        private static final int DEFAULT_CAPACITY = 10;

        public ArrayStack() {
            theArray = (AnyType[]) new Object[DEFAULT_CAPACITY];
            topOfStack = -1;
        }

        public boolean isEmpty() {
            return topOfStack == -1;
        }

        public void makeEmpty() {
            topOfStack = -1;
        }

        public void push(AnyType x) {
            if (topOfStack + 1 == theArray.length) {
                doubleArray();
            }
            theArray[++topOfStack] = x;
        }

        public AnyType top() {
            if (isEmpty()) {
                throw new RuntimeException("ArrayStack Top");
            }
            return theArray[topOfStack];
        }

        public AnyType pop() {
            if (isEmpty()) {
                throw new RuntimeException("ArrayStack Pop");
            }
            topOfStack--;
            return theArray[topOfStack + 1];
        }

        public AnyType topAndPop(){
            if (isEmpty()) {
                throw new RuntimeException("ArrayStack topAndPop");
            }
            return theArray[topOfStack--];
        }

        /** 
         * Método para duplicar el tamaño de un arreglo. 
         * Crea un nuevo arreglo de tipo AnyType con el doble de tamaño que el arreglo original. 
         * Copia los elementos del arreglo original al nuevo arreglo utilizando el método System.arraycopy. 
         * Actualiza la referencia del arreglo original al nuevo arreglo. 
         */
        private void doubleArray() {
            AnyType[] newArray = (AnyType[]) new Object[theArray.length * 2];
            System.arraycopy(theArray, 0, newArray, 0, theArray.length);
            theArray = newArray;
        }
    }

    public static void main(String[] args) {
        
        ArrayStack<Integer> stack = new ArrayStack<>();
        
        stack.push(3);
        stack.push(10);
        stack.push(1);

        while (!stack.isEmpty()) {
            System.out.print(stack.pop()+" ");
        }
    }
}