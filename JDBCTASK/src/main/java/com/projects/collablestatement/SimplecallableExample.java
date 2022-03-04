package com.projects.collablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Simple CallableStatement Example
 * @author Ramesh Fadatare
 *
 *
 *Procedure for SimpleCallCallable
 *
 *  DELIMITER $$
	USE `vijay1`$$
	CREATE PROCEDURE `student` ()
	BEGIN
	select * from student;
	END$$
	DELIMITER ;
 *
 */
public class SimplecallableExample {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/vijay1?useSSL=false";
        String username = "root";
        String password = "Lufa@7917";
        String sql = "call student()";

        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password); 
        		CallableStatement stmt = conn.prepareCall(sql); 
        		ResultSet rs = stmt.executeQuery();) {

            while (rs.next()) {
                System.out.println("ID = " + rs.getInt(1) + ", NAME = " + rs.getString(2) + ", Email = " +
                    rs.getString(3) + ", Country = " + rs.getString(4) + ", Password = " + rs.getString(5));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
