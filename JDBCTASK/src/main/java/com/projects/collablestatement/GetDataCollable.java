package com.projects.collablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

/*USE `vijay1`;
DROP procedure IF EXISTS `GetEmployee`;

DELIMITER $$
USE `vijay1`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `GetEmployee`(IN Eid VARCHAR(4000),
 OUT Ename VARCHAR(4000),
 OUT Eemail VARCHAR(4000),
 OUT Ecountry VARCHAR(4000),
 OUT Epassword VARCHAR(4000),
BEGIN

  SELECT EMPID, NAME, EMAIL, COUNTRY,PASSWORD
  INTO Eid, Ename, Eemail,Ecountry,Epassword
  FROM EMP
  WHERE EMPID = Eid;
  
END;$$

DELIMITER ;

 */


/* let’s write a stored procedure to get the employee data by id. 
 *  User will enter the employee id and program will display the employee information./
 */

public class GetDataCollable {

	public static void main(String[] args) {
		Connection con = null;
		CallableStatement stmt = null;
		
		//Read User Inputs
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Employee ID :");
		int id = Integer.parseInt(input.nextLine());
		
		try{
			con = DBConnection.createcon();
			stmt = con.prepareCall("{call GetEmployee(?,?,?,?,?)}");
			stmt.setInt(1, id);
			
			//register the OUT parameter before calling the stored procedure
			stmt.registerOutParameter(2, java.sql.Types.VARCHAR);
			stmt.registerOutParameter(3, java.sql.Types.VARCHAR);
			stmt.registerOutParameter(4, java.sql.Types.VARCHAR);
			stmt.registerOutParameter(5, java.sql.Types.VARCHAR);
			
			stmt.execute();
			
			//read the OUT parameter now
			String name = stmt.getString(2);
			String email = stmt.getString(3);
			String country = stmt.getString(4);
			String password = stmt.getString(5);
			
			if(name !=null){
			System.out.println("Employee Name="+name+",Role="+email+",City="+country+",Country="+password);
			}else{
				System.out.println("Employee Not Found with ID"+id);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				stmt.close();
				con.close();
				input.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
