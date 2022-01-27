/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA;

/**
 *
 * @author KING
 */
import java.util.Scanner;
class Factorial {
    int fact_Milan(int n_Milan){
        int result;
        if(n_Milan==1)
            return 1;
        result=n_Milan*fact_Milan(n_Milan-1);
        return result;
    }
}
class FactorialDemo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Factorial f_Milan=new Factorial();
        System.out.print("Enter a number ");
        int n_Milan=sc.nextInt();
        System.out.println("Factorial of "+n_Milan+" is "+f_Milan.fact_Milan(n_Milan));
        System.out.println("Milan,B,11");
    }
}
