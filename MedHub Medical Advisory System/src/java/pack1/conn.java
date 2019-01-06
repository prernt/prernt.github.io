/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

/**
 *
 * @author hp 15-r202TX
 */
import java.sql.*;
public class conn {
    public Connection con;
	public conn() throws InstantiationException, IllegalAccessException
	{
		try
		{
			 Class.forName("com.mysql.jdbc.Driver").newInstance();
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","root");
			 System.out.println("connected");
		}
		catch(SQLException e) 
		{
			 System.out.println(e);
		}
                catch(ClassNotFoundException e)
                {
                    System.out.println(e);
                }
	}

	public static void main(String args[]) throws InstantiationException, IllegalAccessException
	{
        conn con;
       con=  new conn();
	}
}
