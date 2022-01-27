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
import java.util.*; 
import java.util.Scanner;
class PrefixDemo{ 
    static boolean isOperator(char mk) 
    { 
        return (!(mk >= 'a' && mk <= 'z') &&  
                !(mk >= '0' && mk <= '9') &&  
                !(mk >= 'A' && mk <= 'Z')); 
    }  
    static int getPriority(char MK) 
    { 
        if (MK == '-' || MK == '+') 
            return 1; 
        else if (MK == '*' || MK == '/') 
            return 2; 
        else if (MK == '^') 
            return 3; 
        return 0; 
    }  
    static String infixToPrefix(String infix_Milan) 
    { 
        Stack<Character> operators = new Stack<Character>(); 
        Stack<String> operands = new Stack<String>(); 
        for (int i = 0; i < infix_Milan.length(); i++)  
        {  
            if (infix_Milan.charAt(i) == '(')  
            { 
                operators.push(infix_Milan.charAt(i)); 
            } 
            else if (infix_Milan.charAt(i) == ')')  
            { 
                while (!operators.empty() &&  
                    operators.peek() != '(')  
                    {  
                    String milan1 = operands.peek(); 
                    operands.pop();
                    String milan2 = operands.peek(); 
                    operands.pop(); 
                    char op = operators.peek(); 
                    operators.pop();  
                    String MKarki = op + milan2 + milan1; 
                    operands.push(MKarki); 
                } 
                operators.pop(); 
            }  
            else if (!isOperator(infix_Milan.charAt(i)))  
            { 
                operands.push(infix_Milan.charAt(i) + ""); 
            } 
            else 
            { 
                while (!operators.empty() &&  
                    getPriority(infix_Milan.charAt(i)) <=  
                        getPriority(operators.peek()))  
                    { 
                    String milan1 = operands.peek(); 
                    operands.pop(); 
                    String milan2 = operands.peek(); 
                    operands.pop(); 
                    char milan = operators.peek(); 
                    operators.pop(); 
                    String MKarki = milan + milan2 + milan1; 
                    operands.push(MKarki); 
                } 
                operators.push(infix_Milan.charAt(i)); 
            } 
        } 
        while (!operators.empty())  
        { 
            String milan1 = operands.peek(); 
            operands.pop(); 
            String milan2 = operands.peek(); 
            operands.pop(); 
            char op = operators.peek(); 
            operators.pop(); 
            String MKarki = op + milan2 + milan1; 
            operands.push(MKarki); 
        } 
        return operands.peek(); 
    } 
    public static void main(String args[]) 
    { 
         Scanner karki=new Scanner(System.in);
        System.out.println("Enter Infix Expression:");
        String Milan =karki.nextLine(); 
        System.out.println("Infix expression into Postfix Conversion is:"); 
        System.out.println( infixToPrefix(Milan));
        System.out.println("MiLan,B,11");
    } 
} 
