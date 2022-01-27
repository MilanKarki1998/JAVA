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
class QuickSort{ 
    int partition(int Milan[], int low, int high)  { 
        int pivot = Milan[high];  
        int i = (low-1); 
        for (int j=low; j<high; j++) { 
            if (Milan[j] <= pivot) 
            { 
                i++; 
                int temp = Milan[i]; 
                Milan[i] = Milan[j]; 
                Milan[j] = temp; 
            } 
        } 
        int temp = Milan[i+1]; 
        Milan[i+1] = Milan[high]; 
        Milan[high] = temp; 
        return i+1; 
    } 
    void sort(int Milan[], int low, int high)  { 
        if (low < high){ 
            int pi = partition(Milan, low, high); 
            sort(Milan, low, pi-1); 
            sort(Milan, pi+1, high); 
        } 
    } 
    static void printArray(int Milan[]) { 
        int n = Milan.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(Milan[i]+" "); 
        System.out.println(); 
    } 
    public static void main(String args[])  { 
        Scanner scan = new Scanner(System.in);    
       System.out.print("Enter Array Size : ");  
       int size_Milan= scan.nextInt(); 
       int Milan[] = new int[size_Milan]; 
       System.out.print("Enter Array Elements : ");  
       for(int i=0; i<size_Milan; i++){  
           Milan[i] = scan.nextInt();  
       } 
         System.out.print("Array are :\n"); 
        for (int i = 0; i < size_Milan; ++i){ 
            System.out.print(Milan[i] + " ");
        }
        System.out.println(); 
        QuickSort ob_Milan = new QuickSort(); 
        ob_Milan.sort(Milan, 0, size_Milan-1); 
        System.out.println("Sorted Array"); 
        printArray(Milan); 
        System.out.println("MiLan,B,10");
    } 
} 
