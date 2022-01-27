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
public class OddEven {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rem=num%2;
        if(rem==0)
            System.out.println(num+" is Even number.");
        else
            System.out.println(num+" is Odd number.");
        System.out.println("Arun Shahi Sec=A Roll no.:5");
    }
}
