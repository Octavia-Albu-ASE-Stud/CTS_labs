package singleton;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Database d1 = new Database.getInstance();
		Database d2 = new Database.getInstance();
	}

}
