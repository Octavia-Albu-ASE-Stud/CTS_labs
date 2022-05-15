package facade;

public class Facade {

	public static void reservation(String initLocation, String destination ) {
		Airline company = new Airline("CTS flights");
		Flight toGo = company.flightBooking("Cluj", "Bucharest");
		Flight back = company.flightBooking("Bucharest", "Cluj");
		
		Hotel hotel = new Hotel("CTS Hotel");
		hotel.roomBooking("Bucharest");
		
		
		
	}
}
