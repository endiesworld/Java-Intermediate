/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linearsearch;
import java.util.Scanner;
/**
 *
 * @author endie
 */
public class LinearSearch {

    /**
     * @param args the command line arguments
     */
    
    public static int linearSearchFunc(int numbers[],  int key) {
     
        for (int i = 0; i < numbers.length; ++i) {
           if (numbers[i] == key) {
              return i;
           }
        }

        return -1; // not found
     }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        int[] numbers = {2, 4, 7, 10, 11, 32, 45, 87};
        int NUMBERS_SIZE = 8;
        int i ;
        int key ;
        int keyIndex ;
        System.out.print("NUMBERS: ");
        for (i = 0; i < NUMBERS_SIZE; ++i) {
           System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a value: ");
        
        key = scnr.nextInt();

        keyIndex = linearSearchFunc(numbers,  key);

        if (keyIndex == -1) {
           System.out.println(key + " was not found.");
        } 
        else {
           System.out.println("Found " + key + " at index " + keyIndex + ".");
        }
    }
    
}
