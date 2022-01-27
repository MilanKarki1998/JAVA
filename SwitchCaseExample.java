/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class SwitchCaseExample {
    public static void main(String[] args){
        System.out.println("Enter any day:");
        Scanner sc=new Scanner(System.in);
        int week=sc.nextInt();
        String day;
        switch(week){
            case 1:
                day="Sunday";
                break;
            case 2:
                day="Monday";
                break;
            case 3:
                day="Tuesday";
                break;
            case 4:
                day="Wednesday";
                break;
            case 5:
                day="Thursday";
                break;
            case 6:
                day="Friday";
                break;
            case 7:
                day="Saturday";
                break;
            default:
                day="Invalid Day";
        }
        System.out.println("Day= "+day);
        System.out.println("Milan,B,11");
    }
}
