package com.handlinglargeobject;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CharacterLargeObject {
	
	public int StoreFile(Student s) throws SQLException, IOException {
		// TODO Auto-generated method stub
		Connection con=DBConnection.createcon();
		PreparedStatement ps=con.prepareStatement("insert into studenttable "+ "(id,name,Article) VALUES "+"(?,?,?)"); 
	 
		ps.setInt(1, s.getId());	
		ps.setString(2,s.getName());
		ps.setString(3, s.getArticle());
		
		
		File f=new File(s.getArticle());
		System.out.println(f);
		FileReader fr=new FileReader(f); 
		System.out.println(fr);
		ps.setClob(3, fr);
		ps.setCharacterStream(3,fr,(int)f.length()); 
		int i=ps.executeUpdate();        
		return i;
		}
	
	public void RetreiveFile(Student s) throws  SQLException, IOException {
		Connection con=DBConnection.createcon();
		PreparedStatement ps = con.prepareStatement("select * from studenttable");
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {// now on 1st row

			 Clob c = rs.getClob("Article");
		    System.out.println(c);
		    
		    Reader r = c.getCharacterStream();
		    char cbuf[] = new char[r.read()];
		    r.read(cbuf);       
			FileWriter fw=new FileWriter(s.getArticle());  
			System.out.println(fw);
			int i;  
			while((i=r.read())!=-1) 
				//System.out.println(i);
			fw.write((char)i);  
			              
			fw.close();  
			              
		} 
	}

}
