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
class Queue_Karki { 
    private static int front, rear, capacity; 
    private static int queue[]; 
    Queue_Karki(int milan) 
    { 
        front = rear = 0; 
        capacity = milan; 
        queue = new int[capacity]; 
    }  
    static void queueEnqueue(int data_Milan) 
    { 
        if (capacity == rear) { 
            System.out.printf("Queue is full\n"); 
        } 
        else { 
            queue[rear] = data_Milan; 
            rear++; 
        }
    } 
    static void queueDequeue() 
    { 
        if (front == rear) { 
            System.out.printf("Queue is empty\n"); 
        } 
        else { 
            for (int i = 0; i < rear - 1; i++) { 
                queue[i] = queue[i + 1]; 
            } 
            if (rear < capacity) 
                queue[rear] = 0; 
            rear--; 
        } 
    } 
    static void queueDisplay() 
    { 
        int i_milan; 
        if (front == rear) { 
            System.out.printf("Queue is Empty\n"); 
            return; 
        } 
        for (i_milan = front; i_milan < rear; i_milan++) { 
            System.out.printf(" %d <-- ", queue[i_milan]); 
        } 
    } 
    static void queueFront() 
    { 
        if (front == rear) { 
            System.out.printf("Queue is Empty\n"); 
        } 
        System.out.printf("\nFront Element is: %d", queue[front]); 
    } 
} 
public class QueuesDemo {
    public static void main(String[] args) 
    {  
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Queues");
        int MilanKarki=sc.nextInt();
        Queue_Karki KMilan= new Queue_Karki(MilanKarki);
        KMilan.queueDisplay();
        System.out.println("\nEnter Elements in Queues:");
        for(int i=0;i<MilanKarki;i++){
            int milan=sc.nextInt();
            KMilan.queueEnqueue(milan);
        } 
        KMilan.queueDisplay();
        for(int i_karMilan=0;i_karMilan<MilanKarki;i_karMilan++){
            KMilan.queueDequeue();
            System.out.printf("\nAfter node deletion:\n");
            KMilan.queueDisplay(); 
        }
        System.out.println("MiLan,B,11");
    } 
}