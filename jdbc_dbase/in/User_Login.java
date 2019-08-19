package jdbc_dbase.in;
import java.sql.*;
import java.util.*;

public class User_Login 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter username");
		String user=sc.next();
		System.out.print("Enter password");
		String pass=sc.next();
		Insert_form_ecllipse isc =new Insert_form_ecllipse();
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","NTK_GOYAL","goyal");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select password, user_name from student1 where user_name='"+user+"'");
				while(rs.next())
			{
				String username=rs.getString("user_name");
				String password=rs.getString("password");
				//if(rs.getString(2).equals(user))
				if(username.equals(user))
				{
					//if(rs.getString(1).equals(pass))
					if(password.equals(pass))
						
						{
						System.out.println("welcome "+user );
						
						}
					else
						{
						System.out.println("try again");
						}
				}
			/*else
				{System.out.println("username not valid");}*/
			con.close();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
