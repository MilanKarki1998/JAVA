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
class ThreadNum implements Runnable{
	public void run(){
	try{
	for(int i=1;i<=20;i++){
	System.out.print(i+" ");
	Thread.sleep(2000);
	}
	}catch(InterruptedException e){
	System.out.println("Thread Interrupted");
	}
	}
	}
	public class EvenNumThreadDemo {
	public static void main(String[] args) {
	ThreadNum n = new ThreadNum();
	Thread t = new Thread(n);
	t.start();
	}
	}
