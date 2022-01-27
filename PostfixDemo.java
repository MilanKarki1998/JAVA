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
import java.util.Stack;
import java.util.Scanner;
class PostfixDemo {
    static int Prec(char MilKarki) 
    { 
        switch (MilKarki) 
        { 
        case '+': 
        case '-': 
            return 1; 
       
        case '*': 
        case '/': 
            return 2; 
       
        case '^': 
            return 3; 
        } 
        return -1; 
    }   
    static String infixToPostfix(String Milan) 
    { 
        String kMilan = new String(""); 
        Stack<Character> stack = new Stack<>(); 
        for (int i = 0; i<Milan.length(); ++i) 
        { 
            char m = Milan.charAt(i);  
            if (Character.isLetterOrDigit(m)) 
                kMilan += m;  
            else if (m == '(') 
                stack.push(m); 
            else if (m == ')') 
            { 
                while (!stack.isEmpty() && stack.peek() != '(') 
                    kMilan += stack.pop(); 
                if (!stack.isEmpty() && stack.peek() != '(') 
                    return "Invalid Expression";                
                else
                    stack.pop(); 
            } 
            else
            { 
                while (!stack.isEmpty() && Prec(m) <= Prec(stack.peek())) 
                    kMilan += stack.pop(); 
                stack.push(m); 
            } 
        } 
        while (!stack.isEmpty()) 
            kMilan += stack.pop(); 
        return kMilan; 
    }  
    public static void main(String[] args)  
    { 
        Scanner karki=new Scanner(System.in);
        System.out.println("Enter Infix Expression:");
        String Milan =karki.nextLine(); 
        System.out.println("Infix expression into Postfix Conversion is:");
        System.out.println(infixToPostfix(Milan)); 
        System.out.println("MiLan,B,11");
    } 
} 
