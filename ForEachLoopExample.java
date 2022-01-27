/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class ForEachLoopExample {
    public static void main(String args[]){
        int myArray[]={1,9,33,56,34,80};
        int sum=0;
        for(int x:myArray){
            sum=sum+x;
        }
        System.out.println("Sum= "+sum);
        System.out.println("Milan,B,11");
    }
}
