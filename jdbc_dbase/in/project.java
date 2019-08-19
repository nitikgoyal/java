package ntk_goyal.in;

import java.sql.*;
import java.util.*;
import java.io.*;

class SignUp{
	Connection  conn;
	Statement stmt;
	String name,email,pass,branch;
	String query;
	Scanner sc=new Scanner(System.in);
	FileWriter fw = null;
	SignUp()
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","NTK_GOYAL","goyal");
			stmt=conn.createStatement();
			System.out.println("Connection Complete");
		}
		catch(Exception e) {
			e.printStackTrace();	
		}
	}
	void getDetails() throws SQLException,IOException {
		System.out.println("---------------------------------------------------");
		System.out.println("Enter Name");
		name = sc.nextLine();
		System.out.println("---------------------------------------------------");
		System.out.println("Enter Email");
		email = sc.next();
		System.out.println("---------------------------------------------------");
		System.out.println("Enter Password");
		pass = sc.next();
		System.out.println("---------------------------------------------------");
		System.out.println("Enter Branch");
		branch=sc.next();
		System.out.println("---------------------------------------------------");
		query = String.format("insert into userdetails1 values('%s','%s','%s','%s')",name,email,pass,branch);
		stmt.execute(query);
		System.out.println("Please again Verify Mail and Password");
		Login in=new Login();
		in.input();
	}
}

class Login extends SignUp{
	int k=0;

	public void input() {
		try {
		System.out.println("---------------------------------------------------");
		System.out.println("Enter Email");
		email=sc.next();
		System.out.println("---------------------------------------------------");
		System.out.println("Enter Password");
		pass=sc.next();
		query = String.format("select * from userdetails1");
		ResultSet pointer= (ResultSet) stmt.executeQuery(query);

		while(pointer.next()) {
			if(email.equals(pointer.getString(2))&&pass.equals(pointer.getString(3))) {
				k=1;	
				break;
			}
			else {
				continue;
		}}
		if(k==1)
		{
			System.out.println("Login Successful :) \n");
			System.out.println("===================================================");
			System.out.println("Please choose the option which u want to perform");
			System.out.println("Press 1 :-  Insert Data");
			System.out.println("Press 2 :-  Delete Data");
			System.out.println("press 3 :-  View Data");
			System.out.println("Press 4 :-  If u want to run commands manually....");
			int opt =sc.nextInt();
			System.out.println("---------------------------------------------------");
			switch(opt) 
			{
			case 1 : Stock_functions f=new Stock_functions();
			break;
			case 2 : Delete_func df =new Delete_func();
			break;
			case 3:  View_fxn vf=new View_fxn();
			break;
			case 4:  Manul_run mr=new Manul_run();
			break;
			default: System.out.println("Wrong Input");
			}
		}
		
		else {
			System.out.println("Email Or Password Is Incorrect... ");
		    System.out.println("  :(  Please try again");
		}
	
	}catch(Exception e)
	{
		System.out.println(e);
	}
	}
}
public class project 
{
	public static void main(String[] args) throws SQLException, IOException {
		Login log = new Login();
		Scanner s = new Scanner(System.in);
		System.out.println("If you want to signup press 1");
		System.out.println( "already!!! have account for login press 2...");
		int a = s.nextInt();
		
		switch(a) {
		case 1 : log.getDetails();
		break;
		case 2 : log.input();
		break;
		default: System.out.println("Wrong Input");

		}
	}
}
