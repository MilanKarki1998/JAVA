/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Shape{
    double calculateArea(double l,double b){
        return l*b;
    }
    double calculateArea(double r){
        return 3.14*r*r;
    }
    public static void main(String[] args){
        Shape ob=new Shape();
        System.out.println("The area of rectangle is:");
        System.out.println(ob.calculateArea(5.4,3.4));
        System.out.println("The area of circle is:");
        System.out.println(ob.calculateArea(4.5));
        System.out.println("Milan,B,11");
    }
}
    