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
public class Attendancedemo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("No of classes held");
        float x=sc.nextFloat();
        System.out.println("No of classes attend");
        float y=sc.nextFloat();
        float pf=((y*100)/x);
        System.out.println("Percentage of classes attend: "+pf);
        if(pf>=75)
            System.out.println("Allowed to sit in exam:"+pf);
        else 
            System.out.println("Not allowed to sit in exam:"+ pf);
    System.out.println("Milan,B,11");
    }  
}
