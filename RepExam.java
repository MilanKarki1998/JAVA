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
class RepExam {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str[]=new String[10];
        System.out.println("Enter 10 Strings");
        for(int i=0;i<10;i++){
            System.out.print("Enter String"+(i+1)+": ");
            str[i]=sc.nextLine();
        }
        for(int i=0;i<10;i++){
        String rs1=str[i].replace("i","!");
        System.out.print(rs1+"\n");
        }
    }
}
        
      
