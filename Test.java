/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extra;
/**
 *
 * @author KING
 */
interface Compute{
    void add(double x,double y);
    void diff(double x,double y);
}
class Test implements Compute{
    public void add(double x, double y){
        System.out.println("sum is:"+(x+y));
    }
    public void diff(double x, double y){
        System.out.println("different is:"+(x-y));
    }
    public static void main(String args[]){
        Test obj = new Test();
        obj.add(34,89);
        obj.diff(6,8);
    }
}
