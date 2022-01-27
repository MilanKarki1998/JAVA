/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
class Money{
    int rupee;
    int paisa;
    void setMoney(int r,int p){
        rupee=r;
        paisa=p;
    }
    void displayMoney(){
        System.out.println(+rupee+"."+paisa);
    }
    void addMoney(Money m1,Money m2){
        this.paisa=m1.paisa+m2.paisa;
        this.rupee=this.paisa/100;
        this.paisa=this.paisa%100;
        this.rupee=this.rupee+m1.rupee+m2.rupee;
    }
}
class MoneyTest {
    public static void main(String[] args){
        Money bag1=new Money();
        Money bag2=new Money();
        Money bag3=new Money();
        bag1.setMoney(5,75);
        bag2.setMoney(7,30);
        bag3.addMoney(bag1,bag2);
        System.out.println("Money in bag1: ");
        bag1.displayMoney();
        System.out.println("Money in bag2: ");
        bag2.displayMoney();
        System.out.println("Money in bag3: ");
        bag3.displayMoney();
        System.out.println("Milan,B,11");
    }
}
