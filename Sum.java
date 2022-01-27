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
public class Sum {
    public static void main(String[] args){
    int sum=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Rows=");
    int Rows = sc.nextInt();
    System.out.println("Column");
    int Cols = sc.nextInt();
    int matrix[][] = new int[Rows][Cols];
    for (int i=0; i<Rows; i++)
    {
        for (int j = 0; j <Cols; j++)
        {
            matrix[i][j]=(i+1)+(j+1);
       }
   System.out.println();
    }
    for (int i = 0; i <Rows; i++)
    {
        for (int j = 0; j <Cols; j++)
        {
            sum=sum+matrix[i][j];
        }
    }
      System.out.println("Sum="+sum);
    }
}