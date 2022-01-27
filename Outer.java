/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Outer {
    //static inner class
    static class Nested_Demo{
        public void my_Method(){
            System.out.println("I am from static nested class");
        }
    }//end of inner class
    public static void main(String[] args){
        Outer.Nested_Demo ob=new Outer.Nested_Demo();
        ob.my_Method();
        System.out.println("Milan,B,11");
    }
}
