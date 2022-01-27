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
public class Array {
    public static void main(String[] args) {
        int arr[]=new int[50];
        for(int i=0;i<50;i++){
            arr[i]=i+1;
        }
        for(int i=0;i<50;i++){
            if(arr[i]==15||arr[i]==25)
                continue;
            System.out.println(+arr[i]);
        }
    }
}
