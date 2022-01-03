package Service;

import java.sql.Connection;
import java.sql.Statement;

import Connection.DbConnection;
import Entities.Bookings;

public class BookingService {

	public boolean roomBooking(Bookings bookings) {
		
		try {
			Connection con = DbConnection.getDBConnection();  	
			Statement st = con.createStatement();
			int i = st.executeUpdate("Insert into roombook (name,email,Room,No_of_rooms,No_of_guests,No_of_children,Date) VALUES ( '"+bookings.getName()+"','"+bookings.getEmail()+"','"+bookings.getRooms()+"','"+bookings.getNumber1()+"','"+bookings.getNumber2()+"','"+bookings.getNumber3()+"','"+bookings.getDate()+"')");
			
			if(i>0) {
				return true;
			} 
			
		}catch(Exception e) {
			
			System.out.println(e);
			
		}
		
		
		
		
		
		
		return false;
		
	}
}
