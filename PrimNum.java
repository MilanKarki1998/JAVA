/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KING
 */
public class PrimNum {
    public static void main(String[] args) {
        int num = 7;
        int count=0;
        for(int i = 2; i <num; ++i)
        {
            if(num % i == 0)
                count++; 
            }
            if(count==0)
                System.out.println(num + " is a prime number.");
            else
                System.out.println(num + " is not a prime number.");
        }
}
