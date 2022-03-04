package com.programs;

public class hhh extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   hhh t = new hhh();
   t.start();
   System.out.println("one");
   t.start();
   System.err.println("two");
	}
public void run() {
	System.out.println("Thread");
}
}
