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
public abstract class Fmachine {
    abstract void getdata();
   abstract void putdata(String b,int a,int c);
        
    }
class Airplane extends Fmachine{
    int code;
    String name;
    int capacity;
    void putdata(String b,int a,int c){
        code=a;
        name=b;
        capacity=c;
    }
    public void getdata(){
        System.out.println("code="+code+"name="+name+"capacity="+capacity);
       
    }   
    }
class Apply{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Airplane ab=new Airplane();
        System.out.println("enter name,code and capacity");
        ab.putdata(sc.nextLine(),sc.nextInt(),sc.nextInt());
        ab.getdata();
    }
}