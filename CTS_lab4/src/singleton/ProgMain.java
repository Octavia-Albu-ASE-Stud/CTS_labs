package singleton;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//lazy initialization
				DatabaseLazyInitialization db1=DatabaseLazyInitialization.getInstance();	//creates the instance
				DatabaseLazyInitialization db2=DatabaseLazyInitialization.getInstance(); //checks if instance is null (no)-> just returns the instance

				//early initialization
				DatabaseEarlyInitialization d3;
				DatabaseEarlyInitialization.getInstance();
	}

}
