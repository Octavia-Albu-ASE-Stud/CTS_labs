package facade;

public class Airline {

	public String name;
	public float rating;
	
	public Airline(String name) {
		this.name = name;
	}

	public Airline(String name, float rating) {
		super();
		this.name = name;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Airline [name=" + name + ", rating=" + rating + "]";
	}
	
	public Flight flightBooking(String initLoc, String dest) {
		Flight flight = new Flight(initLoc, dest, this);
		return flight;
	}
}
