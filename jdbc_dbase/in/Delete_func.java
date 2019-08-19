package ntk_goyal.in;
import java.util.*;
import java.sql.*;
import java.util.Scanner;
public class Delete_func 
{
	public Delete_func()
	 {
		 String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
        String user = "NTK_GOYAL"; 
        String pass = "goyal";
  
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Product code whose data u wnat to delete....");
        int item_code= scan.nextInt();
        
        String sql = "delete from stock where item_code="+item_code+"";
        Connection con=null; 
        try
        { 
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            con = DriverManager.getConnection(url,user,pass);
            Statement st = con.createStatement(); 
            int m = st.executeUpdate(sql); 
            if (m == 1) 
                System.out.println("Deleted successfully : "+sql); 
            else
                System.out.println("Deleted failed"); 
            con.close(); 
        } 
        catch(Exception ex) 
        { 
            System.err.println(ex); 
        } 
    } 
   	 

	
	 }

