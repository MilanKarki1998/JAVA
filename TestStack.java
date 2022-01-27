/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
class Stack{
    int stck[]=new int[10];
    int tos;
    Stack(){
        tos=-1;
    }
    void push(int item){
        if(tos==9){
            System.out.println("Stack is full");
        }
        else{
            stck [++tos]=item;
        }
    }
    int pop(){
        if(tos<0){
           System.out.println("Stack is underflow");
           return 0;
        }
        else{
            return stck[tos--];
        }
    }
}
class TestStack {
    public static void main(String[] args){
        Stack myStack1=new Stack();
        Stack myStack2=new Stack();
        for(int i=0;i<10;i++){
            myStack1.push(i);
        }
        for(int i=10;i<20;i++){
            myStack2.push(i);
        }
        System.out.println("The value in myStack1: ");
        for(int i=0;i<10;i++){
            System.out.println(myStack1.pop());
        }
        System.out.println("The value in myStack2: ");
        for(int i=0;i<10;i++){
            System.out.println(myStack2.pop());
        }
        System.out.println("Arun,A");
    }
}
