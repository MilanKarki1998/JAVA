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
public class BreakStatementExample {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        int passedRoll[]={1,2,3,4,5,6,10,15};
        boolean result=false;
        System.out.println("Enter your roll no:");
        n=sc.nextInt();
        for(int r:passedRoll){
            if(r==n){
                result=true;
                break;
            }
        }
        if(result)
            System.out.println("You are Passed");
        else
            System.out.println("You are Failed");
        System.out.println("Milan,B,11");
    }
}
   
