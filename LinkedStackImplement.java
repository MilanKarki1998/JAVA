/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools_Milan | Templates
 * and open the template in the editor.
 */
package DSA;

/**
 *
 * @author KING
 */
import java.util.Scanner;
class Node_Milan{
    protected int data;
    protected Node_Milan next;
    public Node_Milan(){
        next = null;
        data = 0;
    }
    public Node_Milan(int d){
        data = d;
        next = null;
    }
}
class linkedStack{
    protected Node_Milan top ;
    protected int size ;
    public linkedStack(){
        top = null;
        size = 0;
    }
    public boolean isEmpty(){
        return top == null;
    }
    public void push(int data){
        Node_Milan ptr = new Node_Milan (data);
        if (top == null)
        top = ptr;
        else{
            ptr.next = top;
            top = ptr;
        }
        size++ ;
    }
    public int pop(){
        if (isEmpty() )
        return 0;
        Node_Milan ptr = top;
        top = ptr.next;
        size-- ;
        return ptr.data;
    }
    public void display(){
        if (size == 0){
            System.out.print("Empty\n");
            return ;
        }
        Node_Milan ptr = top;
        while (ptr != null)
        {
            System.out.print(ptr.data+" ");
            ptr = ptr.next;
        }
        System.out.println();
    }
}
public class LinkedStackImplement{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        linkedStack ls_Milan = new linkedStack();
        System.out.print("Enter the size of link list:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            ls_Milan.push(sc.nextInt());
            System.out.println("Stack Push Opertaion");
            ls_Milan.display();
        }
        System.out.println("Stack Pop opertaion:");
        for(int i=0;i<n;i++){
            ls_Milan.pop();
            ls_Milan.display();
        }
        System.out.println("MiLan,B,10");
    }
}
