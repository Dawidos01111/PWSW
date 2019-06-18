package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Database
{
	private Connection conn;
	private Statement statement;
	public Connection Connector() throws SQLException
	{
		if(conn == null)
		{
			String url = "jdbc:mysql://localhost/";
			String dbName = "event";
			String driver = "com.mysql.jdbc.Driver";
			String userName = "root";
			String password = "";
			
			try 
			{
			Class.forName(driver);
			this.conn = (Connection)DriverManager.getConnection(url+dbName, userName, password);
			System.out.println("Connected!");
			
			} catch (ClassNotFoundException | SQLException sqle)
			{
				System.out.println("Connected failed!");
			}
			
		}
		return conn;
		
	}
	
	
	public Statement getStatement()
	{
		return statement;
	}
	public void setStatement(Statement statement)
	{
		this.statement = statement;
	}
	
	public boolean isLogin(String login, String password) throws SQLException
	 {
		 java.sql.PreparedStatement preparedStatement = null;
		 ResultSet resultSet = null;
		 
		 String query = "select * from registration where login like ? and password like ?";
		 try
		 {
			 preparedStatement = conn.prepareStatement(query);
			 preparedStatement.setString(1, login);
			 preparedStatement.setString(2, password);
			 
			 resultSet = preparedStatement.executeQuery();
			 
			 if(resultSet.next())
			 {
				 return true;
			 }else
			 {
				 return false;
			 }
		 }catch(Exception e)
		 {
			 return false;
		 }finally
		 {
		}
		 
		
	 }
	
	public void isRegistration(String name, String surname, String login, String mail, String password, String dateRegistration, String permission ) throws SQLException
	{
		 try
		 {
			
			 String insert = "insert into registration(ID, firstName, surName, login, mail, password, dateRegistration, permissions) values(NULL, ?, ?, ?, ?, ?, ?, ?)";
			
			 java.sql.PreparedStatement preparedStatement = conn.prepareStatement(insert);
			 preparedStatement = conn.prepareStatement(insert);
			 preparedStatement.setString(1, name);
			 preparedStatement.setString(2, surname);
			 preparedStatement.setString(3, login);
			 preparedStatement.setString(4, mail);
			 preparedStatement.setString(5, password);
			 preparedStatement.setString(6, dateRegistration);
			 preparedStatement.setString(7, permission);
			 preparedStatement.execute();
			 preparedStatement.close();
			 System.out.println("Dodano do bazy");
			
		 }catch(Exception e)
		 {
			 System.out.println(e); 
			 System.out.println("tu jest b³¹d");
		 }finally
		 {
		// 
		 }
	}
	public boolean isInRegistration(String login, String mail) throws SQLException
	{ 
	
		ResultSet resultSet = null;
		 try
		 {
			 String isIn = "select * from registration where login like ? or mail like ?";
			 java.sql.PreparedStatement prepStatement = conn.prepareStatement(isIn);
			 prepStatement = conn.prepareStatement(isIn);
			 prepStatement.setString(1, login);
			 prepStatement.setString(2, mail);
			 prepStatement.execute();
			 resultSet = prepStatement.executeQuery();
			 if(resultSet.next())
			 {
				 return true;
			 }else
			 {
				 return false;
			 }
		 }catch(Exception e)
		 {
			 return false;
		 }finally
		 {
			//
		}
	 }
	
	public String permissionLog(String login) throws SQLException
	{ 
		String yourPermission = "select permissions from registration where login = ?";
		java.sql.PreparedStatement prepStatement = conn.prepareStatement(yourPermission);
		try
		{   
			 prepStatement = conn.prepareStatement(yourPermission);
			 prepStatement.setString(1, login);
			 prepStatement.execute();
			 ResultSet result = prepStatement.executeQuery();
			
			if (result.next()) {
				String permissions = result.getString(1);
			    return permissions;
			}
	 }catch(Exception e)
	 {
		 System.out.println(e); 
	 }finally
	 {
		prepStatement.close();
		
	}
		return yourPermission;
	}

}


