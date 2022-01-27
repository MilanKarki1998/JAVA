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
class Sum {
    int sum_Milan(int n){
        int result;
        if(n==1)
            return 1;
        result=n+sum_Milan(n-1);
        return result;
    }
}
class SumDemo{
    public static void main(String args[]){
        Scanner sc_Milan=new Scanner(System.in);
        Sum s_Milan=new Sum();
        System.out.print("Enter a number ");
        int n=sc_Milan.nextInt();
        System.out.println("Sum is "+s_Milan.sum_Milan(n));
        System.out.println("Milan,B,11");
    }
}
