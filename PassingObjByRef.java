/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
class MyTest2{
    int a,b;
    MyTest2(int i,int j){
        a=i;
        b=j;
    }
    void myMethod(MyTest2 obj){
        obj.a=obj.a*2;
        obj.b=obj.b/2;
    }
}
class PassingObjByRef {
    public static void main(String[] args){
        MyTest2 ob=new MyTest2(20,50);
        System.out.println("A and B before call: "+ob.a+" "+ob.b);
        ob.myMethod(ob);
        System.out.println("A and B after call: "+ob.a+" "+ob.b);
        System.out.println("Milan,B,11"); 
    }
}

