package com.handlinglargeobject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.handlinglargeobject.Student;


/* 
CREATE TABLE  STUDENTTABLE 
   (      id int NOT NULL,      
          name varchar(255) NOT NULL ,
         Article LONGTEXT NOT NULL,
          image LONGBLOB  
   ) ;
 */

public class BinaryLargeObject {


	public int StoreImage(Student s) throws SQLException, IOException {
		// TODO Auto-generated method stub
		Connection con=DBConnection.createcon();
		PreparedStatement ps=con.prepareStatement("insert into studenttable "+ "(id,name,image) VALUES "+"(?,?,?)"); 
		ps.setInt(1, s.getId());	
		ps.setString(2,s.getName());
		ps.setString(3, s.getImage());
	 
		FileInputStream fin=new FileInputStream(s.getImage());  
		ps.setBinaryStream(3,fin,fin.available());  
		int i=ps.executeUpdate();  
		          
		return i;
	
		}

	public void RetreiveImage(Student s) throws  SQLException, IOException {
		Connection con=DBConnection.createcon();
		PreparedStatement ps = con.prepareStatement("select * from studenttable");
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {// now on 1st row

			Blob b = rs.getBlob(2);// 2 means 2nd column data
			System.out.println(b);
			byte barr[] = b.getBytes(1, (int) b.length());// 1 means first image

			FileOutputStream fout = new FileOutputStream(s.getImage());
			fout.write(barr);

			fout.close();
		} // end of if
	}  
}
