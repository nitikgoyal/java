package jdbc_dbase.in;
import java.sql.*;

public class Delete_prepared 
{
   public static void main(String args[]){
 try 
 {
   Class.forName("oracle.jdbc.driver.OracleDriver");

   Connection con=DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:xe","NTK_GOYAL","goyal");
   PreparedStatement stmt=con.prepareStatement("delete from stud where roll=?");
   stmt.setInt(1,1528);

   int i=stmt.executeUpdate();
   System.out.println(i+" records deleted");

   con.close();

} 
 catch(Exception e)
    {
	 System.out.println(e);
	 }

}
}