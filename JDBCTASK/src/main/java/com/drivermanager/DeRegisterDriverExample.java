package com.drivermanager;

import java.sql.Driver;
import java.sql.DriverAction;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DeRegisterDriverExample {

	 //public static synchronized void deregisterDriver(Driver driver):->
	//is used to deregister the given driver (drop the driver from the list) with DriverManager. 
	//If the given driver has been removed from the list, then no action is performed by the method.
	
    public static void main(String[] args) throws SQLException {
        Driver driver = new com.mysql.cj.jdbc.Driver();
        DriverManager.registerDriver(driver);
        System.out.println("Driver successfully registered !");

        DeRegisterDriver deRegisterDriver = new DeRegisterDriver(driver);
        deRegisterDriver.deregister();
    }
}

class DeRegisterDriver implements DriverAction {

    private Driver driver;
    DeRegisterDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public void deregister() {
        try {
            DriverManager.deregisterDriver(driver);
            System.out.println("DeregisterDriver successfully");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


}
