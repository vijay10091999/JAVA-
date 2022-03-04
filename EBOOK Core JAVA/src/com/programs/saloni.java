package com.programs;


abstract class A{
	int i = 10;
	abstract void display();
}
class B extends A{
	int i;
	void display() {
		System.out.println(i);
	}
}




public class saloni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  A obj = new B();
  obj.i = 2;
  obj.display();
	}

}
