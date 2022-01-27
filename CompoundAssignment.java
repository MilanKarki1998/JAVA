/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class CompoundAssignment {
    public static void main(String[] args){
        int a=10,b=20,c=0;
        c+=a;
        System.out.println("c+=a= "+c);
        c-=a;
        System.out.println("c-=a= "+c);
        c*=a;
        System.out.println("c*=a= "+c);
        a=10;c=15;
        c/=a;
        System.out.println("c/=a= "+c);
        a=10;c=15;
        c%=a;
        System.out.println("c%=a= "+c);
        c<<=2;
        System.out.println("c<<=2= "+c);
        c>>=2;
        System.out.println("c>>=2= "+c);
        c&=a;
        System.out.println("c&=a= "+c);
        c^=a;
        System.out.println("c^=a= "+c);
        c|=a;
        System.out.println("c|=a= "+c);
       System.out.println("Arun Shahi Sec=A Roll no.:5");
    }
}
