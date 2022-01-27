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
class CLL  {  
    static class Node_Milan { 
        int data; 
        Node_Milan next; 
    };  
    static Node_Milan addToEmpty(Node_Milan last_Milan, int data) { 
        if (last_Milan != null) 
        return last_Milan;  
        Node_Milan temp = new Node_Milan(); 
        temp.data = data; 
        last_Milan = temp; 
        last_Milan.next = last_Milan;  
        return last_Milan; 
    }  
    static Node_Milan addBegin(Node_Milan last_Milan, int data) { 
        if (last_Milan == null) 
            return addToEmpty(last_Milan, data);  
        Node_Milan temp = new Node_Milan();  
        temp.data = data; 
        temp.next = last_Milan.next; 
        last_Milan.next = temp;  
        return last_Milan; 
    }  
    static Node_Milan addEnd(Node_Milan last_Milan, int data) { 
        if (last_Milan == null) 
            return addToEmpty(last_Milan, data);      
        Node_Milan temp = new Node_Milan();   
        temp.data = data; 
        temp.next = last_Milan.next; 
        last_Milan.next = temp; 
        last_Milan = temp;  
        return last_Milan; 
    }  
    static Node_Milan addAfter(Node_Milan last_Milan, int data, int item) { 
        if (last_Milan == null) 
            return null; 
        Node_Milan temp, p; 
        p = last_Milan.next; 
        do{ 
            if (p.data == item)  { 
                temp = new Node_Milan(); 
                temp.data = data; 
                temp.next = p.next; 
                p.next = temp; 

                if (p == last_Milan) 
                    last_Milan = temp; 
                return last_Milan; 
            } 
            p = p.next; 
        } while(p != last_Milan.next); 
        System.out.println(item + " not present in the list."); 
        return last_Milan;   
    }   
    static void traverse(Node_Milan last_Milan) { 
        Node_Milan p; 
        if (last_Milan == null)   { 
            System.out.println("List is empty."); 
            return; 
        } 
        p = last_Milan.next;  
        do{ 
            System.out.print(p.data+" "); 
            p = p.next; 
        } 
        while(p != last_Milan.next);  
    }  
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        Node_Milan last_Milan = null; 
        System.out.print("\nEnter the data at empty list:");
        int n=sc.nextInt();
        last_Milan = addToEmpty(last_Milan, n);
        traverse(last_Milan);
        System.out.print("\nEnter the size of data you want to add at beginning:");
        int n1=sc.nextInt();
        for(int i=0;i<n1;i++){
            last_Milan=addBegin(last_Milan,sc.nextInt());
        }
        traverse(last_Milan);
        System.out.print("\nEnter the size of data you want to add at end:");
        int n2=sc.nextInt();
        for(int i=0;i<n2;i++){
            last_Milan = addEnd(last_Milan,sc.nextInt());
        } 
        traverse(last_Milan);
        System.out.print("\nEnter the data after which you want to add :");
        int data1=sc.nextInt();
        System.out.print("\nEnter the data :");
        int data2=sc.nextInt();
        last_Milan = addAfter(last_Milan, data2, data1); 
        System.out.println("Created CLL is: ");
        traverse(last_Milan);
        System.out.println("\nMiLan,B,10");
    } 
}
