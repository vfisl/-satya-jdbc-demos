import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertDemo {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/trialdb";
		String username="root";
		String password="root";
		Connection connnection=null;
		Statement statement=null;
		Scanner sc=null;
		try {
			 connnection=DriverManager.getConnection(url,username,password);
		 statement=connnection.createStatement();
//			String sql="insert into policy values('jeevan',10,'life',2000)";
//			int result=statement.executeUpdate(sql);
//			System.out.println("inserted "+result);
		   sc=new Scanner(System.in);
		 for(int i=0;i<4;i++)
		 {
			 System.out.println("Enter policy name");
			 String name=sc.next();
			 System.out.println("Enter policy id");
			 int policyId=sc.nextInt();
			 System.out.println("Enter policy type");
			 String policyType=sc.next();
			 System.out.println("Enter policy premium");
			 float premium=sc.nextFloat();
			 String sql="insert into policy values('"+name+"',"+policyId+",'"+policyType+"',"+premium+")";
				int result=statement.executeUpdate(sql);
				System.out.println("inserted "+result);
		 }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(connnection!=null)
					connnection.close();
				if(statement!=null)
					statement.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
	}
}
