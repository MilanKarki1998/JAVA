/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
class Student2 {
    int roll;
    double fee;
    String name;
    Student2(int r,double f,String n){
        roll=r;
        fee=f;
        name=n;
    }
    public static void main(String[] args){
        Student2 s1=new Student2(15,153.56,"Milan");
        System.out.println("Roll no is="+s1.roll);
        System.out.println("Fee is="+s1.fee);
        System.out.println("Name is="+s1.name);
        Student2 s2=new Student2(16,200,"Ram");
        System.out.println("Roll no is="+s2.roll);
        System.out.println("Fee is="+s2.fee);
        System.out.println("Name is="+s2.name);
        System.out.println("Milan,B,11");
    }
}
