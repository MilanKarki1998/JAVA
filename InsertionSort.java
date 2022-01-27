/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA;



/**
 *
 * @author KING
 */
import java.util.Scanner;
class InsertionSort { 
    void sort(int Milan[])  { 
        int n = Milan.length; 
        for (int i = 1; i < n; ++i) { 
            int key = Milan[i]; 
            int j = i - 1; 
            while (j >= 0 && Milan[j] > key) { 
                Milan[j + 1] = Milan[j]; 
                j = j - 1; 
            } 
            Milan[j + 1] = key; 
        } 
    } 
    static void printArray(int Milan[])  { 
        int n = Milan.length;
        System.out.print("Now the Array after Sorting is :\n"); 
        for (int i = 0; i < n; ++i) 
            System.out.print(Milan[i] + " "); 
  
        System.out.println(); 
    } 
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);    
       System.out.print("Enter Array Size : ");  
       int size_Milan= scan.nextInt(); 
       int Milan[] = new int[size_Milan]; 
       System.out.print("Enter Array Elements : ");  
       for(int i=0; i<size_Milan; i++){  
           Milan[i] = scan.nextInt();  
       } 
        System.out.print("Array are :\n"); 
        for (int i = 0; i < Milan.length; ++i){ 
            System.out.print(Milan[i] + " ");
        }
        System.out.println(); 
        InsertionSort ob_Milan = new InsertionSort(); 
        ob_Milan.sort(Milan); 
        printArray(Milan); 
        System.out.println("MiLan,B,10");
    } 
} 