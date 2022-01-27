/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
class Student1 {
    int roll;
    double fee;
    String name;
    Student1(){
        System.out.println("Object has been created");
        roll=5;
        fee=575.5;
        name="Milan";
    }
    public static void main(String[] args){
        Student1 s1=new Student1();
        System.out.println("Roll no is="+s1.roll);
        System.out.println("Fee is="+s1.fee);
        System.out.println("Name is="+s1.name);
        Student1 s2=new Student1();
        System.out.println("Roll no is="+s2.roll);
        System.out.println("Fee is="+s2.fee);
        System.out.println("Name is="+s2.name);
        System.out.println("Milan,B,11");
    }
}
