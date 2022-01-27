/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KING
 */
import java.util.Scanner;
public class Matrix {
    public static void main(String[] args){
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Square Matrix");
        n=sc.nextInt();
        int Matrix[][]=new int[n][n];
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print("["+i+"]["+j+"]=");
                Matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Diagonal of Matrix is");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i==j){
                    System.out.println("["+i+"]["+j+"]="+Matrix[i][j]);
                }
            }
        }
    }
}
