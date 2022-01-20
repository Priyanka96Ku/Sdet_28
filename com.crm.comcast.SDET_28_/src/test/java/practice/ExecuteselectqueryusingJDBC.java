package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ExecuteselectqueryusingJDBC {

	public static void main(String[] args) throws SQLException {
	
	//Register the driver
	 Driver driverRef = new Driver();
	
	DriverManager.registerDriver(driverRef);
	
	//Establish the database connection
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo", "root", "root");
	
	 Statement state = conn.createStatement();
	int result=state.executeUpdate("insert into student values(400,'Tom','computer');");
			if (result==1){
				System.out.println("Database has been updated");
			
			}
			else System.out.println("Data has not been updated");
			
			//close the database connection
			conn.close();
			
			
}


}