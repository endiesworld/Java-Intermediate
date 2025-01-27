/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binarysearch;

/**
 *
 * @author endie
 */
import java.util.Scanner ;

public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    
    public static int binarySearch(int[] arr, int key){
        int left_side = 0;
        int right_side = arr.length ;
        int midpoint ;
        int result;
        
        while ( left_side < right_side){
            midpoint = (left_side + right_side) / 2;
            result =  arr[midpoint];
            if( result == key){
                return midpoint;
            }
            if( key < result ){
                right_side = midpoint  ;
            }
            if( key > result ){
                left_side = midpoint + 1  ;
            }
        }
        
        return -1;
    
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numbers = { 2, 4, 7, 10, 11, 32, 45, 87 };
        System.out.print("NUMBERS: ");
        for (int i = 0; i < numbers.length; i++) {
           System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        
        int key = scnr.nextInt();
        int result = binarySearch(numbers, key);
        
        if (result == -1) {
         System.out.println(key + " was not found.");
      }
      else {
         System.out.printf("Found %d at index %d.\n", key, result);
      }
        
    }
    
}
