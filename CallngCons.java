/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KING
 */
class A { 
    A() { 
    System.out.println("Inside A's constructor."); 
    }
}  
class B extends A {
    B() { 
        System.out.println("Inside B's constructor."); 
    } 
} 
class C extends B { 
    C(){ 
        System.out.println("Inside C's constructor."); 
    } 
} 
class CallingCons { 
    public static void main(String args[]) { 
        C c = new C();
        System.out.println("Milan,B,11");
    } 
}

