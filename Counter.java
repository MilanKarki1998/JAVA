/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
class Counter {
    static int count=0;
    Counter(){
        count=count+1;
        System.out.println("Value of count= "+count);
    }
    public static void main(String[] args){
        Counter c1=new Counter();
        Counter c2=new Counter();
        Counter c3=new Counter();
        System.out.println("Milan,B,11");
    }
}
