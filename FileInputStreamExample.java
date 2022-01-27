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
import java.io.*;
public class FileInputStreamExample {
public static void main(String[] args) {
	File f1=new File("D:/myfile.txt");
	File f2=new File("D:/myfile2.txt");
	try {
		FileInputStream fis=new FileInputStream(f1);
		FileOutputStream fos=new FileOutputStream(f2);
		int i=0;
		while((i=fis.read())!=-1) {
		char c=(char)i;
		 fos.write(c);
		}
		fos.close();
		fis.close();
		System.out.println("content is transferred");
	}catch(IOException e) {
		System.out.println("problem occure: "+e);
	}
}
}
