/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author K!NG
 * Lab 39:a)Working with Vararg method:
 */
class VarArgDemo {
    static void myMethod(int ...a){
        System.out.println("I am vararg Method");
        System.out.println("Number of variable argument in this call= "+a.length);
        System.out.println("And the variable arguments are as follows:");
        for(int x:a){
            System.out.print(x+" ");
        }
        System.out.println("\n.................");
    }
    static void anotherMethod(String s,int ...b){
        System.out.println("I am vararg Method");
        System.out.println("Number of variable argument in this call= "+b.length);
        System.out.println("And the variable arguments are as follows:");
        for(int x:b){
            System.out.print(x+" ");
        }
        System.out.println("\n.................");
    }
  
    public static void main(String[] args){
        myMethod();
        myMethod(1,10);
        myMethod(0,2,6,8);
        anotherMethod("First");
        anotherMethod("Second",2,3);
        anotherMethod("Third",0,1,5);
    }
}
