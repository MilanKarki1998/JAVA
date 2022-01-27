/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class TestGarbage {
    protected void finalize(){ 
        System.out.println("object is garbage collected"); 
    } 
    public static void main(String args[]){ 
        TestGarbage s1=new TestGarbage(); 
        TestGarbage s2=new TestGarbage(); 
        s1=null; 
        s2=null;
        System.gc();
        System.out.println("Milan,B,11");
    } 
}
