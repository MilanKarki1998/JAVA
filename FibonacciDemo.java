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
class  Fibonacci{
    int fibo_Milan(int n_Milan){
        int result;
        if(n_Milan==1){
            return 0;
        }
        else if(n_Milan==2){
            return 1;
        }
        else{
        result=fibo_Milan(n_Milan-1)+fibo_Milan(n_Milan-2);
        return result;
        }
    } 
}
class FibonacciDemo{
    public static void main(String args[]){
        Fibonacci f_Milan=new Fibonacci();
        System.out.println("Fibonacci series for 10 elements: ");
        for(int i=1;i<=10;i++){
            System.out.println(f_Milan.fibo_Milan(i));
        }
        System.out.println("Milan,B,11");
    }
}
