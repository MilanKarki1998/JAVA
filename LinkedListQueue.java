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
class QNode_Milan{
    public int info;
    public QNode_Milan next;
    public QNode_Milan(){
        info = 0;
        next = null;
    }
    public QNode_Milan(int el){
        info = el;
        next = null;
    }
}
class Queue{
    private QNode_Milan front;
    private QNode_Milan rear;
    public Queue(){
        front = null;
        rear = null;
    }
    public boolean isEmpty(){
        return front==null;
    }
    public void enqueue(int el){
        QNode_Milan temp = new QNode_Milan(el);
        if(rear==null){
            rear = temp;
            front = rear;
        }
        else{
            rear.next = temp;
            rear = temp;
        }
    }
    public void dequeue(){
        QNode_Milan temp;
        if(front==null){
            System.out.println("Queue is empty");
            front = rear = null;
        }
        else{
            front = front.next;
        }
    }
    public void display()
    {
        QNode_Milan temp = front;
        while (temp != null)
        {
            System.out.print(temp.info+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class LinkedListQueue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Queue q_Milan = new Queue();
        System.out.print("Enter the size of link list:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            q_Milan.enqueue(sc.nextInt());
            System.out.println("Dequeue Operation:");
            q_Milan.display();
        }
        for(int i=0;i<n;i++){
        System.out.println("Dequeue Operation:");
        q_Milan.dequeue();
        q_Milan.display();
        }
        System.out.println("MiLan,B,10");
    }
}
