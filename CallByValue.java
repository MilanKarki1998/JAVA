/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
class MyTest{
    void myMethod(int i,int j){
        i=i+2;
        j=j/2;
    }
}
class CallByValue {
    public static void main(String[] args){
        MyTest ob=new MyTest();
        int a=20,b=50;
        System.out.println("A and B before call: "+a+" "+b);
        ob.myMethod(a,b);
        System.out.println("A and B after call: "+a+" "+b);
        System.out.println("Milan,B,11"); 
    }
}
