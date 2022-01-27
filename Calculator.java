/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
class Calculator {
    float num1;
    float num2;
    Calculator(float num1,float num2){
        this.num1=num1;
        this.num2=num2;
    }
    float sum(){
        float s;
        s=this.num1+this.num2;
        return s;
    }
    void display(){
        System.out.println("Value of num1="+num1);
        System.out.println("Value of num2="+num2);
    }
    public static void main(String[] args){
        Calculator c1=new Calculator(7.5f,3.5f);
        Calculator c2=new Calculator(3.6f,2.3f);
        System.out.println("Value in c1:");
        c1.display();
        System.out.println("Sum of c1 is="+c1.sum());
        System.out.println("Value in c2:");
        c2.display();
        System.out.println("Sum of c2 is="+c2.sum());
        System.out.println("Milan,B,11");
    }
}
