package Service;

import java.sql.Connection;
import java.sql.Statement;

import Connection.DbConnection;

public class DeleteBookingService {
	public boolean deleteBooking(String id) {
		
		try {
			Connection con = DbConnection.getDBConnection();  	
			Statement st = con.createStatement();
			
			String query = "Delete  From roombook Where Book_ID = '"+id+"'";
			st.executeUpdate(query);
			
		return true;
		
	}catch(Exception e) {
		System.out.println(e);
	}
		return false;
}
}
