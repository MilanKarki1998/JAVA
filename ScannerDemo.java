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
public class ScannerDemo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name;
        int age;
        double salary;
        System.out.println("Enter your name: ");
        name=sc.nextLine();
        System.out.println("Enter your age: ");
        age=sc.nextInt();
        System.out.println("Enter your salary: ");
        salary=sc.nextDouble();
        System.out.println("Your detail is: ");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
        System.out.println("Arun Shahi Sec=A Roll no.:5");
    }
    
}
