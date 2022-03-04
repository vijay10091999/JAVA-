package com.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Operations {
	
	public static void Reader() throws IOException{

	FileReader fr = new FileReader("C:\\Users\\Sonali\\Desktop\\vijay\\Learnwith Durgesh\\Search Application\\test.txt");

	BufferedReader bu = new BufferedReader(fr);
	
	String s="";
	List<String> g = null;
	String[]  n = new String[2];
	while ((s = bu.readLine()) != null) {
		s= s + " " + bu.readLine(); // 1 2
	    n=s.split("\\s"); // [1,2] array
	}
	System.out.println(n[0] + " " + n[1]);


}
}



