/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
class Factorial {
    int fact(int n){
        int result;
        if(n==1)
            return 1;
        result=n*fact(n-1);
        return result;
    }
}
class Recursion{
    public static void main(String args[]){
        Factorial f=new Factorial();
        System.out.println("Factorial of 3 is "+f.fact(3));
        System.out.println("Factorial of 5 is "+f.fact(5));
        System.out.println("Milan,B,11");
    }
}
