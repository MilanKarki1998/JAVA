/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
class Demo{
    int a,b;
    Demo(int i,int j){
        a=i;
        b=j;
    }
    boolean equalTo(Demo obj){
        if(this.a==obj.a&&this.b==obj.b)
            return true;
        else
            return false;
    }
}
class PassObj {
    public static void main(String[] args){
        Demo ob1=new Demo(22,25);
        Demo ob2=new Demo(-3,20);
        Demo ob3=new Demo(22,25);
        boolean test1,test2;
        test1=ob1.equalTo(ob2);
        test2=ob1.equalTo(ob3);
        System.out.println("Ob1 equal to ob2: "+test1);
        System.out.println("Ob1 equal to ob3: "+test2);
        System.out.println("Milan,B,11");   
    }
}
