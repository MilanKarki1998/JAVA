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
public class SinglyLinkedListDeletion {    
    class Node_Milan{  
        int data;  
        Node_Milan next;  
        public Node_Milan(int data) {  
            this.data = data;  
            this.next = null;  
        }  
    }   
    public Node_Milan head = null;  
    public Node_Milan tail = null;   
    public void addNode_Milan(int data) {  
        Node_Milan newNode_Milan = new Node_Milan(data);  
        if(head == null) {   
            head = newNode_Milan;  
            tail = newNode_Milan;  
        }  
        else {    
            tail.next = newNode_Milan;    
            tail = newNode_Milan;  
        }  
    }    
    public void deleteFromStart() {    
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        else {   
            if(head != tail) {  
                head = head.next;  
            }  
            else {  
                head = tail = null;  
            }  
        }  
    }   
    public void deleteFromEnd() {    
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        else {    
            if(head != tail ) {  
                Node_Milan current = head;  
                while(current.next != tail) {  
                    current = current.next;  
                }    
                tail = current;  
                tail.next = null;  
            }    
            else {  
                head = tail = null;  
            }  
        }
    }
    public void deleteNode_MilanAtPostion(int position)   {
        if (head == null)
            return;
        Node_Milan temp = head;
        if (position == 0)  {
            head = temp.next;   
            return;
        }
        for (int i=0; temp!=null && i<position-1; i++)
            temp = temp.next;
        if (temp == null || temp.next == null)
            return;
        Node_Milan next = temp.next.next;
        temp.next = next; 
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
        SinglyLinkedListDeletion sList_Milan = new SinglyLinkedListDeletion();
        System.out.print("Enter the size of Link list:");
        int n1=sc.nextInt();
        for(int i=0;i<n1;i++){
             sList_Milan.addNode_Milan(sc.nextInt());
        }
        System.out.println("Original List: ");  
        sList_Milan.display();  
        sList_Milan.deleteFromStart();   
        System.out.println("Updated List after deletion from start: ");  
        sList_Milan.display();  
        sList_Milan.deleteFromEnd();   
        System.out.println("Updated List after deletion from end: ");  
        sList_Milan.display();
        System.out.print("Enter the postion from where you want to delete:");
        int n=sc.nextInt();
        sList_Milan.deleteNode_MilanAtPostion(n);   
        System.out.println("Updated List after deletion at postion "+n+": ");  
        sList_Milan.display();
        System.out.println("MiLan,B,10");
    }  
}
