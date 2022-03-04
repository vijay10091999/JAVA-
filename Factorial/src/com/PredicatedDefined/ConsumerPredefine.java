package com.PredicatedDefined;

import java.util.function.Consumer;

public class ConsumerPredefine {

	public static void main(String[] args) {
	Consumer<String> c1 = name -> System.out.println("Student name" +name);
	c1.accept("vijay");
	c1.accept("Ajay");
	
	Consumer<Integer> c2 = m ->System.out.println(m*2);
	Consumer<Integer> c3 = n ->System.out.println(n*n*n);
	c2.andThen(c3).accept(2);
	c3.andThen(c2).accept(7);
	}

}
