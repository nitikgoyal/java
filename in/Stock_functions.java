package ntk_goyal.in;
import java.sql.*;
import java.util.*;

public class Stock_functions 
{
	 public Stock_functions()
	 {
		 String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
         String user = "NTK_GOYAL"; 
         String pass = "goyal";
         Scanner k = new Scanner(System.in);
     
     System.out.println("Enter Item Code"); 
     int  item_code = k.nextInt(); 
     
     System.out.println("Enter Item Name"); 
     String Name = k.next(); 
     
     System.out.println("Enter Units"); 
     int Units =  k.nextInt(); 
      
     System.out.println("Enter Price per unit");
     double price =k.nextDouble();
     
     System.out.println("Date Of Manufacture");
     String dateManu=k.next();
     
     System.out.println("Date Of Expiry");
     String dateexp =k.next();
     
     
     
     
     String sql = "insert into stock values('"+item_code+"','"+Name+"',"+Units+","+price+",'"+dateManu+"','"+dateexp+"')"; 
     Connection con=null; 
     try
     { 
         DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
         con = DriverManager.getConnection(url,user,pass);
         Statement st = con.createStatement(); 
         int m = st.executeUpdate(sql); 
         if (m == 1) 
             System.out.println("inserted successfully : "+sql); 
         else
             System.out.println("insertion failed"); 
         con.close(); 
     } 
     catch(Exception ex) 
     { 
         System.err.println(ex); 
     } 
 } 
	 }

