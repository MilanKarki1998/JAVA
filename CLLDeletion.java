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
public class CLLDeletion {
    public class Node_Milan{  
        int data;  
        Node_Milan next;  
        public Node_Milan(int data) {  
            this.data = data;  
        }  
    }  
   public int size;    
    public Node_Milan head = null;  
    public Node_Milan tail = null;    
    public void add(int data){  
        Node_Milan newNode_Milan = new Node_Milan(data); 
        if(head == null) {    
            head = newNode_Milan;  
            tail = newNode_Milan;  
            newNode_Milan.next = head;  
        }  
        else {    
            tail.next = newNode_Milan;    
            tail = newNode_Milan;  
            tail.next = head;  
        }   
        size++;  
    }  
    public void deleteStart() {   
        if(head == null) {  
            return;  
        }  
        else {  
            if(head != tail ) {  
                head = head.next;  
                tail.next = head;  
            }   
            else {  
                head = tail = null;  
            }  
        }  
    }   
    public void deleteEnd() {   
        if(head == null) {  
            return;  
        }  
        else {    
            if(head != tail ) {  
                Node_Milan current = head;    
                while(current.next != tail) {  
                    current = current.next;  
                }  
                tail = current;   
                tail.next = head;  
            }    
            else {  
                head = tail = null;  
            }  
        }  
    }  
    public void deleteNode_MilanAtPostion(int position) {  
        Node_Milan current, temp;  
        if(head == null) {  
            return;  
        }  
        else {    
            if( head != tail ) {  
                temp = head;  
                current = null;   
                for(int i = 0; i < position; i++){  
                    current = temp;  
                    temp = temp.next;  
                }                   
                if(current != null) {    
                    current.next = temp.next;
                    temp = null;  
                }    
                else {  
                    head = tail = temp.next;  
                    tail.next = head;  
                    //Delete temp;  
                    temp = null;  
                }                   
            }   
            else {  
                head = tail = null;  
            }  
        }  
        size--;  
    }    
    public void display() {  
        Node_Milan current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {  
             do{    
                System.out.print(" "+ current.data);  
                current = current.next;  
            }while(current != head);  
            System.out.println();  
        }  
    }  
      
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        CLLDeletion cl_Milan = new CLLDeletion(); 
        System.out.print("Enter the size of Link list:");
        int n1=sc.nextInt();
        for(int i=0;i<n1;i++){
             cl_Milan.add(sc.nextInt());
        }
        System.out.println("Original List: ");  
        cl_Milan.display();  
        cl_Milan.deleteStart();   
        System.out.println("Updated List after deletion from start: ");  
        cl_Milan.display();  
        cl_Milan.deleteEnd();   
        System.out.println("Updated List after deletion from end: ");  
        cl_Milan.display();
        System.out.print("Enter the postion from where you want to delete:");
        int n=sc.nextInt();
        cl_Milan.deleteNode_MilanAtPostion(n);   
        System.out.println("Updated List after deletion at postion "+n+": ");  
        cl_Milan.display(); 
        System.out.println("MiLan,B,10");
    }    
}
