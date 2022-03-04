package com.file;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class FileHandle {
	
	public static void main(String[] args) throws Exception {
		
        
		 FileWriter fw=new FileWriter("C:\\Users\\Sonali\\Desktop\\vijay\\Learnwith Durgesh\\Search Application\\test.txt"); 
		 BufferedWriter bw = new BufferedWriter(fw);
         bw.write("1");  
         bw.newLine();
         bw.write("2");    
         bw.close();  
         
		
	       Operations.Reader();
		//System.out.println(value);
		
		
	}

	
}
