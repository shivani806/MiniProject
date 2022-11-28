package Driver;

import java.sql.Connection;
import java.sql.DriverManager;

public class DriverCommen {
	public Connection driverload(){
		Connection connection=null;
		{
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","12345");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
	}

}
