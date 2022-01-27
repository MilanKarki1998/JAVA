/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
class Box{
    double width;
    double height;
    double depth;
    
    void volume()
    {
        System.out.println("The Volume of box is="+width*height*depth);
    }
}
public class BoxTest {
    public static void main(String[] args){
        Box myBox1=new Box();
        Box myBox2=new Box();
        myBox1.width=10;
        myBox1.height=20;
        myBox1.depth=30;
        myBox2.width=5;
        myBox2.height=8;
        myBox2.depth=9;
        myBox1.volume();
        myBox2.volume();
        System.out.println("Milan,B,11");
    }
}
