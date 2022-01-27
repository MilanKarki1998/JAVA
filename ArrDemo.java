/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extra;

/**
 *
 * @author KING
 */
import java.util.Scanner;
public class ArrDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array Size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Number Divisible by 3 and 7 is:s");
        for(int i=0;i<n;i++){
            if(arr[i]%3==0&&arr[i]%7==0){
            System.out.println(+arr[i]);
            }
        }
    }
}
