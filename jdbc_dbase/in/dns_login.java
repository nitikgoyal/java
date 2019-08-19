package jdbc_dbase.in;
import java.sql.*;  
public class dns_login {

public static void main(String ar[]){  
 try{  
   String url="jdbc:odbc:mydsn";  
   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  
   Connection c=DriverManager.getConnection(url);  
   Statement st=c.createStatement();  
   ResultSet rs=st.executeQuery("select * from student");  
    
   while(rs.next()){  
    System.out.println(rs.getString(1));  
   }  
  
}catch(Exception ee){System.out.println(ee);}  
  
}}  