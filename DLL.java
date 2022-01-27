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
public class DLL { 
    Node_Milan head;
    class Node_Milan { 
        int data; 
        Node_Milan prev; 
        Node_Milan next; 
        Node_Milan(int d) { data = d; } 
    } 
    public void push(int new_data)  { 
        Node_Milan new_Node_Milan = new Node_Milan(new_data); 
        new_Node_Milan.next = head; 
        new_Node_Milan.prev = null; 
        if (head != null) 
            head.prev = new_Node_Milan; 
        head = new_Node_Milan; 
    } 
    public void InsertAfter(Node_Milan prev_Node_Milan, int new_data)  { 
        if (prev_Node_Milan == null) { 
            System.out.println("The given previous node cannot be NULL "); 
            return; 
        } 
        Node_Milan new_node = new Node_Milan(new_data); 
        new_node.next = prev_Node_Milan.next; 
        prev_Node_Milan.next = new_node; 
        new_node.prev = prev_Node_Milan; 
        if (new_node.next != null) 
            new_node.next.prev = new_node; 
    } 
    void append(int new_data) { 
        Node_Milan new_node = new Node_Milan(new_data);  
        Node_Milan last = head; 
        new_node.next = null; 
        if (head == null) { 
            new_node.prev = null; 
            head = new_node; 
            return; 
        } 
        while (last.next != null) 
            last = last.next; 
        last.next = new_node; 
        new_node.prev = last; 
    } 
    public void printlist(Node_Milan node)  { 
        Node_Milan last = null; 
        System.out.println("Traversal in forward Direction"); 
        while (node != null) { 
            System.out.println(node.data ); 
            last = node; 
            node = node.next; 
        } 
        System.out.println(); 
        System.out.println("Traversal in reverse direction"); 
        while (last != null) { 
            System.out.println(last.data + " "); 
            last = last.prev; 
        } 
    } 
    public static void main(String[] args)   { 
        Scanner sc=new Scanner(System.in);
        DLL dll_Milan = new DLL(); 
        System.out.print("Enter the size of data you want to add at beginning:");
        int n1=sc.nextInt();
        for(int i=0;i<n1;i++){
            dll_Milan.push(sc.nextInt());
        }
        System.out.print("\nEnter the size of data you want to add at end:");
        int n2=sc.nextInt();
        for(int i=0;i<n2;i++){
            dll_Milan.append(sc.nextInt());
        } 
        dll_Milan.InsertAfter(dll_Milan.head.next, 23); 
        System.out.println("Created DLL is: "); 
        dll_Milan.printlist(dll_Milan.head); 
        System.out.println("MiLan,B,10");
    } 
}
