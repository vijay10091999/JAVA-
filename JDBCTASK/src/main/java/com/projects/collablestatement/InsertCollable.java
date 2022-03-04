package com.projects.collablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

/*
 USE `vijay1`;
DROP procedure IF EXISTS `Employee`;

USE `vijay1`;
DROP procedure IF EXISTS `vijay1`.`Employee`;
;

DELIMITER $$
USE `vijay1`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `Employee`(IN Eid VARCHAR(4000) ,
 IN Ename VARCHAR(4000) ,
 IN Eemail VARCHAR(4000) ,
 IN Ecountry VARCHAR(4000) ,
 IN Epassword VARCHAR(4000) ,
 OUT out_result VARCHAR(4000))
BEGIN
  DECLARE EXIT HANDLER FOR SQLEXCEPTION BEGIN 
  set out_result = 'FALSE';
  ROLLBACK;
  END;
  INSERT INTO EMP (EMPID, NAME, EMAIL, COUNTRY,PASSWORD) 
  values (Eid,Ename,Eemail,Ecountry,Epassword);
  commit;
  
  set out_result = 'TRUE';
  
END$$

DELIMITER ;
;


 */

/*As you can see that Employee procedure is expecting inputs from the caller 
that will be inserted into the Emp table.

If insert statement works fine, it’s returning TRUE and incase of any exception it’s returning FALSE.
*/

/* Let’s see how we can use CallableStatement to execute Employee stored procedure to insert employee data.
 * We are reading user input to be stored in Emp table.
 * The only thing different from PreparedStatement is the creation of CallableStatement through “{call Employee(?,?,?,?,?,?)}” 
 * and setting OUT parameter with CallableStatement registerOutParameter() method.
   We have to register the OUT parameter before executing the stored procedure. 
   Once the stored procedure is executed, we can use CallableStatement getXXX() method to get the OUT object data. 
   Notice that while registering the OUT parameter, we need to specify the type of OUT parameter through java.sql.Types.
*/


/* Notice that second execution failed because name passed is bigger than the column size.
 * We are consuming the exception in the stored procedure and returning false in this case.*/

public class InsertCollable {
	public static void main(String[] args) {
	//Read User Inputs
	
		Connection con = null;
		CallableStatement stmt = null;
			Scanner input = new Scanner(System.in);
			System.out.println("Enter Employee ID :");
			int id = Integer.parseInt(input.nextLine());
			System.out.println("Enter Employee Name:");
			String name = input.nextLine();
			System.out.println("Enter Employee Email:");
			String email = input.nextLine();
			System.out.println("Enter Employee Country:");
			String country = input.nextLine();
			System.out.println("Enter Employee Password:");
			String password = input.nextLine();
			
			try{
			    con = DBConnection.createcon();
				stmt = con.prepareCall("{call Employee(?,?,?,?,?,?)}");
				stmt.setInt(1, id);
				stmt.setString(2, name);
				stmt.setString(3, email);
				stmt.setString(4, country);
				stmt.setString(5, password);
				
				//register the OUT parameter before calling the stored procedure
				stmt.registerOutParameter(6, java.sql.Types.VARCHAR);
				
				stmt.executeUpdate();
				
				//read the OUT parameter now
				String result = stmt.getString(6);
				
				System.out.println("Employee Record Save Success::"+result);
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
