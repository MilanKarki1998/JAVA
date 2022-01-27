/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
class Bank {
    static long phone_no=55555;
    int staff_id;
    static void change(long p){
        phone_no=p;
    } 
    public static void main(String[] args){
        System.out.println("Phone no is: "+Bank.phone_no);
        System.out.println("Calling change method");
        Bank.change(44444);
        System.out.println("Phone no after chang is called: "+Bank.phone_no);
        Bank ob=new Bank();
        ob.staff_id=5;
        System.out.println("Staff id is: "+ob.staff_id);
        System.out.println("Milan,B,11");
    }
}
