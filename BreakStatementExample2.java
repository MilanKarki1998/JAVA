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
public class BreakStatementExample2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        char c;
        int sum=0;
        while(true){
            System.out.println("Enter a number:");
            n=sc.nextInt();
            sum=sum+n;
            System.out.println("Another number?(Y/N):");
            c=sc.next().charAt(0);
            if(c=='n'||c=='N'){
                break;
            }
        }
        System.out.println("The sum of number="+sum);
        System.out.println("Milan,B,11");
    }
}
