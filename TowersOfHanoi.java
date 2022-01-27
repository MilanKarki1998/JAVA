/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA;

/**
 *
 * @author KING
 */
import java.util.Scanner;
    public class TowersOfHanoi {
    static void towerOfHanoi_Milan(int n, char from_rod, char to_rod, char aux_rod) { 
        if (n == 1) { 
            System.out.println("Move disk 1 from rod " +  from_rod + " to rod " + to_rod); 
            return; 
        } 
        towerOfHanoi_Milan(n-1, from_rod, aux_rod, to_rod);
        System.out.println("Move disk " + n + " from rod " +  from_rod + " to rod " + to_rod); 
        towerOfHanoi_Milan(n-1, aux_rod, to_rod, from_rod); 
    } 
    public static void main(String args[]) { 
        System.out.println("Enter number of disks :- ");
		Scanner scanner = new Scanner(System.in);
		int n_Milan = scanner.nextInt(); 
                System.out.println("Move disks as below illustration.");
                towerOfHanoi_Milan(n_Milan, 'A', 'C', 'B');  
                System.out.println("Milan,B,11");
    } 
}