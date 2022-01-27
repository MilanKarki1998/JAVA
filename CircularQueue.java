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
public class CircularQueue{
    public static void main(String args[]){
        Queue_Milan KMilan = new Queue_Milan();
        int karki;
        Scanner mil =new Scanner(System.in);
        do{
            System.out.println("Menu\n1.insert\t2.delete\t3.display\t4.destroy\t5.exit");
            System.out.print("Enter choice :");
            karki=mil.nextInt();
            switch(karki){
                case 1:
                    System.out.print("Enter data to insert:");
                    int mk=mil.nextInt();
                    KMilan.insert(mk);
                break;
                case 2:
                    if(KMilan.empty())
                    System.out.println("Queue underflow");
                    else{
                        int km =KMilan.delete();
                        System.out.println("data deleted =" + km );
                    }
                break;
                case 3: KMilan.display();
                break;
                case 4: KMilan.destroy();
                break;
                case 5: break;
                default : System.out.println("Wrong Choice");
            }
        }while(karki!=5);
        System.out.println("MiLan,B,11");
    }
}
class Queue_Milan{
    int mk[];
    int front, rear;
    Queue_Milan(){
        mk = new int [100];
        front = rear = 1;
    }
    Queue_Milan(int size){
        mk = new int[size];
        front = rear = -1;
    }
    void insert(int x){
        int mi;
        mi = (rear+1)% mk.length;
        if(mi == front)
            System.out.println("Queue Overflow ");
        else
        {
            rear = mi;
            mk[rear] = x;
            if(front == -1)
               front = 0;
        }
    }
    boolean empty()
    {
        if(front == -1)
            return true;
        else
            return false;
    }
    int delete(){
        int kar = mk[front];
        if(front == rear)
            front = rear = -1;
        else
            front =(front+1)% mk.length;
        return kar;
    }
    void display(){
        if(front == -1)
           System.out.println("Queue underflow");
        else{
            System.out.println("Elements of Queue are");
            int i = front;
            while(i != rear)
            {
                System.out.println(mk[i]);
                i = (i+1)% mk.length;
            }
            System.out.println(mk[i]);
        }
    }
    void destroy(){
        front = rear=-1;
    }
}