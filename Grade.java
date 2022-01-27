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
public class Grade {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks:");
        int marks=sc.nextInt();
        if(marks<25)
            System.out.println("F");
        else if(marks<45&&marks>=25)
            System.out.println("E");
        else if(marks<50&&marks>=45)
            System.out.println("D");
        else if(marks<60&&marks>=50)
            System.out.println("C");
        else if(marks<80&&marks>=60)
            System.out.println("B");
        else if(marks>=80)
            System.out.println("A");
        else
            System.out.println("Error in result");
        System.out.println("Milan,B,11");
    }
}
