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
class LinkedList{ 
    Node_Milan head; 
    class Node_Milan { 
        int data; 
        Node_Milan next; 
        Node_Milan(int d) {data = d; next = null; } 
    } 
    public void push(int new_data)    { 
        Node_Milan new_node = new Node_Milan(new_data); 
        new_node.next = head; 
        head = new_node; 
    } 
    public void insertAfter(Node_Milan prev_node, int new_data)   { 
        if (prev_node == null) { 
            System.out.println("The given previous node cannot be null"); 
            return; 
        } 
        Node_Milan new_node = new Node_Milan(new_data); 
        new_node.next = prev_node.next; 
        prev_node.next = new_node; 
    } 
    public void append(int new_data)  { 
        Node_Milan new_node = new Node_Milan(new_data); 
        if (head == null){ 
            head = new Node_Milan(new_data); 
            return; 
        } 
        new_node.next = null; 
        Node_Milan last = head;  
        while (last.next != null) 
            last = last.next; 
        last.next = new_node; 
        return; 
    } 
    public void printList() { 
        Node_Milan tnode = head; 
        while (tnode != null) 
        { 
            System.out.print(tnode.data+" "); 
            tnode = tnode.next; 
        } 
    } 
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        LinkedList llist_Milan = new LinkedList(); 
        System.out.print("Enter the size of data you want to add at beginning:");
        int n1=sc.nextInt();
        for(int i=0;i<n1;i++){
            llist_Milan.push(sc.nextInt());
        }
        llist_Milan.printList();
        System.out.print("\nEnter the size of data you want to add at end:");
        int n2=sc.nextInt();
        for(int i=0;i<n2;i++){
            llist_Milan.append(sc.nextInt());
        } 
        llist_Milan.printList();
        llist_Milan.insertAfter(llist_Milan.head.next, 8);
        System.out.println("\nCreated Linked list is: "); 
        llist_Milan.printList(); 
        System.out.println("\nMiLan,B,10");
    } 
}
