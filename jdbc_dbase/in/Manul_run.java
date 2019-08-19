package ntk_goyal.in;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Manul_run 
{
	public Manul_run() throws Exception 
	 {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the query");
		String qry=scan.nextLine();
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:xe","NTK_GOYAL","goyal");
		
		Statement st = con.createStatement();
		
		boolean flag=st.execute(qry);
		if(flag==true)
		{
			ResultSet rs=st.getResultSet();
			//System.out.println("Item_code     Name       Units      Price         Manu.Date              Exp.Date");
			while(rs.next())
			{
				//System.out.println(rs.getInt(1)+"        "+rs.getString(2)+"       "+rs.getInt(3)+"        "+rs.getDouble(4)+"        "+rs.getString(5)+"       "+rs.getString(6));
				System.out.println("Item_code = "+rs.getInt(1)+"      Name = "+rs.getString(2)+"     Units = "+rs.getInt(3)+"      Price = "+rs.getDouble(4)+"      Manu.Date = "+rs.getString(5)+"     Exp.Date = "+rs.getString(6));
			}
			rs.close();
		}
		else
		{
			int rowcount=st.getUpdateCount();
			System.out.println(" "+rowcount);
			
		}
		st.close();
		con.close();
	 }
}
