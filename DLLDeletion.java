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
public class DLLDeletion {  
    class Node_Milan{  
        int data;  
        Node_Milan previous;  
        Node_Milan next;   
        public Node_Milan(int data) {  
            this.data = data;  
        }  
    }  
  public int size = 0;   
    Node_Milan head, tail = null;    
    public void addNode_Milan(int data) {  
        Node_Milan newNode_Milan = new Node_Milan(data); 
        if(head == null) {    
            head = tail = newNode_Milan;    
            head.previous = null;   
            tail.next = null;  
        }  
        else {   
            tail.next = newNode_Milan;   
            newNode_Milan.previous = tail;  
            tail = newNode_Milan;   
            tail.next = null;  
        }   
        size++;  
    }  
    public void deleteFromStart() {  
        if(head == null) {  
            return;  
        }  
        else {   
            if(head != tail) {   
                head = head.next;   
                head.previous = null;  
            }    
            else {  
                head = tail = null;  
            }  
        }  
    }   
    public void deleteFromEnd() {  
        if(head == null) {  
            return;  
        }  
        else {  
            if(head != tail) {  
                tail = tail.previous;  
                tail.next = null;  
            }   
            else {  
                head = tail = null;  
            }  
        }  
    } 
    public void deleteNode_MilanAtPostion(int position){ 
        if(head == null) {  
            return;  
        }  
        else {              
            Node_Milan current = head;    
            for(int i = 0; i < position; i++){  
                current = current.next;  
            }            
            if(current == head) {  
                head = current.next;  
            }               
            else if(current == tail) {  
                tail = tail.previous;  
            }  
            else {  
                current.previous.next = current.next;  
                current.next.previous= current.previous;  
            }  
             current = null;  
        }  
        size--;  
    }   
    public void display() {  
        Node_Milan current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        while(current != null) {
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }   
    public static void main(String[] args) {  
        Scanner sc=new Scanner(System.in);
        DLLDeletion dList_Milan = new DLLDeletion();
        System.out.print("Enter the size of Link list:");
        int n1=sc.nextInt();
        for(int i=0;i<n1;i++){
             dList_Milan.addNode_Milan(sc.nextInt());
        }
        System.out.println("Original List: ");  
        dList_Milan.display();  
        dList_Milan.deleteFromStart();   
        System.out.println("Updated List after deletion from start: ");  
        dList_Milan.display();  
        dList_Milan.deleteFromEnd();   
        System.out.println("Updated List after deletion from end: ");  
        dList_Milan.display();
        System.out.print("Enter the postion from where you want to delete:");
        int n=sc.nextInt();
        dList_Milan.deleteNode_MilanAtPostion(n);   
        System.out.println("Updated List after deletion at postion "+n+": ");  
        dList_Milan.display(); 
        System.out.println("MiLan,B,10");
        }  
    }  
