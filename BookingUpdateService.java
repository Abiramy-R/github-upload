package Service;

import java.sql.Connection;
import java.sql.Statement;

import Connection.DbConnection;
import Entities.Bookings;

public class BookingUpdateService {
	public boolean updateBooking(Bookings book) {
		
		try {
			Connection con = DbConnection.getDBConnection();  	
			Statement st = con.createStatement();
			
			String query = "Update roombook Set name = '"+book.getName()+"' , email = '"+book.getEmail()+"', Room = '"+book.getRooms()+"', No_of_rooms = '"+book.getNumber1()+"', No_of_guests =  '"+book.getNumber2()+"', No_of_children =  '"+book.getNumber3()+"', Date = '"+book.getDate()+"' Where Book_ID = '"+book.getBook_ID()+"' "; 
			st.executeQuery(query);
			
		}
		catch (Exception e) {
			System.out.println(e);
			
		}
		return false;
		
	}
}
