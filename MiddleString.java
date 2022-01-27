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
public class MiddleString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a string: ");
        String str = sc.nextLine();
        System.out.println("Middle character of the string is is "+str.charAt(str.length()/2));
    }
}
