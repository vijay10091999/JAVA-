package com.PredicatedDefined;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicatePreDefinedFunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 =5 ;
		if(n1%2==0) {
			//System.out.println(n1+ " Even No");
		}
		else {
			//System.out.println(n1+ " Odd No");
		}
Predicate<Integer> p1 = num1 -> num1%2 ==0;
//System.out.println("check even or odd No if even give true else false" + p1.test(4));
	

	ArrayList<Integer> number = new ArrayList<Integer>();
	number.add(12);
	number.add(39);
	number.add(89);
	for(int i = 0;i<number.size();i++) {
		if(number.get(i)%2 ==0) {
		//System.out.println(number.get(i)+"Even No");
	}
	else {
		//System.out.println(number.get(i)+"Odd No");
	}
}
	
	/*using predicated*/
	for(int i = 0;i<number.size();i++) {
		if(p1.test(number.get(i))) {
		//System.out.println(number.get(i)+ " Even No");
	}
	else {
		//System.out.println(number.get(i)+ " Odd No");
	}
}
	
  boolean odd = p1.negate().test(20);
  //System.out.println("This is odd or not" +odd);
  
  
  /* use AND or function*/
  Predicate<Integer> p2 = num2 -> num2%2 != 0;
  Predicate<Integer> p3 = num3 -> num3>50;
  
  for(Integer i : number) {
	  if(p2.and(p3).test(i)) {
		  System.out.println("Check AND Condition"+i);
	  }
	  if(p2.or(p3).test(i)) {
		  System.out.println("Check OR Condition"+i);
	  }
  }
  
  List<String> a = Arrays.asList("vijay","Ajay","Vijay","Satshil","darpna");
  for(String i :a) {
  boolean f = TestLength(a,(r)->i.length()>=5);
  System.out.println(i+" "+f);
	}

	private static boolean TestLength(List<String> a, Predicate<List<String>> p1) {
		// TODO Auto-generated method stub
		return p1.test(a);
	}
}
