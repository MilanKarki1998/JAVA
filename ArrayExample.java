/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class ArrayExample {
    public static void main(String[] args){
        int arr1[];
        arr1=new int[5];
        arr1[0]=2;
        arr1[1]=3;
        arr1[2]=5;
        arr1[3]=7;
        arr1[4]=11;
        System.out.println("The value of 1st element of array arr1 is: "+arr1[0]);
        System.out.println("The value of last element of array arr1 is: "+arr1[4]);
        System.out.println("The length of array arr1 is: "+arr1.length);
        float arr2[]={2.2f,2.5f,2.9f,3.5f,4.0f};
        System.out.println("The value of 3rd element of array arr2 is: "+arr2[2]);
        System.out.println("The length of array arr2 is: "+arr2.length);
        char[] arr3=new char[3];
        arr3[0]='A';
        arr3[1]='B';
        arr3[2]='C';
        System.out.println("The value of 2nd element of array arr3 is: "+arr3[1]);
        System.out.println("The length of array arr3 is: "+arr3.length);
        System.out.println("Arun Shahi Sec=A Roll no.:5");
    }
    
}
