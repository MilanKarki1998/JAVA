/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
class Outer_Demo{
    private int num=175;
    public class Inner_Demo{
        public int getNum(){
            System.out.println("This is the getNum method of inner class");
            return num;
        }
    }
}
public class My_Class {
    public static void main(String[] args){
        Outer_Demo outer=new Outer_Demo();
        Outer_Demo.Inner_Demo inner=outer.new Inner_Demo();
        System.out.println(inner.getNum());
        System.out.println("Milan,B,11");
    }
}
