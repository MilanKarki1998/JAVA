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
import java.util.Scanner;
import java.io.*;
class Student implements Serializable{
  String name;
  int roll;
  float marks;
  File f=new File("D:/studentInfo.txt");
  void getData(){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter name:");
      name=sc.nextLine();
      System.out.println("Enter Roll no.:");
      roll=sc.nextInt();
      System.out.println("Enter marks:");
      marks=sc.nextFloat();
  }
  void writeToFile(Student s)throws Exception{
      FileOutputStream fos=new FileOutputStream(f);
      ObjectOutputStream oos=new ObjectOutputStream(fos);
      oos.writeObject(s);
      fos.close();
      oos.close();
      System.out.println("Writing complete");
  }
  void readfromFile() throws Exception{
      FileInputStream fis=new FileInputStream(f);
      ObjectInputStream ois=new ObjectInputStream(fis);
      Student s1=(Student)ois.readObject();
      System.out.println("name is:"+s1.name);
      System.out.println("Roll is:"+s1.roll);
      System.out.println("Marks is:"+s1.marks);
      fis.close();
      ois.close();
      System.out.println("Reading from file and displaying on screen completed");
  }
}
  public class Answer{
      public static void main(String[] args){
          Student obj=new Student();
          obj.getData();
          try{
              obj.writeToFile(obj);
              obj.readfromFile();
          }catch(Exception e){
              System.out.println("Problem="+e);
          }
      }
  }


