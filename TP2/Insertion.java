package INFO3.TP2;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        Integer[] randomArray = new Integer[arraySize()];
        
        Random random = new Random();
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(10);
        }
        
        long startTime = System.nanoTime();
        for (int i = 1; i < randomArray.length; i++) {
            int key = randomArray[i];
            int j = i - 1;
        
            while (j >= 0 && randomArray[j] > key) {
                randomArray[j + 1] = randomArray[j];
                j--;
            }
        
            randomArray[j + 1] = key;
        }
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

    public static Integer arraySize() throws InputMismatchException {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de numeros del array: ");
        return scan.nextInt();
    } 
}
