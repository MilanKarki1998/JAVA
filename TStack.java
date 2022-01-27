/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extra;

/**
 *
 * @author KING
 */
import java.util.Scanner;
class Stack{
    int MAX = 100;
    int stck[]=new int[MAX];
    int top;
    Stack(){
        top=-1;
    }
    void push(int value){
        if(top==(MAX-1)){
            System.out.println("Stack is full");
        }
        else{
            top++;
            stck [top]=value;
            System.out.println(value + " pushed into stack");
        }
    }
    int pop(){
        if(top<0){
           System.out.println("Stack is underflow");
           return 0;
        }
        else{
            int value=stck[top];
            top--;
            return value;
        }
    }
}
class TStack {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Stack myStack1=new Stack();
        System.out.println("Enter size of stack:");
        int n=sc.nextInt();
        System.out.println("Enter value in stack:");
        System.out.println("\nPUSH operation:");
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            myStack1.push(a);
        }
        System.out.println("\nPOP operation: ");
        for(int i=0;i<n;i++){
            System.out.println(myStack1.pop() + " Popped from stack");
        }
    }
}

