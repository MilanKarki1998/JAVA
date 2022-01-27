/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class NestedSwitchExample {
     public static void main(String[] args){
    int i=0;
    switch(i){
        case 0:
            int j=1;
            switch(j){
                case 0:
                    System.out.println("i is 0,j is 0");
                    break;
                case 1:
                    System.out.println("i is 0,j is 1");
                    break;
                default:
                    System.out.println("Nested default case");
            }
            break;
        default:
            System.out.println("No matching case");
            }
    System.out.println("Milan,B,11");
     }
}
