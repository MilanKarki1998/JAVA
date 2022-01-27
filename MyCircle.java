/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class MyCircle {
    final double PI=3.14;
    double r;
    void getRad(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        r=sc.nextDouble();
    }
    void circleArea(){
        double d=PI*r*r;
        System.out.println("Area of circle is: "+d);
    }
    public static void main(String[] args){
        MyCircle c1=new MyCircle();
        c1.getRad();
        c1.circleArea();
        System.out.println("Milan,B,11");
    }
}
