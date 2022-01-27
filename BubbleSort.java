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
public class BubbleSort {  
    public static void main(String[] args) {  
    int[] a = {10, 9, 7, 23, 44};  
    System.out.println("Before Bubble Sort"); 
    for(int i=0;i<a.length;i++)  
    {  
        System.out.println(a[i]);  
    }
    for(int i=0;i<a.length;i++)  
    {  
        for (int j=0;j<a.length;j++)  
        {  
            if(a[i]<a[j])  
            {  
                int temp = a[i];  
                a[i]=a[j];  
                a[j] = temp;   
            }  
        }  
    }  
    System.out.println("After Bubble Sort"); 
    for(int i=0;i<a.length;i++)  
    {  
        System.out.println(a[i]);  
    }  
}  
}
