package facade;

public class Flight {
	
	private String initLoc, dest;
	private Airline airline;
	
	public Flight(String initLoc, String dest, Airline airline) {
		this.initLoc = initLoc;
		this.dest = dest;
		this.airline = airline;
	}

	public String getInitLoc() {
		return initLoc;
	}

	public void setInitLoc(String initLoc) {
		this.initLoc = initLoc;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public Airline getAirline() {
		return airline;
	}

	public void setAirline(Airline airline) {
		this.airline = airline;
	}

	@Override
	public String toString() {
		return "Flight [initLoc=" + initLoc + ", dest=" + dest + ", airline=" + airline + "]";
	}
	
	
}
