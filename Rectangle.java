/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
class Rectangle {
    int length;
    int breadth;
    void ComputeArea(int l,int b){
        length=l;
        breadth=b;
    }
    void DisplayArea(){
        System.out.println("area= "+length*breadth);
    }
     public static void main(String[] args){
         Rectangle r1=new Rectangle();
         Rectangle r2=new Rectangle();
         r1.ComputeArea(4,7);
         r2.ComputeArea(28,9);
         System.out.println("In rectangle r1");
         r1.DisplayArea();
         System.out.println("In rectangle r1");
         r2.DisplayArea();
         System.out.println("Milan,B,11");
    }

}
