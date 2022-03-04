
package com.java8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;
import java.util.Map.Entry;




public class LambdaExpExample implements FunctionalServices{ // fifth method : implementing directly to main class
	
	static int SquareOf(int n1) { // BruteForceMethods
		return n1 * n1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Square of a number " + SquareOf(10)); // first Way BruteForce Method way
		System.out.println("Square of a number " + FunctionalServices.square(19));// Second Way Simple Interface usage were data is not hidden
		int f1 = new justforfun().SquareOfMethod(20); // Third Way of making a child class implementing functionalservices interface
		System.out.println("Sqaure  of method " + f1);
		FunctionalServices o1 = new FunctionalServices() { // Fourth way is to make anonymous 
			
			@Override
			public int SquareOfMethod(int n1) {
				// TODO Auto-generated method stub
				return n1*n1;
			}
		};
		System.out.println("Sqaure of method " + o1.SquareOfMethod(56));
		System.out.println("Square of a number " + new LambdaExpExample().SquareOfMethod(f1)); // fifth method : implementing directly to main class
		
		
		//****************** Using LAMBDA EXPRESSION**********************
		/* No name, no modifier, no return type --> Three parameters
		 * Example public int SquareOfMethod(int n1) 
		 * public - modifier, int - return type, SquareOfMethod(int n1) - name
		 * 
		 * all this is not present for lambda expression method
		 */
		
		FunctionalServices f = (n1) -> (n1*n1);// this is lambda expression , it will take n1 and return n1 * n1 to f, 
		// lambda expression is using only abstract methods.
		// line 49 is used for single statement.
		
		System.out.println(f.SquareOfMethod(20));
		// to reduce whole override likhavat part then we use lambdaexpression usingf abstract method
		
		FunctionalServices fw = (n1) ->{ System.out.println(n1+n1); return (n1*n1); }; // to use multiple statement in lambda expression as well as to use return keyword
		System.out.println(fw.SquareOfMethod(6));
		
		
		
		
		// ***** For Each by LAMBDA EXPRESSION *********
			// Used only on objects like arraylist, hashmap, etc
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		for(int i= 0; i<=5; i++) {
			num.add(i);
		}
		num.forEach( n1 -> System.out.println(f.SquareOfMethod(n1)));
			
		
		
		// ***** THREAD USING LAMBDA EXPRESSION *********
		Runnable r1=()->System.out.println("I am Runnable thread "+ Thread.currentThread().getId() );
		Thread t1 = new Thread(r1);
		t1.start();
		
		
		// ***** COMPARATOR USING LAMBDA EXPRESSION *********
		/* TreeMap<Computer12, Integer> Comp = new TreeMap<>();
		Computer12 Dell = new Computer12("Dell", 30000);
		Computer12 HP = new Computer12("HP", 80000);
		Computer12 Lenevo = new Computer12("Lenevo", 77890);
		Computer12 Asus = new Computer12("Asus", 23500);
		Lenevo.setCid(109);
		Dell.setCid(110);
		Asus.setCid(108);
		HP.setCid(101);
		Comp.put(Lenevo, Lenevo.getCid());
		Comp.put(Dell, Dell.getCid());
		Comp.put(Asus, Asus.getCid());
		Comp.put(HP, HP.getCid());*/
		
				
		ArrayList<Person1> p = new ArrayList<Person1>();
        p.add(new Person1(27,"Ajay"));
        p.add(new Person1(23,"Sneha"));
        p.add(new Person1(37,"Simran"));
        p.add(new Person1(45, "Aaliya"));
        p.add(new Person1(29, "Ajay"));
        p.add(new Person1(22, "Sneha"));
		
		p.forEach(w1 -> System.out.println(w1));
        System.out.println("Sort by Id using lambda");                        // SortByID using LAMBDA EXPRESSION
    Collections.sort(p,(l1,l2) -> {return l2.id - l1.id;});// For descending
    p.forEach(w1 -> System.out.println(w1));
    
    System.out.println("Sort by Id using lambda Descending order ");                        // SortByID using LAMBDA EXPRESSION
    Collections.sort(p,(l1,l2) -> {return l2.id - l1.id;});// For descending
    p.forEach(w1 -> System.out.println(w1));
   
		
		
		
	}

	@Override
	public int SquareOfMethod(int n1) { // fifth method : implementing directly to main class
		// TODO Auto-generated method stub
		return n1*n1;
	}
	
}