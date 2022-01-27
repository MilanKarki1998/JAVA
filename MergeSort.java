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
class MergeSort{  
    void merge(int Milan[], int l, int m, int r)  { 
        int n1 = m - l + 1; 
        int n2 = r - m; 
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
        for (int i=0; i<n1; ++i) 
            L[i] = Milan[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = Milan[m + 1+ j]; 
        int i = 0, j = 0; 
        int k = l; 
        while (i < n1 && j < n2) { 
            if (L[i] <= R[j])  { 
                Milan[k] = L[i]; 
                i++; 
            } else { 
                Milan[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
        while (i < n1)  { 
            Milan[k] = L[i]; 
            i++; 
            k++; 
        } 
        while (j < n2)  { 
            Milan[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
    void sort(int Milan[], int l, int r)  { 
        if (l < r) {  
            int m = (l+r)/2; 
            sort(Milan, l, m); 
            sort(Milan , m+1, r); 
            merge(Milan, l, m, r); 
        } 
    } 
    static void printArray(int Milan[])  { 
        int n = Milan.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(Milan[i] + " "); 
        System.out.println(); 
    } 
    public static void main(String args[])   { 
        Scanner scan = new Scanner(System.in);    
       System.out.print("Enter Array Size : ");  
       int size_Milan= scan.nextInt(); 
       int Milan[] = new int[size_Milan]; 
       System.out.print("Enter Array Elements : ");  
       for(int i=0; i<size_Milan; i++){  
           Milan[i] = scan.nextInt();  
       } 
        System.out.println("Given Array"); 
        printArray(Milan); 
        MergeSort ob_Milan = new MergeSort(); 
        ob_Milan.sort(Milan, 0, Milan.length-1); 
        System.out.println("\nSorted Milanay"); 
        printArray(Milan); 
        System.out.println("MiLan,B,10");
    } 
} 
