package bridelabz.Employeepayroll;
    import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class EmployeeConfig {

	    public Connection getConfig(){
	        String URL_JD = "jdbc:mysql://localhost:3306/Employee_payroll_service_mysql";
	        String USER_NAME = "root";
	        String PASSWORD = "Alankritha@12";
	        Connection connection = null;
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            System.out.println("Drivers loaded!!");
	            connection = DriverManager.getConnection(URL_JD,USER_NAME,PASSWORD);
	            System.out.println("connection Established!!");
	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        }
	        return connection;
	    }
	}

