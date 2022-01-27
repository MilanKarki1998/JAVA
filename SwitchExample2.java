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
public class SwitchExample2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float res=0;
        System.out.println("Enter two numbers: ");
        float num1=sc.nextFloat();
        float num2=sc.nextFloat();
        System.out.println("Enter an operator: ");
        char op=sc.next().charAt(0);
        switch(op){
            case '+':
                res=num1+num2;
                break;
            case '-':
                res=num1-num2;
                break;
            case '*':
                res=num1*num2;
                break;
            case '/':
                res=num1/num2;
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }
        System.out.println("result is: "+res);
        System.out.println("Milan,B,11");
        }
    }   

