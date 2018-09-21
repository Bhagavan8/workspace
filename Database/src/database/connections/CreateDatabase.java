package database.connections;

import java.sql.*;

public class CreateDatabase {
	public static void main(String[] args) {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","smart");
			Statement st=con.createStatement();
			String sql="select *from Student";
			ResultSet rs=st.executeQuery(sql);
			while(rs.next())
				System.out.println(rs.getInt(1)+ " "+rs.getString(2));
				con.close();
			}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
